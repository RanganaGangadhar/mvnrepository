package mvnwebapp;

import java.util.Arrays;
import java.util.List;

public class ClassTWO {

	public static void main(String[] args){
		System.out.println("::ENTER::");
		List<String> jjj = Arrays.asList("aaa","bbbb");
		
		jjj.forEach((t)-> System.out.println(t));
		
		
	}
}
