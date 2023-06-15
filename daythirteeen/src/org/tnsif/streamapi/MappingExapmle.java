package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
public class MappingExapmle {

	public static void main(String[] args) {

		
		List<String>obj=Arrays.asList("Ankita","Paraga","Prathamesh");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));
	}

}
