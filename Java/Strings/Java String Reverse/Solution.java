import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        StringBuilder sb=new StringBuilder(s);  
        sb.reverse();  
        String s1 = sb.toString();
        
        if(s1.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
