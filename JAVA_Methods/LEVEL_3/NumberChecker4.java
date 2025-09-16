import java.util.Scanner;

public class NumberChecker4 {
    public static boolean prime(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            count++;
        }
        if (count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean neon(int n){
        int sum=0;
        int sq = (int)Math.sqrt(n);
        int m=n;
        while(sq!=0){
            int temp=sq%10;
            sum+=temp*temp;
            sq=sq/10;
        }
        if(sum==m){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean spy(int n){
        int sum=0;
        int pro=1;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            pro*=temp;
            n=n/10;
        }
        if(sum==pro){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean automorphic(int n){
        int l = String.valueOf(n).length();
        int m = (n * n) / (int)(Math.pow(10, l));
        if(m==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean buzz(int n){
        if((n%10==7) || (n%7==0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (prime(num)) {
            System.out.println(num + " is a prime number.");
        }
        if (neon(num)) {
            System.out.println(num + " is a neon number.");
        }
        if (spy(num)) {
            System.out.println(num + " is a spy number.");
        }
        if (automorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        }
        if (buzz(num)) {
            System.out.println(num + " is a buzz number.");
        }
    }
}