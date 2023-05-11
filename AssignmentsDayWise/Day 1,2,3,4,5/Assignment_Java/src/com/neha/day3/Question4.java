package com.neha.day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question4 {
	 public static void main(String[] argv){
		    List<Person> persons = Arrays.asList(new Person("Joe","dark", 12), new Person("Jim","corbat", 34), new Person("John","bolt", 23));

		     persons.stream()
		    		.map(x->x.getFirstName()+x.getLastName())
		    		.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		    
		  }
		}

		class Person {
		    private String firstName;
		    private String lastName;
		    private int age;

		    public Person(String firstName, String lastName, int age) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
			}

			public Person(String firstName) {
		        this.firstName = firstName;
		    }

		    public Person(String firstName, int age) {
		        this.firstName = firstName;
		        this.age = age;
		    }

		    public String getFirstName() {
		        return firstName;
		    }

		    public void setFirstName(String firstName) {
		        this.firstName = firstName;
		    }

		    public String getLastName() {
		        return lastName;
		    }

		    public void setLastName(String lastName) {
		        this.lastName = lastName;
		    }

		    public int getAge() {
		        return age;
		    }

		    public void setAge(int age) {
		        this.age = age;
		    }

		    @Override
		    public String toString() {
		      return "Person [firstName=" + firstName + ", lastName=" + lastName
		          + ", age=" + age + "]";
		    }
		    
		}

