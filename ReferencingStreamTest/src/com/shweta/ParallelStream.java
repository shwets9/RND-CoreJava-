 package com.shweta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.shweta.model.Student;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("SS",21));
		list.add(new Student("AS",22));
		list.add(new Student("KY",23));
		list.add(new Student("AV",24));
		list.add(new Student("NV",26));
		list.add(new Student("RA",28));
		list.add(new Student("DH",29));
		
		Stream<Student> parallelStream = list.parallelStream();
		System.out.println("Students data sent for processing::::");
		parallelStream.forEach(s->doProcess(s));

	}

	private static Object doProcess(Student s) {
		System.out.println(s);
		return null;
	}

}
