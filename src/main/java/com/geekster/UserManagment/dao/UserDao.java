package com.geekster.UserManagment.dao;

import com.geekster.UserManagment.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserDao {
    ArrayList<User> userList  = new ArrayList<>();

    public boolean save(User usermodel){
        userList.add(usermodel);
        return true;
    }

    public ArrayList<User> getUsers(){
        return userList;
    }

    public boolean updateUserById(int userid , User usermodel){
        for(User userObject : userList){
            if(userid==userObject.getUserId()){
                userObject.setUserId(usermodel.getUserId());
                userObject.setUserName(usermodel.getUserName());
                userObject.setDateOfBirth(usermodel.getDateOfBirth());
                userObject.setEmailId(usermodel.getEmailId());
                userObject.setPhoneNumber(usermodel.getPhoneNumber());
                userObject.setDate(usermodel.getDate());
                userObject.setTime(usermodel.getTime());
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(User user){
        userList.remove((user));
        return true;
    }
}
