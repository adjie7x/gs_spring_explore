package utility.class_design.nested_class.inner_class.local_inner_class;

//Java program to illustrate 
//working of local inner classes
public class OuterLocalInnerClass {
	
	static int a = 1;

	int b = 2;
	
	private void getValue(){
		// Note that local variable(sum) must be final till JDK 7  
        // hence this code will work only in JDK 8 
        int sum = 20; 
          
        // Local inner Class inside method
        class LocalInnerClass{
        	public int divisor; 
            public int remainder;
            
            public LocalInnerClass(){
            	divisor = 4; 
                remainder = sum%divisor;
            }
            private int getDivisor() 
            { 
                return divisor; 
            } 
            private int getRemainder() 
            { 
                return sum%divisor; 
            } 
            private int getQuotient() 
            { 
                System.out.println("Inside inner class"); 
                return sum / divisor; 
            }
            // accesing outer class properties
            private int sumab(){
            	return a + b;
            }
            
        }
        
        LocalInnerClass localInnerClass = new LocalInnerClass();
        System.out.println("Divisor = "+ localInnerClass.getDivisor()); 
        System.out.println("Remainder = " + localInnerClass.getRemainder()); 
        System.out.println("Quotient = " + localInnerClass.getQuotient());
        System.out.println("sumab : " + localInnerClass.sumab());
	}
	
	public static void main(String[] args) {
		OuterLocalInnerClass outerLocalInnerClass = new OuterLocalInnerClass();
		outerLocalInnerClass.getValue();
	}

}
