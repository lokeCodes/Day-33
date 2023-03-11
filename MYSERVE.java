//https://www.codechef.com/problems/MYSERVE
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int res1 = (a+b)+1; // to find who serve is next so we add one to the score
		    int res2 = (res1%2!=0) ? res1+1 : res1;
		    if(res2%4==0){
		        System.out.println("Bob"); // only at the multiples of 4 , bob serve
		    }else{
		        System.out.println("Alice"); // only at the multiples of 2 , alice serve
		    }
		    
		}
	}
}
