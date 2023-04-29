package com.geekster.UserManagment.service;

import com.geekster.UserManagment.dao.UserDao;
import com.geekster.UserManagment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserDao userdao;
    public String addNewUser(User usermodel){
        boolean checkPoint = userdao.save(usermodel);

        if(checkPoint){
            return "Added Successfully!!";
        }else{
            return "Not Added Error!!";
        }
    }

    public ArrayList<User> getAllUsers(){
        return userdao.getUsers();
    }

    public User getUserById(int userid){
        ArrayList<User> helperList = getAllUsers();
        User matchingUser = null;
        for(User user : helperList){
            if(user.getUserId() == userid){
                matchingUser = user;
                break;
            }
        }
        return matchingUser;
    }

    public String updateUser(int userid , User usermodel){
        boolean updateStatus = userdao.updateUserById(userid , usermodel);
        if(updateStatus){
            return "User " + userid + " was Updated!!";
        }else{
            return "User " + userid + " does not Exist!!";
        }
    }

    public String deleteUserById(int userid){
        ArrayList<User> helperList = getAllUsers();
        boolean deleteStatus = false;
        for(User user : helperList) {
            if (user.getUserId() == userid) {
                deleteStatus = userdao.deleteUser(user);
                break;
            }
        }
        if(deleteStatus) {
            return "User " + userid + " removed from database!!";
        }else {
            return "User " + userid + " does not Exit!!";
        }
    }

}
