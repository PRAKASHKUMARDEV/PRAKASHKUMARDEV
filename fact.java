/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main{
   
   static int fact(int n){
        if(n==0){
            return 1;}
        return n*fact(n-1);    
        }
   
   
   
    
    public static void  main (String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
         int c=fact(n);
         System.out.println(c);
      
        
    }
}
