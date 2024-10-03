package com.in28m9ns.rest.webservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	private MessageSource messageSource;
	
	public HelloWorld(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@GetMapping(path = "/hello-world")
	//@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
	public String helloWorld() {
		return "Hello World Shweta";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean!");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//return new HelloWorldBean("Hello World " + name);
		return new HelloWorldBean(String.format("Hello World, %s" , name));
	}
	
	@GetMapping(path = "/hello-world-internalionalized")
	//@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
	public String helloWorldInternalionalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Hey Shweta", locale);
	}
	

}
