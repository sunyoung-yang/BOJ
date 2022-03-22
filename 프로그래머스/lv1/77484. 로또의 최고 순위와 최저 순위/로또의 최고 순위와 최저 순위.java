class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //int[] answer = new int[2];
        
        int cnt=0;
        int zeroCount=0;
        
        for(int lotto : lottos){
            if(lotto==0){
                zeroCount++;
            }
            for(int win_num : win_nums){
                if(win_num == lotto){
                    cnt++;
                    break;
                }
            }
        }
        
        
    return new int[]{7-Math.max(cnt+zeroCount,1),7-Math.max(cnt,1)};
    }
}