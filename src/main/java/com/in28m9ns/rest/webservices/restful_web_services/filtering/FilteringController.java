package com.in28m9ns.rest.webservices.restful_web_services.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("value1","value2","value3","value4");
		MappingJacksonValue mappping = new MappingJacksonValue(someBean);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter );
		mappping.setFilters(filters );
		return mappping;
	}
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList() {
		
		List<SomeBean> arrList = Arrays.asList(new SomeBean("value1","value2","value3","value4")
				, new SomeBean("value5","value6","value7","value8"));
		MappingJacksonValue mapping = new MappingJacksonValue(arrList);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field4");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter );
		mapping.setFilters(filters);
		return mapping;
	}

}
