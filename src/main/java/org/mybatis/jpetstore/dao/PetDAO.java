package org.mybatis.jpetstore.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.jpetstore.model.Pet;

public interface PetDAO {
	
	public List<Pet> selectAll();
	
	public Pet selectById(long id);
	
	public Map<String, Object> selectById2(long id);
	
	public void insert(Pet pet);
	
	public void update(Pet pet);
	
	public void delete(long id);
}
