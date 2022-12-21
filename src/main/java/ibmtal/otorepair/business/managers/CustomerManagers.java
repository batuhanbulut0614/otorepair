package ibmtal.otorepair.business.managers;


import org.springframework.beans.factory.annotation.Autowired;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CustomerDao;
import ibmtal.otorepair.dtos.CustomerUpdateDto;
import ibmtal.otorepair.entities.Customer;

public class CustomerManagers  implements ibmtal.otorepair.business.services.CustomerService{
	private CustomerDao customerDao;
	@Autowired
	public CustomerManagers(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
    public Result<Customer> addCustomer(Customer customer){
    	Result<Customer> result=new Result<>();
    	if(customer.getName().isEmpty()) {
			result.newError("name","Boş geçilemez");
	    }
		if(customer.getName().length()>30) {
			result.newError("name", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.customerDao.save(customer);
			result.getData().add(customer);
		}
		return result;
    }
    public Result<Customer> updateCustomer(CustomerUpdateDto customerUpdateDto) {
		Result<Customer> result=new Result<>();
		Customer customer=new Customer();
		if(this.customerDao.findById(customerUpdateDto.getId()).isEmpty()) {
			result.newError("id","id numarasına ait Marka Bulunamadı");
		}
		if(result.isSuccess()==true) {
			customer=this.customerDao.findById(customerUpdateDto.getId()).get();
			customer.setName(customerUpdateDto.getName());
			this.customerDao.save(customer);
			result.getData().add(customer);	
		}
		return result;
	}
}
