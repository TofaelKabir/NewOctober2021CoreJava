package lec04_java_variables;

// Projects names are generally written in UpperCamelCase
// Camel case example for a project --> October2021CoreJava

// Package names are generally written in lowerCamelCase
// Camel case example for a package --> lec01JavaBasics

// Class names are written in UpperCamelCase (means? See below)
// Class names are usually nouns or noun phrases.
// Camel case example for a class --> NamingConventions

// What is the alternative of camel case?
// Underscore and then start with lower case. 
// Alternative example of Camel case, for a project --> October_2021_core_java 
// Alternative example of Camel case, for a package --> lec01_java_basics
// Alternative example of Camel case, for a class --> Naming_conventions

public class NamingConventions {

	// non-constant field/variable names are written with lowerCamelCase
	// Exception is String type, start with UpperCamelCase.
	// variable names must be specific and meaningful
	// no duplication is accepted
	public int houseNumber = 625; // variable initialized
	public int avenueNumber; // variable declared

	// constant names are written with all upper case letters with words separated by underscores
	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;

	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string = "String";

	// method names are written in lowerCamelCase
	// method names are usually verbs or verb phrase
	// method name can be same as Class name
	public static void namingConventions() { // method implemented
		System.out.println("This is from method");
	}

	public static void main(String[] args) {
		System.out.println("Naming Conventions");
	}
}
