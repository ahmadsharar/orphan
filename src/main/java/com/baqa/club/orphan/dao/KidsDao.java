/**
 * 
 */
package com.baqa.club.orphan.dao;

import java.util.List;


import com.baqa.club.orphan.model.Kids;



public interface KidsDao{
	
	public List<Kids> getAllKids(String name);
	
	public void doSave(Kids entity);
}
