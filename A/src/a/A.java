
package a;


public class A 
{
    int ctr;
    public void increase()
    {
        System.out.print(ctr++);
    }
public static void main(String[] args) 
{
    A obj = new A();
    for(int i=0; i<3; i++)
        obj.increase();
      
    }
    
}
