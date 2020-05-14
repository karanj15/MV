package lk.ijse.service.impl;

import lk.ijse.dto.CustomerDTO;
import lk.ijse.entity.Customer;
import lk.ijse.repository.CustomerRepo;
import lk.ijse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getCid(),customerDTO.getCname(),customerDTO.getEmail(),customerDTO.getPhoneNo());
        customerRepo.save(customer);
    }
}
