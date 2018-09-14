package com.daniel.gutierrez.streams;

import java.io.File;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Stream {
	
	/*Vamos a recorrer una lista de string y convertirlos a lista de filas*/
	public static void iterateAndMap(List<String> filePaths) {
		List<File> collect = filePaths.stream().map(File::new).collect(Collectors.toList());
	}
	
	/*Igual que la anterior pero vamos a filtrar y a ordenar y luego imprimimos*/
	public static void iterateFilterSortAndMap(List<String> filePaths) {
		filePaths.stream()
		.filter(Stream::startsWithA) //same (x)->Stream.startsWithA(x))
		.sorted(String::compareTo) // same (x,y)->x.compareTo(y)
		.map(File::new)
		.forEach((x)->System.out.println(x));
		;
	}

	public static void removeCertainElementWithSomeAttribute(List<String> filePaths) {
		filePaths.removeIf((x)->x.startsWith("A"));
	}
	
	/*Reemplazamos todos los nulls de la lista por un archivo*/
	public static void replaceAll(List<File> filePaths) {
		filePaths.replaceAll((x)->{
			if(x == null)
				x = new File(x,"new route");
			return x;
		});
	}
	
	
	private static boolean startsWithA(String text) {
		return text.startsWith("A");
	}
	private static File reemplaceNullsFile(File file) {
		File newFile = null;
		if(file == null)
			newFile = new File("default route");
		else
			newFile = file;
		return newFile;
	}
	

}
