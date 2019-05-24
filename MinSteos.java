/*
  You are in an infinite 2D grid where you can move in any of 
  the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you 
need to cover the points. Give the minimum number of steps in 
which you can achieve it. You start from the first point.
    Input : [(0, 0), (1, 1), (1, 2)]
    Output : 2
*/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int x = A.get(0);
        int y = A.get(0);
        int stepCount = 0 ; 
        
        for(int i = 0 ; i < A.size()-1 ; i++){
            stepCount += Math.max(
                Math.abs(A.get(i) - A.get(i+1)),
                Math.abs(B.get(i) - B.get(i+1) )
                );
        }
        return stepCount ;
    } 
}
