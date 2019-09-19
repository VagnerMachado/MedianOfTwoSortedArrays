package medianSortedArrays;

import java.util.Stack;

public class Main {

	public static void main(String[] args) 
	{
		int [] a = {};
		int [] b = {2,3};

		System.out.println("Median " + findMedian(a,b));
	}

	public static double findMedian(int [] a, int [] b)
	{
		int lowA = 0;
		int lowB = 0;
		Stack <Integer> low = new Stack<>();		
		int aLen = a.length;
		int bLen = b.length;
		int totalLen = aLen + bLen;
		int iterations = 1 + (totalLen /2); // then get the next greater value
		int turn = 0;

		while(turn < iterations)
		{
			if(aLen != 0 && bLen !=0)
			{
				if(a[lowA] < b[lowB])
					low.push(a[lowA++]);
				else
					low.push(b[lowB++]);
				turn++;
			
				if(lowA == aLen || lowB == bLen)
				{
					if(lowA == aLen)

						while(turn < iterations)
						{
							low.push(b[lowB++]);
							turn++;
						}

					else if(lowB == bLen)
						while(turn < iterations)
						{
							low.push(a[lowA++]);
							turn++;
						}
				}
			}
			else
			{
				if(lowA == aLen || lowB == bLen)
				{
					if(lowA == aLen)

						while(turn < iterations)
						{
							low.push(b[lowB++]);
							turn++;
						}

					else if(lowB == bLen)
						while(turn < iterations)
						{
							low.push(a[lowA++]);
							turn++;
						}
				}
			}
		}

		if( totalLen % 2 == 0)
			return (low.pop() + low.pop())/2.0;
		else
			return low.pop();
	}
}
