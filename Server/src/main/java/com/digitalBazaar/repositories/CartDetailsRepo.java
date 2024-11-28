package com.digitalBazaar.repositories;

import com.digitalBazaar.entities.Cart;
import com.digitalBazaar.entities.CartDetalis;
import com.digitalBazaar.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailsRepo extends JpaRepository<CartDetalis,Integer> {
    public void deleteByProductsAndCart(Product product, Cart cart);
    public CartDetalis findByProductsAndCart(Product product, Cart cart);
}
