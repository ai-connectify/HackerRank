import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
         
        String c1 = A.substring(0,1).toUpperCase()+A.substring(1);
        String c2 = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(c1+" "+c2);
        
    }
}
