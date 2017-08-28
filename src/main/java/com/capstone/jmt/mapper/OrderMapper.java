package com.capstone.jmt.mapper;


import com.capstone.jmt.data.OrderContainers;
import com.capstone.jmt.data.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Jabito on 02/17/2017.
 */
public interface OrderMapper {


    OrderInfo getOrderInfoById(@Param("id") String id);

    OrderContainers getOrderContainersById(@Param("id") String id);

    Integer addOrderInfo(@Param("order") OrderInfo order);

    Integer updateOrderInfo(@Param("order") OrderInfo order);

    Integer addOrderContainers(@Param("order") OrderContainers order);

    Integer updateOrderContainers(@Param("order") OrderContainers order);

    List getOrdersByShopId(@Param("shopId") String shopId);

    List getOrdersForToday(@Param("shopId") String shopId);

    List getBottleSales();

    List getLastSevenDays(@Param("shopId") String shopId);
}
