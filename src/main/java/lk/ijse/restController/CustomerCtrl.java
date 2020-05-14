package lk.ijse.restController;

import lk.ijse.dto.CustomerDTO;
import lk.ijse.entity.Customer;
import lk.ijse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customers")
public class CustomerCtrl {

    @Autowired
    private CustomerService customerService;


    @PostMapping
    public void addCustomer(@RequestBody CustomerDTO customerDTO){

        System.out.println("change for git hub testing !!!");

        customerService.addCustomer(customerDTO);
    }


}
