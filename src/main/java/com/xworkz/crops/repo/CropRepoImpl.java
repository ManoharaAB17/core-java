package com.xworkz.crops.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.crops.Entity.CropEntity;

@Repository
public class CropRepoImpl implements CropRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public CropRepoImpl() {
		System.out.println("Created crop RepoImpl");
	}

	@Override
	public boolean save(CropEntity entity) {
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
	public boolean update(CropEntity entity) {
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
	public CropEntity findById(int id) {
		System.out.println("Find By id in Repository... " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		CropEntity feromDb = entityManager.find(CropEntity.class, id);
		entityManager.close();
		return feromDb;
	}

	@Override
	public List<CropEntity> findByName(String cropName) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByCropName");
			query.setParameter("cp", cropName);
			List<CropEntity> list = query.getResultList();
			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public  CropEntity deleteById(int id) {
		System.out.println("Delete By Id ..... " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			CropEntity entity = manager.find(CropEntity.class, id);
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
		
		return CropRepo.super.deleteById(id);
	}
    	
}
