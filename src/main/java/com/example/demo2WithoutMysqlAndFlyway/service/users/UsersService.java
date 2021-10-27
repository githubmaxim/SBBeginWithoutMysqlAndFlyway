package com.example.demo2WithoutMysqlAndFlyway.service.users;

import com.example.demo2WithoutMysqlAndFlyway.dto.users.UsersDto;

import java.util.List;

/**
 * Interface with method templates for the “DefaultUsersService” class.
 *
 * @author Maxim
 * @version 1.0
 */
public interface UsersService {

//    UsersDto saveUser(UsersDto usersDto) throws ValidationException;
    void saveUser(UsersDto usersDto);

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();


}
