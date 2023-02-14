package com.xworkz.val.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.val.dto.ValentainDTO;

@Repository
public class ValentainRepoImpl implements ValentainRepo {

//	@Autowired
//	private EntityManagerFactory entityManagerFactory;

	public ValentainRepoImpl() {
		System.out.println("Created  ValentainRepoImpl");
	}

	@Override
	public boolean save(ValentainDTO dto) {
		System.out.println("Registering save");
//		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		entityManager.persist(dto);
//		transaction.commit();
//		entityManager.close();
//		
		return false;
	}

}
