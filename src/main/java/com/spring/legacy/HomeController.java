package com.spring.legacy;

import java.net.URL;
import java.net.URLClassLoader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		ClassLoader cl = ClassLoader.getSystemClassLoader();

		URL[] urls = ((URLClassLoader) cl).getURLs();

		for (URL url : urls) {
			System.out.println(url.getFile());
		}

		/* Spring bean factory test 00 */

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("bf.xml"));
		ObjectA mo0 = (ObjectA) bf.getBean("ObjectA_ID");
		ObjectA mo1 = (ObjectA) bf.getBean("ObjectA_ID");
		
		model.addAttribute("ObjectA0", mo0.toString());
		model.addAttribute("ObjectA1", mo1.toString()); 

		ObjectB mo00 = (ObjectB) bf.getBean("ObjectB_ID");
		ObjectB mo11 = (ObjectB) bf.getBean("ObjectB_ID");
		 
		model.addAttribute("myObjectB0", mo00.toString());
		model.addAttribute("myObjectB1", mo11.toString()); 
		
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ac.xml");
		
	    mo0 = (ObjectA) ac.getBean("ObjectA_ID");
		mo1 = (ObjectA) ac.getBean("ObjectA_ID");
		
		model.addAttribute("ObjectA0AC", mo0.toString());
		model.addAttribute("ObjectA1AC", mo1.toString()); 

		 mo00 = (ObjectB) ac.getBean("ObjectB_ID");
		 mo11 = (ObjectB) ac.getBean("ObjectB_ID");
		  
		model.addAttribute("ObjectB0AC", mo00.toString());
		model.addAttribute("ObjectB1AC", mo11.toString()); 
		
		
		
		 
		ObjectC mo3 =  (ObjectC) ac.getBean("ObjectC_ID");
		model.addAttribute("ObjectCAC",mo3.toString());
		
		ObjectD mo4 =  (ObjectD) ac.getBean("ObjectD_ID");
		model.addAttribute("ObjectDAC",mo4.toString());
		
		
		 mo4 =  (ObjectD) ac.getBean("ObjectDAlias1");
		model.addAttribute("ObjectDAlias1",mo4.toString());
		 mo4 =  (ObjectD) ac.getBean("ObjectDAlias2");
		model.addAttribute("ObjectDAlias2",mo4.toString());
		
		 
		
		return "home";
	}

}
