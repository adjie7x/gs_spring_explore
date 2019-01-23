package utility.class_design.abstract_class;

public abstract class Person {
	
	private String name;
	private String gender;
	
	
	
//	public Person() {
//	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public abstract void work();
	
	public abstract void run();
	
	public void changeName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}
	

}
