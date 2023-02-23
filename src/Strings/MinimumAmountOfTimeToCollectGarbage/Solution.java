package Strings.MinimumAmountOfTimeToCollectGarbage;

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int pLastIndex = 0;
        int mLastIndex = 0;
        int gLastIndex = 0;
        int totalTime = 0;
        for(int i = 0; i<garbage.length;i++){
            for(char c : garbage[i].toCharArray()){
                if(c == 'P') pLastIndex = i;
                if(c == 'M') mLastIndex = i;
                if(c == 'G') gLastIndex = i;
            }
            //it is used to calculate total length of string in array
            totalTime +=garbage[i].toCharArray().length;
        }
        for(int i =1; i<travel.length; i++){
            travel[i] = travel[i]+travel[i-1];
        }
        totalTime +=pLastIndex == 0 ? 0 : travel[pLastIndex-1];
        totalTime +=mLastIndex == 0 ? 0 : travel[mLastIndex-1];
        totalTime +=gLastIndex == 0 ? 0 : travel[gLastIndex-1];

        return totalTime;
    }
}
