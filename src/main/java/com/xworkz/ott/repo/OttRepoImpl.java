package com.xworkz.ott.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.ott.Entity.OttEntity;

@Repository
public class OttRepoImpl implements OttRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;// ref ??

	public OttRepoImpl() {
		System.out.println("Created ott RepoImpl");
	}

	@Override
	public boolean save(OttEntity entity) {
		System.out.println("Registering save");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();

		return false;
	}

	@Override
	public boolean update(OttEntity entity) {
		System.out.println("Running Update");

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}


	@Override
	public OttEntity findById(int id) {
		System.out.println("Find By id in Repository... " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		OttEntity feromDb = entityManager.find(OttEntity.class, id);
		entityManager.close();
		return feromDb;
	}

	@Override
	public List<OttEntity> findByPlatform(String platform) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByPlatform");
			query.setParameter("cp", platform);
			List<OttEntity> list = query.getResultList();
			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public  OttEntity deleteById(int id) {
		System.out.println("Delete By Id ..... " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			OttEntity entity = manager.find(OttEntity.class, id);
			if(entity!=null) {
				transaction.begin();
		         manager.remove(entity);
				transaction.commit();
				return entity;
			}			
		}
		 finally {
			 manager.close();
		 }
		
		return OttRepo.super.deleteById(id);
	}
    	
}
