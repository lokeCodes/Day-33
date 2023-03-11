// https://www.codechef.com/problems/XJUMP
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
	        int x = s.nextInt(); // stair number
	        int y = s.nextInt(); // no of stairs he can climb in a single step
	        int res = (x%y)+(x/y);
	        System.out.println(res);
	    }
	}
}
