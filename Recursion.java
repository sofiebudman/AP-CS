/**
 * @author Sofie Budman
 * 4/15/2025
 * period 5
 */
public class Recursion {
    public int fib(int num)
	{ 
        if(num == 0) return 0;
        if(num == 1) return 1;
        return (fib(num-1) + fib(num -2) );

		//put your code here
	}


	public int fact (int num)
	{
        if(num == 0) return 1;
        return fact(num-1)*num;


		//put your code here
	}


	public static void main(String[] args)
	{
		//test your code to make sure it works!
        Recursion r = new Recursion();
        System.out.println(r.fib(9));
        System.out.println(r.fact(4));
	}

    
}
