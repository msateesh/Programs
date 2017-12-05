package com.sateesh.puzzles;

public class ConsecutiveSum {
	
	public void PrintSums(int N){
		 int start = 1, end = 1;
		 int sum = 1;
		 int count=0;
		    while (start <= N/2)
		    {
		        if (sum < N)
		        {
		            end += 1;
		            sum += end;
		        }
		        else if (sum > N)
		        {
		            sum -= start;
		            start += 1;
		        }
		        else if (sum == N)
		        {
		            for (int i = start; i <= end; ++i)
		                System.out.println(i);
		            	System.out.println("\n");
		            sum -= start;
		            start += 1;
		            count++;
		        }		        
		    }
		    System.out.println("count is ------"+count);
	}
	public static void main(String[] args) {
		ConsecutiveSum s= new ConsecutiveSum();
		s.PrintSums(125);
	}

}
