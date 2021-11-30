package lec23_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

// findMoreThanOneElement
public class G02_findStringWhichPresentMoreThanOne {

	public static void main(String[] args) {
		String [] names = { "java", "selenium", "hi", "hello", "java", "selenium", "java", "hello", "Bye" };
		Set <String> duplicateName = new HashSet<String>();
		
		for(int i=0; i<names.length; i++) { 
			
			for (int j = i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					
					duplicateName.add(names[i]);
				}
			}
		}
		System.out.println(duplicateName);
	}

}
