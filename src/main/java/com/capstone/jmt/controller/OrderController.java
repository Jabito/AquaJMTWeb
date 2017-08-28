package com.capstone.jmt.controller;

import com.capstone.jmt.data.OrderContainers;
import com.capstone.jmt.data.OrderInfo;
import com.capstone.jmt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * Created by Jabito on 24/02/2017.
 */
@Controller
@RequestMapping(value="/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/order", method= RequestMethod.GET)
    public ResponseEntity<?> getOrderInfoById(@RequestParam("id") String id){
        HashMap<String, Object> response = new HashMap<>();
        OrderInfo order = orderService.getOrderInfoById(id);
        response.put("order", order);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value="/order/containers", method= RequestMethod.GET)
    public ResponseEntity<?> getOrderContainersById(@RequestParam("id") String id){
        HashMap<String, Object> response = new HashMap<>();
        OrderContainers order = orderService.getOrderContainersById(id);
        response.put("order", order);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value="addOrUpdateOrderInfo", method = RequestMethod.POST)
    public ResponseEntity<?> addOrUpdateOrderInfo(@RequestBody OrderInfo order){
        HashMap<String, Object> response = new HashMap<>();

        OrderInfo existingOrderInfo = orderService.getOrderInfoById(order.getId());
        if(null == existingOrderInfo){
            orderService.addOrderInfo(order);
            response.put("order", order);
            response.put("id", order.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Added Order Info.");
        }else{
            orderService.updateOrderInfo(order);
            response.put("order", order);
            response.put("id", order.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Updated Order Info.");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value="addOrUpdateOrderContainers", method = RequestMethod.POST)
    public ResponseEntity<?> addOrUpdateOrderContainers(@RequestBody OrderContainers order){
        HashMap<String, Object> response = new HashMap<>();

        OrderContainers existingOrderContainers = orderService.getOrderContainersById(order.getId());
        if(null == existingOrderContainers){
            orderService.addOrderContainers(order);
            response.put("order", order);
            response.put("id", order.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Added Order Containers.");
        }else{
            orderService.updateOrderContainers(order);
            response.put("order", order);
            response.put("id", order.getId());
            response.put("responseCode", 200);
            response.put("responseDesc", "Successfully Updated Order Containers.");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
