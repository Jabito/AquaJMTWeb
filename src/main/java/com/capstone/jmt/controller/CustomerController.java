package com.capstone.jmt.controller;

import com.capstone.jmt.data.CustomerLogin;
import com.capstone.jmt.data.CustomerLocation;
import com.capstone.jmt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jabito on 01/02/2017.
 */
@Controller
@RequestMapping(value="/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getCustomers(Model model){
        List users = customerService.getAllCustomers();
        model.addAttribute("users", users);
        return "main";
    }

    @RequestMapping(value="/customer", method=RequestMethod.GET)
    public ResponseEntity<?> getCustomerById(@RequestParam("id") String id){
        HashMap<String, Object> response = new HashMap<>();
        CustomerLogin customer = customerService.getCustomerLoginById(id);
        response.put("customer", customer);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value="/customer/location", method=RequestMethod.GET)
    public ResponseEntity<?> getCustomerLocationById(@RequestParam("id") String id){
        HashMap<String, Object> response = new HashMap<>();
        CustomerLocation location = customerService.getCustomerLocationById(id);
        response.put("customer", location);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value="addOrUpdateCustomerLogin", method=RequestMethod.POST)
    public ResponseEntity<?> addCustomerLogin(@RequestBody CustomerLogin customer){
        HashMap<String, Object> response = new HashMap<>();

        CustomerLogin existingCustomer = customerService.getCustomerLoginById(customer.getId());
        if(null == existingCustomer) {
            customerService.addCustomerLogin(customer);
            response.put("customer", customer);
            response.put("id", customer.getId());
            response.put("responseCode", 200);
            response.put("reponseDesc", "Successfully Added Customer");
        }else{
            customerService.updateCustomerLogin(customer);
            response.put("customer", customer);
            response.put("id", customer.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Updated Customer");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value="addOrUpdateCustomerLocation", method = RequestMethod.POST)
    public ResponseEntity<?> addOrUpdateCustomerLocation(@RequestBody CustomerLocation customer){
        HashMap<String, Object> response = new HashMap<>();

        CustomerLocation existingCustomerLocation = customerService.getCustomerLocationById(customer.getId());
        if(null == existingCustomerLocation){
            customerService.addCustomerLocation(customer);
            response.put("customer", customer);
            response.put("id", customer.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Added Customer Location.");
        }else{
            customerService.updateCustomerLocation(customer);
            response.put("customer", customer);
            response.put("id", customer.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Updated Customer Location.");
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
