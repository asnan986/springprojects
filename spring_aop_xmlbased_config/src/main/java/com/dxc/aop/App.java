package com.dxc.aop;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxc.aop.config.SpringConfig;
import com.dxc.aop.service.ProductService;

/**
 * Hello world!
 *
 */
public class App {
	public static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		ProductService service = applicationContext.getBean(ProductService.class);

		logger.info("\n Main Program ");
		logger.info("--------------------------------");
		logger.info("Calling addProduct Method ");
		logger.info("--------------------------------");
		int result = service.addProduct(10, 30);
		logger.info("--------------------------------");
		System.out.println("Result is  " + result);

		logger.info("--------------------------------");
		logger.info("Calling delayProduct Method ");
		System.out.println(service.delayProduct());
		logger.info("--------------------------------");

		logger.info("--------------------------------");
		logger.info("Calling getProduct Method ");
		logger.info("--------------------------------");
		service.getProduct();
		logger.info("--------------------------------");

		
	}
}
