package ibmtal.otorepair.business.services;


import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CustomerUpdateDto;
import ibmtal.otorepair.entities.Customer;

public interface CustomerService {
	Result<Customer> addCustomer(Customer customer);
	Result<Customer> updateCustomer(CustomerUpdateDto customerUpdateDto);
}
