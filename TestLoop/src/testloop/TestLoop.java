
package testloop;


public class TestLoop 
{
 @SuppressWarnings("fallthrough")
 public static void main(String[] args) 
    {
    for (int i = 1; i <= 10; i++)
        {
    switch (i)
            {
    case 5: 
        System.out.println("Five");
    default:
                    System.out.println("Default");
            } 
        }
    }
}
    
    
}
