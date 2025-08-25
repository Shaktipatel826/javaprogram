import java.util.*;
public class neon{
    public static void main(String args[]){
Scanner sc= new Scanner( System.in);
System.out.print("Enter the your number");
int 19n=sc.nextInt();
int rem,sum=0;
 int sq=n*n;
while(sq!=0){
    rem=sq%10;
    sum=sum+rem;
    sq=sq/10;
}
if(sum==n){
    System.out.print( " neon number");
}
else {
     System.out.print(" Not neon number");

}
    }
}