package com.shweta.Mockito_Service.service;

import java.util.Arrays;
import java.util.List;

import com.shweta.Mockito_Demo.service.TodoService;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC","Lesrn Spring","Lesrn to Dance");
	}

}
