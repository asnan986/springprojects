package org.dxc.shopping.controller;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.dxc.shopping.model.Product;
import org.dxc.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	public static Logger logger = Logger.getLogger(ProductController.class.getName());

	@RequestMapping("/")
	public String showindexpage(Model model) {

		model.addAttribute("date", new Date());
		logger.info("showing index page");
		return "index";
	}

	@RequestMapping("/add-product")
	public String showaddproductpage(@ModelAttribute("product") Product product) {

		return "add-product";
	}

	@RequestMapping(value="/addnewproduct",method=RequestMethod.POST)
			public String addNewProduct(@ModelAttribute("product")Product product,BindingResult result,Model model) {
			logger.info("==========addNewProduct===============");
			if(result.hasErrors()) {
			logger.info("==========Binding error===============");
			return "add-product";
			}else {
			logger.info("==========Binding success===============" + product.getPname());
			productService.addnewproduct(product);
			return "success";
			}
	}
	@RequestMapping("/displayproduct")
	public ModelAndView showAllProduct() {
	logger.info("=========showAllProduct() called==============");
	List <Product> allproduct=productService.getProduct();
	ModelAndView modelAndView=new ModelAndView("view-product");
	modelAndView.addObject("productlist", allproduct);
	return modelAndView;
	}

}
