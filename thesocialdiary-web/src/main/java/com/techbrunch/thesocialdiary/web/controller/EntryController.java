package com.techbrunch.thesocialdiary.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techbrunch.thesocialdiary.dao.TestClass;

@Controller
public class EntryController {

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		System.out.println(TestClass.NAME);
		return "helloworld";
	}

}
