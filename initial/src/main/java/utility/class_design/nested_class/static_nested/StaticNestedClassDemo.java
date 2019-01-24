package utility.class_design.nested_class.static_nested;

public class StaticNestedClassDemo {

	public static void main(String[] args) {
		// accessing a static nested class
		OuterStaticNestedClass.StaticNestedClass staticNestedObj = new OuterStaticNestedClass.StaticNestedClass();
		staticNestedObj.display();
	}

}
