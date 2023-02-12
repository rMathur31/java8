package java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(15);
		
		List<Integer> res = new ArrayList<>();
		
		res = list.stream().filter(x -> x>=15).map(x -> x*x).collect(Collectors.toList());
		res.forEach(item -> System.out.println(item));
		
	}
}
