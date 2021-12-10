import java.util.*;
 public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int m = sc.nextInt(); 
            
            for(int k=1; k<=m; k++){
              int a1 = sc.nextInt();
              int b1 = sc.nextInt();
              int n1 = sc.nextInt();
              int sum = a1; 
                for(int i = 0 ; i < n1 ; i++){
                  int j = (int) Math.pow(2,i);
                  sum = sum + (j*b1) ; 
                  System.out.print(sum+" "); 
            }
            System.out.println();
            }
    }
}
