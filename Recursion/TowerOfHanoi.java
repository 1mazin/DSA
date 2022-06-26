/*The tower of Hanoi is a famous puzzle where we have three rods and N disks. 
The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs N. Initially, these discs are in the rod 1.
You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.*/

class Solution {
long count=0; //To keep the track of movement required to achieve the goal.
    public long toh(int N, int from, int to, int aux) {
        // Your code here
        
        count++;
        if(N==1){   //If only one stack present then only one move required from source to direct destination.
          
          System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
          return 1;}
        toh(N-1,from,aux,to);   //Otherwise firstly we will move n-1 stacks from source to helper rod and then move nth disc to destination road.  
          System.out.println("move disk "+N+" from rod "+from+" to rod "+to);  
        toh(N-1,aux,to,from);    //finally moving all the n-1 rods from helper to destination.
        return count;
        
    }
}
