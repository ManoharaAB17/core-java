package com.xworkz.festapp.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndId {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");

		query.setParameter("byid", 7);
		query.setParameter("byName", "pongal");

		Object result = query.getSingleResult();

		Object[] array = (Object[]) result;

		System.out.println(array[0]);
		System.out.println(array[1]);

		manager.close();

	}
}
