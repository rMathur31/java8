package java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Lambda {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Bread");
		list.add("Butter");
		list.add("Cheese");
		
					//lambda expression -> without name, return type, access modifier
		list.forEach(item -> System.out.println(item));
		
		//func. expr is uused to provide reference to lambda exp
		BiConsumer<Integer, Integer> biconsumer = (a,b) -> System.out.println(a+b);
		biconsumer.accept(10, 20);
		
	}
}
