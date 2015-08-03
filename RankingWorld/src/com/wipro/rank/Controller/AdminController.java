/*
 *  Copyright © 2015 Wipro Technologies, All Rights Reserved. 
 *  
 *  File Name				:AdminController
 *  
 *  Short Description		:Used to Get/Set Candidate Details and to Create Tables
 *  
 *  Version 				:1.0
 *  
 *  Created  Date			:June 3,2015
 *  
 */

package com.wipro.rank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * This Class is Used to perform ADMIN operations
 *
 * @author Yash Golwara
 * @author Sravani
 * @version 1.0,Jun 9, 2015
 * @since 1.0
 */
@Controller
public class AdminController {
	@RequestMapping(value = "/Home.htm", method = RequestMethod.GET)
	public String viewHome(){
		System.out.println("in controller");
		return "Home";
	}
	@RequestMapping(value = "/search.htm", method = RequestMethod.GET)
	public String viewSearch(){
		System.out.println("in controller");
		return "search";
	}
}