/**
 * 
 */
package com.baqa.club.orphan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baqa.club.orphan.service.KidsService;


@Controller
public class AddKidController {

	@Autowired
	private KidsService service;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("orphan");
	    return mav;
	  }
	
}
