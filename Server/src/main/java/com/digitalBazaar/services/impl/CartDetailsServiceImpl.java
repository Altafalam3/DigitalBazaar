package com.digitalBazaar.services.impl;

import com.digitalBazaar.payload.CartDetailDto;
import com.digitalBazaar.payload.CartHelp;
import com.digitalBazaar.repositories.CartDetailsRepo;
import com.digitalBazaar.repositories.CartRepo;
import com.digitalBazaar.repositories.UserRepo;
import com.digitalBazaar.services.CartDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartDetailsServiceImpl implements CartDetailsService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CartRepo cartRepo;




    @Override
    public CartDetailDto addProduct(CartHelp cartHelp) {
        int productId=cartHelp.getProductId();
        int quantity= cartHelp.getQuantity();
        String userEmail= cartHelp.getUserEmail();




        //get user





        return null;
    }
}
