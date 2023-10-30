/* Problem statement: You are in an infinite 2D grid where you can move in any of the 8 directions
 (x,y) to 
    (x-1, y-1), 
    (x-1, y)  , 
    (x-1, y+1), 
    (x  , y-1),
    (x  , y+1), 
    (x+1, y-1), 
    (x+1, y)  , 
    (x+1, y+1) 

You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.
*/
public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        int xDiff = 0;
        int yDiff = 0;
        for(int i=0;i<A.size()-1;i++){
            xDiff = Math.abs(A.get(i)-A.get(i+1));
            yDiff = Math.abs(B.get(i)-B.get(i+1));
           sum+=Math.max(xDiff,yDiff);
        }
        return sum;
    }
}
