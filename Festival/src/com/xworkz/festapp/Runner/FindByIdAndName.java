package com.xworkz.festapp.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import   javax.persistence.Query;

import com.xworkz.festapp.entity.FestivalEntity;

public class FindByIdAndName {
	public static void main(String[] args) {
       EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
       EntityManager manager =factory.createEntityManager();
       Query query = manager.createNamedQuery("fidByIdAndName");
      
       Object fest =  query.getSingleResult();

        FestivalEntity ent = (FestivalEntity) fest;
        System.out.println(fest);
       manager.close();
       
	}
}
