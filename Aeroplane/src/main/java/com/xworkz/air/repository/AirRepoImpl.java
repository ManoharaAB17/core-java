package com.xworkz.air.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.air.entity.AirEntity;

@Repository
public class AirRepoImpl implements AirRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AirRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AirEntity entity) {
		System.out.println("Running save in repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}

	@Override
	public AirEntity findById(int id) {
		System.out.println("Find By id in Repository... " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AirEntity feromDb = entityManager.find(AirEntity.class, id);
		entityManager.close();
		return feromDb;
	}

}
