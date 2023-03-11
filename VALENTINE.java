// https://www.codechef.com/problems/VALENTINE
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
		    int chef = s.nextInt();
		    int chocolate = s.nextInt();
		    int res = chef/chocolate;
		    System.out.println(res);
		}
	}
}
