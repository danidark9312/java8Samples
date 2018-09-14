package com.daniel.gutierrez.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		
	}
	
	public static void probar(String valor) {
		Optional<String> op = Optional.empty(); //Crea empty vacio get lanza exception
		Optional<String> op2 = Optional.of(valor);
	}
	
	public static void orElse(String value) {
		Optional<String> op = Optional.ofNullable(value);
		String value2 = op.orElse("Value not found");
		
		Optional<List<String>> optString = Optional.empty();
		optString.orElse(new ArrayList<>());
		
	}
	
	public static void orElseThrow(String value) {
		Optional<String> op = Optional.ofNullable(value);
		String value2 = op.orElseThrow(NumberFormatException::new);
	}
	
	public static void isPresent(String value) {
		Optional<String> op = Optional.ofNullable(value);
		System.out.println(op.isPresent());
	}
	
	

}
