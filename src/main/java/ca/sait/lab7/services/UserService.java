/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.lab7.services;
import ca.sait.lab7.models.User;
import java.util.List;
import ca.sait.lab7.dataaccess.UserDB;
import ca.sait.lab7.models.Role;
//import javax.persistence.*;
/**
 *
 * @author dbrai
 */

public class UserService {
    private final UserDB userDB;

    public UserService() {
        this.userDB = new UserDB();
    }
	public User get(String email) throws Exception{
	User user=this.userDB.get(email);
	return user;
	}
	public List<User> getAll() throws Exception{
	List<User> users = this.userDB.getAll();
	return users;
	}
	public boolean insert(String email,boolean active,String firstname,String lastname,String password,Role role) throws Exception{
	User user=new User(email,active,firstname,lastname,password,role);
	return this.userDB.insert(user);
	}
	public boolean update(String email,boolean active,String firstname,String lastname,String password,Role role) throws Exception{
	User user=new User(email,active,firstname,lastname,password,role);
	return this.userDB.update(user);
	}
	public boolean delete(String email) throws Exception{
	User user=new User();
	user.setEmail(email);
	return this.userDB.delete(user);
	}
}
