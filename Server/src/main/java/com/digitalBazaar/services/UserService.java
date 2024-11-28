package com.digitalBazaar.services;

import com.digitalBazaar.payload.SingIn;
import com.digitalBazaar.payload.UserDto;

public interface UserService {


    UserDto CreateUser(UserDto userDto);

    SingIn SingIn(SingIn singIn);
}
