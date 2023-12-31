package database;

import DAO.User;


import java.util.ArrayList;

public class InMemoryDatabase {

    private ArrayList<User> userDatabase;

    public InMemoryDatabase(){
        this.userDatabase = new ArrayList<>();
    }
/* Adds new user to the in memory database. If not empty.
@param user User Object
return boolean if user successfully added, false if null or not added.
* */
    public boolean addUser(User user){
        if(user !=null){
            //ToDo check if user already exists
            return this.userDatabase.add(user);
        }
        return false;
    }

    public boolean removeUser(int userId) {
        for (User user : this.userDatabase){
            if(user.getId() == userId){
                return this.userDatabase.remove(user);
            }
        }

        return false;
    }
    public User getUser(int userId){
        for (User user : this.userDatabase) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }
    public User getUser(String email){
        if(email != null){
            for(User user : this.userDatabase){
                if(user.getEmail().equals(email)){
                    return user;
                }
            }
        }
        return null;
    }
    public ArrayList<User> getAllUser(){
        return this.userDatabase;
    }
}
