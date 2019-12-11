import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
public static void main(String[] args) {
        Arrays.fill(sieve, true); 
        sieve[0] = false;
        sieve[1] = false;
       // int n = 2;
       // n++;
 //for (int i=2; i<= 999; i++) {   
 //   i++;
 //      if (i % n == 0 && i==n) { 
 //          sieve[i]=false;
    for (int i=2; i<sieve.length;i++) {
        for (int n=2*i; n<sieve.length;n+=i) {
            sieve[n]=false;
        }
    }
    
 System.out.println(java.util.Arrays.toString(sieve));
}



public static int[] collectPrimes() {
for (int i=0; i<values.length;i++) {
count++;
int[]primes=new int [count];
sieve [i]=true;
primes [n]= i;
}
} 


//48: It is unessessary to check the values of the bigger numbers like 47 and 43 because they were already 
//crossed out due to their factors that were smaller. The last value of n that strikes off a number is 7. 
