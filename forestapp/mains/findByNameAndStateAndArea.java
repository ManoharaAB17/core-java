package com.xworkz.forestapp.mains;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forestapp.entity.ForestEntity;

public class findByNameAndStateAndArea {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	       EntityManager manager = factory.createEntityManager();
	       Query query =manager.createNamedQuery("findByName");
	       
	       List<ForestEntity> forest = query.getResultList();

	       for (ForestEntity fordata : forest) {
	           System.out.println("Forest name :  " +fordata.getName() + " --->   Forest State : " 
	       + fordata.getState() +" --- >   Forest area :  " +fordata.getArea());
	       }
	
	       manager.close();
	}

}
