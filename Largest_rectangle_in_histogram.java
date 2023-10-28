class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int nsl[]=new int[heights.length];
        int nsr[]=new int[heights.length];
        // finfing Next Smaller To Left
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            } else {
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        s = new Stack<>(); 
        // finding Next Smaller To Right
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=heights.length;
            } else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int area=(nsr[i]-nsl[i]-1)*heights[i];
            ans=Math.max(ans,area);
        }
        return ans;
    }
}
