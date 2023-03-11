// https://www.codechef.com/problems/FILLCANDIES
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt(); // no of candies
		    int p = s.nextInt(); // pockets in a bag
		    int c = s.nextInt(); // no of candies each packets can hold
		    int cap = p*c;       // holding capacity of a bag
		    int bags = n/cap;    // no of candies each bag can hold
		    int res = (cap*bags>=n) ? bags : bags+1;  // no of bags needed
		    System.out.println(res);
		}
	}
}
