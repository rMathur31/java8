package java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamPractice {

	public static void main(String[] args) {
		//Given a list of integers, find out all the even numbers exist in the list using Stream functions
		 List<Integer> list = Arrays.asList(10,15,8,8,25,25,32);
	    //  list.stream().filter(e -> e%2==0).forEach(System.out::println);
	        
	    //Given a list of integers, find out all the numbers starting with 1 using Stream functions
	     // list.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
	      
	    //How to find duplicate elements in a given integers list in java using Stream functions
	      //Set<Integer> set = new HashSet<>();
	      //set add method returns false if element does not exist
	      //list.stream().filter(e -> !set.add(e)).forEach(System.out::println);
	      
	      // calculate average salary of all employee in the list
		 Employee e1 = new Employee(10000, "Pia");
		 Employee e2 = new Employee(20000, "Pia");
		 Employee e3 = new Employee(30000, "Pia");
		 List<Employee> empList = Arrays.asList(e1,e2,e3);
		 Double avgSal= empList.stream().mapToInt(e -> e.getSalary()).average().getAsDouble();
	     System.out.println(avgSal);
	     
	     
	     
	}
}
