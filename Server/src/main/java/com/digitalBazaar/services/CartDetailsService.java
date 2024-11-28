package com.digitalBazaar.services;

import com.digitalBazaar.payload.CartDetailDto;
import com.digitalBazaar.payload.CartHelp;
import org.springframework.stereotype.Service;

@Service
public interface CartDetailsService {

    //add product
    public CartDetailDto addProduct(CartHelp cartHelp);
}
