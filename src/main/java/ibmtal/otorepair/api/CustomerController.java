package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.services.CustomerService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CustomerUpdateDto;
import ibmtal.otorepair.entities.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	private CustomerService customerService;
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
    @PostMapping("/addCustomer")
    @GetMapping
    public Result<Customer> updateCustomer(@RequestBody CustomerUpdateDto customerUpdateDto){
    	return this.customerService.updateCustomer(customerUpdateDto);
    }
}
