import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    try{
     int x = sc.nextInt();
     int y = sc.nextInt();
     int z = x/y;
     System.out.println(z);
     }
     catch(ArithmeticException ae){
         System.out.println(ae);
     }
     catch(InputMismatchException ime){
         System.out.println("java.util.InputMismatchException");
     }
     catch(Exception e){
         System.out.println(e);
     }
    }
}
