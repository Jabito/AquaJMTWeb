package com.capstone.jmt.mapper;


import com.capstone.jmt.data.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by Jabito on 02/17/2017.
 */
public interface ShopMapper {


    ShopLogin getShopLoginById(@Param("id") String id);

    ShopInfo getShopInfoById(@Param("id") String id);

    ShopLocation getShopLocationById(@Param("id") String id);

    ShopSalesInformation getShopSalesInformationById(@Param("id") String id);

    Integer addShopInfo(@Param("shop") ShopInfo shop);

    Integer updateShopInfo(@Param("shop") ShopInfo shop);

    Integer addShopLogin(@Param("shopUser") ShopLogin shop);

    Integer updateShopLogin(@Param("shopUser") ShopLogin shop);

    Integer addShopLocation(@Param("shop") ShopLocation shop);

    Integer updateShopLocation(@Param("shop") ShopLocation shop);

    Integer addShopSalesInformation(@Param("shop") ShopSalesInformation shop);

    Integer updateShopSalesInformation(@Param("shop") ShopSalesInformation shop);

    ShopLogin loadUserByUsername(@Param("username") String username);

    Double getTotalSalesById(@Param("shopId") String shopId);

    Integer getSalesCount(@Param("shopId") String shopId);

    Integer getTotalRatings(@Param("shopId") String shopId);

    Integer getReviewsCount(@Param("shopId") String shopId);

    String getShopRating(@Param("shopId") String shopId);

    Double getTotalSalesToday(@Param("shopId") String staffOf);

    Integer getInventoryCount(@Param("shopId") String shopId);

    void updateRoundStock(@Param("username") String username, @Param("shopId") String staffOf, @Param("stock") Integer roundStock);

    void updateSlimStock(@Param("username") String username, @Param("shopId") String staffOf, @Param("stock") Integer slimStock);

    void updatePrices(@Param("shop") ShopSalesInformation shop);

}
