package example.recursion;

/**
 * Created by debnaths on 11/04/15.
 */
public class Fibonacci {
    public int fib(int i){
        if(i==0)
            return 0;
        else if (i==1)
            return 1;

        return fib(i-1) + fib(i-2) ;
    }

    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        for(int j = 0 ; j< 10 ; j ++)
            System.out.print(f.fib(j) + " ");
    }

}
