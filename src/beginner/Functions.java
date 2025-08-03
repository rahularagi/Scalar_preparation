package beginner;

public class Functions {
    //factorial
    // n -> n*(n-1)*(n-2)*(n-3)*....1
    //ncr  = (n)!/(r!)*(n-r)!

    public static int getFactorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args){
        int n=5;
        int fact = 1;
        for(int i =1; i<=n;i++){
             fact *=i;
        }
        System.out.println(fact);

        //ncr  = (n)!/(r!)*(n-r)!
        // 5c2
        int n2 = 5;
        int r = 2;

        int factn5 = getFactorial(n2);
        int fact2 = getFactorial(r);
        int fact5_2 = getFactorial(n2-r);
        System.out.println(factn5/(fact2*fact5_2));


        //prime number
        int pn = 10;
        primeNumber(n);

    }

    public static void primeNumber(int n){

        for(int i = 0; i<=n;i++ ){
            if(countFactor(i) == 2){
                System.out.println(i);
            }
        }
    }

    public static int countFactor(int n){
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

    //floor(x)  -> greatest number less than or equal to x
    //floor(10.0001) -> 10
    //ceiling -> smallest number greater than or equal to x
    //ceil(10.0001) -> 11
    //ceil(-2.1) -> 2
    //ceil(9.999) -> 10
    //Math.ceil(4.5)
    //Math.floor(9.999)
}

