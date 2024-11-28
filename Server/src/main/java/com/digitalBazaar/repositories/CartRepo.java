package com.digitalBazaar.repositories;


import com.digitalBazaar.entities.Cart;
import com.digitalBazaar.entities.User;
import com.digitalBazaar.payload.CartDto;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CartRepo extends JpaRepository<Cart,Integer> {
   public Cart findByUser(User user);
//   public Cart findByUser_id(Integer Id);
}
