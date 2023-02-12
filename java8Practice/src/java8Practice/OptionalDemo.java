package java8Practice;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		String str = "Hello Java";
		String str1 = null;
 		Optional<String> optional = Optional.ofNullable(str);
 		Optional<String> optional1 = Optional.ofNullable(str1);

		optional.ifPresent(s -> System.out.println(s));
		System.out.println(optional1.orElse("Value is Null"));
	}

}
