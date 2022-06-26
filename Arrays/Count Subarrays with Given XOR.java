//Question-->https://www.codingninjas.com/codestudio/problems/count-subarrays-with-given-xor_1115652?topList=striver-sde-sheet-problems&leftPanelTab=0
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;


public class Solution {
	public static int subarraysXor(ArrayList<Integer> a, int x) {
            HashMap<Integer,Integer> freq =new HashMap<>();
        int xor=0;
        int count=0;
           for(int i=0;i<a.size();i++)
           {
                   xor^=a.get(i);
                   if(freq.get(xor^x)!=null)
                   {
                       count+=freq.get(xor^x);
                   }
                   if(xor==x)
                       count++;
                   freq.put(xor,freq.getOrDefault(xor,0)+1);
                   
           }
	return count;	// Write your code here.
	}
}
