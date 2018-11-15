package com.infogain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infogain.bean.Product;
import com.infogain.service.ProductDao;

@Controller
//@RequestMapping("controll")
public class ProductController {

	@Autowired
	private ProductDao prod;//=new ProductDaoImpl();
	
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String welcomePage()
	{
		return "index";
	}
	
	@RequestMapping(value="addPage",method=RequestMethod.GET)
	public ModelAndView addPage()
	{
		ModelAndView model=new ModelAndView("addProduct", "command",new Product());
		//model.addObject(new Product());
		return model;
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute Product p)
	{
		System.out.println(p);
		prod.addProduct(p);
		return "index";
	}
	
	@RequestMapping(value="showPage",method=RequestMethod.GET)
	public String viewProduct(ModelMap model)
	{
		List<Product> plist=prod.getproducts();
		System.out.println("ADSdsdaaads");
		model.addAttribute("name", "ddd");
		model.addAttribute("list",plist);
		return "display";
	}
}
