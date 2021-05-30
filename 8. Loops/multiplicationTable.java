import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
 
        long fact=1;
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }
        
    }
}
