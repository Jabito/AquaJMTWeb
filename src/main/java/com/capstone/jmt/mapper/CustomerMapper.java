package com.capstone.jmt.mapper;


import com.capstone.jmt.data.CustomerLogin;
import com.capstone.jmt.data.CustomerLocation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Jabito on 02/17/2017.
 */
public interface CustomerMapper {

    List getAllCustomers();

    CustomerLogin getCustomerLoginById(@Param("id") String id);

    CustomerLocation getCustomerLocationById(@Param("id") String id);

    Integer addCustomerLogin(@Param("customer") CustomerLogin customer);

    Integer updateCustomerLogin(@Param("customer") CustomerLogin customer);

    Integer addCustomerLocation(@Param("customer") CustomerLocation customer);

    Integer updateCustomerLocation(@Param("customer") CustomerLocation customer);

    String getCustomerNameById(@Param("id") String id);
}
