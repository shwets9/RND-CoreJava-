package com.shweta.Mockito_Demo.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.shweta.Mockito_Service.service.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoServiceStub todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
