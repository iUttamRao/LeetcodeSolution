class Solution {
    public int trap(int[] bars) {
      
        int leftBarsMax[] = new int[bars.length]; // Prefix Max
        int rightBarsMax[] =new int[bars.length]; // Suffix Max
        leftBarsMax[0] = bars[0]; // Set the first element in prefix Max
        for(int i=1;i<bars.length;i++){
            leftBarsMax[i]=Math.max(leftBarsMax[i-1],bars[i]);
        }
        

        rightBarsMax[rightBarsMax.length-1]=bars[bars.length-1]; //Set the last element in the suffix max
        for(int i=rightBarsMax.length-2;i>=0;i--){
            rightBarsMax[i]=Math.max(rightBarsMax[i+1],bars[i]);
        }
        
        int amountOfWater =0;
        for(int i=0;i<bars.length;i++){
            int currentPillar=bars[i];
            int barMinHeight =Math.min(leftBarsMax[i],rightBarsMax[i]);
            if(barMinHeight>currentPillar){
                amountOfWater+=barMinHeight-currentPillar;
            }
        }
        return amountOfWater;
        
    }
}