package com.capstone.jmt.service;

import com.capstone.jmt.data.CustomerLocation;
import com.capstone.jmt.data.CustomerLogin;
import com.capstone.jmt.mapper.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Jabito on 15/02/2017.
 */
@Service("customerService")
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    CustomerMapper customerMapper;

    public List getAllCustomers() {
        logger.info("getAllCustomers");
        List customers = customerMapper.getAllCustomers();
        logger.info("getAllCustomers", customers);
        return customers;
    }

    public CustomerLogin getCustomerLoginById(String id){
        logger.info("getCustomerLoginByUsername");
        CustomerLogin customer = customerMapper.getCustomerLoginById(id);
        logger.info("getCustomerLoginByUsername", customer);
        return customer;
    }

    public CustomerLocation getCustomerLocationById(String id){
        logger.info("getCustomerLocationById");
        CustomerLocation customer = customerMapper.getCustomerLocationById(id);
        logger.info("getCustomerLocationById", customer);
        return customer;
    }

    public void addCustomerLogin(CustomerLogin customer) {
        logger.info("addCustomerLogin");
        customer.setId(UUID.randomUUID().toString());
        Integer ret = customerMapper.addCustomerLogin(customer);
        System.out.println(ret);
    }

    public void updateCustomerLogin(CustomerLogin customer) {
        logger.info("updateCustomerLogin");
        Integer ret = customerMapper.updateCustomerLogin(customer);
        System.out.println(ret);
    }

    public void addCustomerLocation(CustomerLocation customer) {
        logger.info("addCustomerLocation");
        Integer ret = customerMapper.addCustomerLocation(customer);
        System.out.println(ret);
    }

    public void updateCustomerLocation(CustomerLocation customer) {
        logger.info("updateCustomerLocation");
        Integer ret = customerMapper.updateCustomerLocation(customer);
        System.out.println(ret);
    }
}
