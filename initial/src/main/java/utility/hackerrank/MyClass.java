package utility.hackerrank;

import utility.class_design.abstract_class.Employee;
import utility.class_design.abstract_class.Employee1;
import utility.class_design.abstract_class.Person;

public class MyClass {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private MyClass(){
		
	}
	
	private static MyClass instance;
	
	public MyClass getInstance(){
		if (instance == null) {
			instance = new MyClass();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Person person =  new Employee1("", "");
		
		person = new Employee("", "", 1);
		
		
	}

}
