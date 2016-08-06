



public class A {
     static void display(Long p, Long q) 
     {
         System.out.print("Method with Long parameters");
        }
     static void display(int...p)
     {
         System.out.print("Method with int parameters");
     }
     public static void main(String[] args)
     {
         display(5, 6);
     }
    
}
