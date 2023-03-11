// https://www.codechef.com/problems/CHESSDIST
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
		    int x1 = s.nextInt();
		    int y1 = s.nextInt();
		    int x2 = s.nextInt();
		    int y2 = s.nextInt();
		    int res1 = Math.abs(x1-x2);
		    int res2 = Math.abs(y1-y2);
		  //  int res1 = (x1>=x2) ? x1-x2 : x2-x1;
		  //  int res2 = (y1>=y2) ? y1-y2 : y2-y1;
		    int res = Math.max(res1,res2);
		    System.out.println(res);
		}
	}
}
