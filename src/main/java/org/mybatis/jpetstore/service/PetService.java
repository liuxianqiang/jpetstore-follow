package org.mybatis.jpetstore.service;

import java.util.List;
import java.util.Map;

import org.mybatis.jpetstore.model.Pet;

public interface PetService {
	
	public List<Pet> findAll();
	
	public Pet findById(long id);
	
	public Map<String, Object> findById2(long id);
	
	public void insert(Pet pet);
	
	public void update(Pet pet);
	
	public void delete(long id);
}
