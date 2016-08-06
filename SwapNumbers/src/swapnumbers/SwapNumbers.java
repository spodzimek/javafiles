
package swapnumbers;

public class SwapNumbers {

	public static void main(String[] args){
		int a = 6, b = 9;
		swapTwoNumbersPassingInt(a, b);
		System.out.println("Output of two numbers after swapping through integer values are " + a + " " + b);
		A objA = new A(6);
		A objB = new A(9);
		swapTwoNumbersPassingObjects(objA, objB);
		System.out.println("Output of two numbers after swapping through object references are " + objA + " " + objB);
	}
	
	// method swaps numbers passing primitive values
	private static void swapTwoNumbersPassingInt(int a, int b){
		int c = a;
		a = b;
		b = c;
	}
	
	// method swaps using object reference
	private static void swapTwoNumbersPassingObjects(A a, A b){
		A c = new A(a.a);
		a.a = b.a;
		b.a = c.a;
	}
	
	private static class A{
		int a;

		A(int a){
			this.a = a;
		}

		@Override
		public String toString() {
			return "A [a=" + a + "]";
		}
	}
}
