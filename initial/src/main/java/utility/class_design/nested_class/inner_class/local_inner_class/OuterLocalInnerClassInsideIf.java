package utility.class_design.nested_class.inner_class.local_inner_class;

//Java program to illustrate Declaration of  
//local inner classes inside an if statement
public class OuterLocalInnerClassInsideIf {

	public int data = 10;

	public int getData() {
		return data;
	}

	public static void main(String[] args) {
		OuterLocalInnerClassInsideIf outer = new OuterLocalInnerClassInsideIf();
		if (outer.getData() < 20) {
			// Local inner class inside if clause
			class Inner {
				public int getValue() {
					System.out.println("Inside Inner class");
					System.out.println("local inner classes inside an if statement");
					return outer.data;
				}
			}
			
			Inner inner = new Inner(); 
            System.out.println(inner.getValue());
		} else {
			System.out.println("Inside Outer class");
		}
	}
}
