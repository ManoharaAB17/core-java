package com.xworkz.air.repository;

import com.xworkz.air.entity.AirEntity;

public interface AirRepo {
	boolean save(AirEntity entity);

	AirEntity findById(int id);
}
