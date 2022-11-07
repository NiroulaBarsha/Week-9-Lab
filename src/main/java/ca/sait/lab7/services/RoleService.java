/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.lab7.services;
import ca.sait.lab7.models.Role;
import java.util.List;
//import ca.sait.lab7.dataaccess.UserDB;
import ca.sait.lab7.dataaccess.RoleDB;
/**
 *
 * @author dbrai
 */
public class RoleService {
        private final RoleDB roleDB = new RoleDB();
	
	public List<Role> getAll() throws Exception{
	List<Role> roles = this.roleDB.getAll();
	return roles;
	}
}
