package com.digitalBazaar.services;

import com.digitalBazaar.entities.Cart;
import com.digitalBazaar.payload.CartDto;
import com.digitalBazaar.payload.CartHelp;
import com.digitalBazaar.payload.UserDto;

public interface CartService {

    //Create
    CartDto CreateCart(CartHelp cartHelp);

    //add Product To Cart
    CartDto addProductToCart(CartHelp cartHelp);

    //Get
    CartDto GetCart(String userEmail);

    //delete product

    void RemoveById(Integer ProductId,String userEmail);

    //delete


}
