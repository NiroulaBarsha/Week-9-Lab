/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.lab7.models;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author dbrai
 */
@Entity
public class Role implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id @GeneratedValue
        //Long id;
        private Long id;
	private String name;
	public Role(){

	}
	public Role(Long id,String name){
		this.id=id;
		this.name=name;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
}
