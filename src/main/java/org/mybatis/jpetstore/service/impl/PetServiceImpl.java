package org.mybatis.jpetstore.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.jpetstore.dao.PetDAO;
import org.mybatis.jpetstore.model.Pet;
import org.mybatis.jpetstore.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetDAO petDAO;
	
	@Override
	public List<Pet> findAll() {
		return petDAO.selectAll();
	}

	@Override
	public Pet findById(long id) {
		return petDAO.selectById(id);
	}

	@Override
	public Map<String, Object> findById2(long id) {
		return petDAO.selectById2(id);
	}

	@Override
	public void insert(Pet pet) {
		petDAO.insert(pet);
	}

	@Override
	public void update(Pet pet) {
		petDAO.update(pet);
	}

	@Override
	public void delete(long id) {
		petDAO.delete(id);
	}

}
