
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int copy[]=score.clone();
        Arrays.sort(copy);
        String ans[]=new String[score.length];
        for(int i=0;i<copy.length;i++){
            for(int j=0;j<score.length;j++){
                if(copy[i]==score[j]){
                    if(score[j]==copy[copy.length-1]){
                        ans[j]="Gold Medal";
                    }
                    else if(score[j]==copy[copy.length-2]){
                        ans[j]="Silver Medal";
                    }
                   else if(score[j]==copy[copy.length-3]){
                        ans[j]="Bronze Medal";
                    }
                    else{
                        ans[j]=Integer.toString(copy.length-i);
                    }
                }
            }
        }
        return ans;
    }
}