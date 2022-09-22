class Solution {
    public String capitalizeTitle(String title) {
        
        String []strArray = title.split(" ");
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].length()<=2){
                strArray[i]=strArray[i].toLowerCase();
            }
            else{
                strArray[i]=strArray[i].substring(0,1).toUpperCase()+strArray[i].substring(1).toLowerCase();
            }
        }
        String res="";
        for(int i=0;i<strArray.length;i++){
            if(i<strArray.length-1){
                res+=strArray[i]+" ";
            }
            else{
                res+=strArray[i];
            }
        }
        return res;
    }
}