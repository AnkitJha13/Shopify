package com.athena.Athena_Ecommerce.service.interf;

import com.athena.Athena_Ecommerce.dto.LoginRequest;
import com.athena.Athena_Ecommerce.dto.Response;
import com.athena.Athena_Ecommerce.dto.UserDto;
import com.athena.Athena_Ecommerce.entity.User;


public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
