package utility.class_design.nested_class.inner_class;

public class InnerClassDemo {
	
	public static void main(String[] args) {
		// accesing an inner class
		OuterInnerClass outerInnerObject = new OuterInnerClass();
		OuterInnerClass.InnerClass innerObject = outerInnerObject.new InnerClass();
		
		innerObject.display();
	}

}
