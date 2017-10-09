/**
 * 
 */
package com.baqa.club.orphan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baqa.club.orphan.dao.KidsDao;
import com.baqa.club.orphan.model.Kids;
import com.baqa.club.orphan.service.KidsService;

public class KidsServiceImple implements KidsService{
	
	@Autowired
	private KidsDao kidDao;

	@Override
	
	public void add(Kids entity) {
		kidDao.doSave(entity);
		
	}

	@Override
	public List<Kids> getAllKids(String name) {
		return kidDao.getAllKids(name);
	}


}
