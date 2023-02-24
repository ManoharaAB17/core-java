package com.xworkz.forestapp.mains;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forestapp.entity.ForestEntity;

public class FindByState {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	       EntityManager manager = factory.createEntityManager();
	       Query query =manager.createNamedQuery("findByState");
	       
	       List<ForestEntity> people = query.getResultList();

	       for (ForestEntity person : people) {
	           System.out.println("Forest name :  " +person.getName() + " --->   Forest State : " + person.getState());
	       }
	
	       manager.close();
	}

}
