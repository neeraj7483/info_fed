package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Controller
public class MvcController {
	@RequestMapping("/my")
	public ModelAndView myData() {
		return new ModelAndView("welcome", "msg", "Welcome to spring mvc");
	}

	// @RequestMapping(value="/my2",method=RequestMethod.POST)
	@RequestMapping("/my2")
	public ModelAndView myData2(HttpServletRequest request, HttpServletResponse response) {
		String unm = request.getParameter("unm");
		String pwd = request.getParameter("pwd");
		ModelAndView model = new ModelAndView("info");
		model.addObject("unm", unm);
		model.addObject("pwd", pwd);
		return model;
	}
	@RequestMapping("/my3")
	public ModelAndView myData3(@RequestParam String unm, @RequestParam String pwd) {
		//String unm = request.getParameter("unm");
		//String pwd = request.getParameter("pwd");
		ModelAndView model = new ModelAndView("info");
		model.addObject("unm", unm);
		model.addObject("pwd", pwd);
		return model;
	}
}
