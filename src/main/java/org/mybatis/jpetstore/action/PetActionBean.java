package org.mybatis.jpetstore.action;

import org.mybatis.jpetstore.model.Pet;
import org.mybatis.jpetstore.service.PetService;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.integration.spring.SpringBean;

public class PetActionBean extends AbstractActionBean {

	private static final long serialVersionUID = -1362184612651418339L;

	private static final String HOME_JSP = "/WEB-INF/jsp/home.jsp";
	
	private Object demo;
	private long petId;
	private String petName;
	private String petDesc;
	
	@SpringBean
	private PetService petService;
	
	@DefaultHandler
	public Resolution home() {
		demo = "this is jpetstore demo.";
		return new ForwardResolution(HOME_JSP);
	}
	
	public Resolution list() {
		demo = petService.findAll();
		return new ForwardResolution(HOME_JSP);
	}
	
	public Resolution find() {
		demo = petService.findById(petId);
		if (demo == null) {
			demo = "could not find the pet.";
		}
		
		return new ForwardResolution(HOME_JSP);
	}
	
	public Resolution add() {
		Pet pet = new Pet();
		pet.setId(petId);
		pet.setName(petName);
		pet.setDesc(petDesc);
		
		petService.insert(pet);
		demo = "add a new pet";
		
		return new ForwardResolution(HOME_JSP);
	}
	
	public Resolution update() {
		Pet pet = new Pet();
		pet.setId(petId);
		pet.setName(petName);
		pet.setDesc(petDesc);
		
		petService.update(pet);
		demo = "update a pet";
		
		return new ForwardResolution(HOME_JSP);
	}
	
	public Resolution delete() {
		petService.delete(petId);
		demo = "delete a pet";
		
		return new ForwardResolution(HOME_JSP);
	}

	public Object getDemo() {
		return demo;
	}

	public void setDemo(Object demo) {
		this.demo = demo;
	}

	public long getPetId() {
		return petId;
	}

	public void setPetId(long petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetDesc() {
		return petDesc;
	}

	public void setPetDesc(String petDesc) {
		this.petDesc = petDesc;
	}
	
}
