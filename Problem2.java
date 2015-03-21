/**
*Problem 2
*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, 
*the first 10 terms will be:1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
*By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
*find the sum of the even-valued terms
*/
public class Problem2
{
	public static void main(String[] args) {

		int fabi = 1;
		int previous1 = 1;
		int previous2 = 1;
		int sum = 0;
		int range = 4000000;

		while(fabi < range)
		{
			if(fabi % 2 == 0)
			{
				sum += fabi;
			}
			fabi = previous1 + previous2;
			previous2 = previous1;
			previous1 = fabi;
		}
			System.out.println("the sum is "+ sum);
	}
}