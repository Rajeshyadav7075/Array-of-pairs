import java.util.*;
import java.lang.*;

class Array
{
    public static void main(String args[])
    {   int target = 1;
        System.out.println("Enter Array Size");
        Scanner s = new Scanner(System.in); 
        int l = s.nextInt();
        System.out.println("Enter Array values");
        int ar[] = new int[l];
          for(int i=0;i<l;i++)
             {
                 ar[i] = s.nextInt();
             }
          for(int j=0;j<ar.length;j++)
            {
              int num1 = ar[j];
             for(int k=j+1;k<ar.length;k++)
               {
                 int num2 = ar[k];
                   if((num2-num1)== target) 
                     { 
                       System.out.println("("+num2+","+num1+")");
                     }
               }
            }


    }
}