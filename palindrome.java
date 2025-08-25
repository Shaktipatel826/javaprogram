import java.util.*;
public class palindrome {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println(" Enter the number ");
int a =sc.nextInt();
int x=a;
int rev=0,r;
while(a!=0){
r=a%10;
rev=rev*10+r;
a=a/10;
}
if(x==rev){
System.out.println(" palindrome ");
}
else {
System.out.println(" Not palindrome ");
}
}
}
