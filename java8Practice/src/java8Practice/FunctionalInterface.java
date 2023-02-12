package java8Practice;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		Predicate<String> predicate = s-> s.length()>=5;
		System.out.println(predicate.test("Hello World"));
		
		Function<Integer, Integer> function = i -> i*i;
		System.out.println(function.apply(2));
		
		Consumer<Integer> consumer = num -> System.out.println(num*num);
		consumer.accept(5);
		
		Supplier<Date> currentDate = () -> new Date();
		System.out.println(currentDate.get());
		
	}
}
