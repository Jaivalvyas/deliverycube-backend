package com.niit.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Cart {
    @Id
    private String email;
    private List<MenuList> menuList;
    private int totalPrice;


    public Cart() {
    }


    public Cart(String email, int restaurantId, List<MenuList> menuList, int totalPrice) {
        this.email = email;

        this.menuList = menuList;
        this.totalPrice = totalPrice;
    }

    public List<MenuList> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuList> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "email='" + email + '\'' +
                ", menuList=" + menuList +
                ", totalPrice=" + totalPrice +
                '}';
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

}
