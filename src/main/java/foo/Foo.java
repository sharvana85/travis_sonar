package foo;

/**
 * Foo class
 */
public class Foo {
    
    public static void main(String args[]){
        System.out.println("In Main Method...");
    }

    public static int div(int a, int b) throws Exception {
    	if (b == 0) {
            System.out.println("In div method");
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
