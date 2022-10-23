class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min_count = Integer.MAX_VALUE;
        for(int i=0; i<blocks.length(); i++){
            int black_count = 0, count = 0;
            for(int j=i; j<blocks.length(); j++){
                if(blocks.charAt(j) == 'B') black_count++;
                else{
                    black_count++;
                    count++;
                }
                if(black_count == k){
                    min_count = Math.min(min_count, count);
                    break;
                }
            }
        }
        return min_count;
    }
}
