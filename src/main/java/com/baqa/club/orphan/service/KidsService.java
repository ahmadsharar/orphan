/**
 * 
 */
package com.baqa.club.orphan.service;

import java.util.List;

import com.baqa.club.orphan.model.Kids;



public interface KidsService  {

	public List<Kids> getAllKids(String name);

	public void add(Kids entity);
	
}
