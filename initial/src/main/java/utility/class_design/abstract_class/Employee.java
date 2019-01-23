package utility.class_design.abstract_class;

public class Employee extends Person{
	
	private int empId;

	public Employee(String name, String gender, int empId) {
		super(name, gender);
		// TODO Auto-generated constructor stub
		this.empId = empId;
	}

	@Override
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new Employee("Dove","Female",0);
		Person employee = new Employee("Pankaj","Male",123);
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
		employee.changeName("Pankaj Kumar");
		System.out.println(employee.toString());
	}

}
