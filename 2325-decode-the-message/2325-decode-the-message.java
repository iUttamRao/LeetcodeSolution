class Solution {
    public String decodeMessage(String key, String message) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        key=key.replace(" ", "");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < key.length(); i++){
            if (!result.toString().contains("" + key.charAt(i))){
                result.append(key.charAt(i));
            }
        }
        StringBuilder word= new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i)!=' '){
                int n;
                n=result.toString().indexOf(message.charAt(i));
                word.append(alphabet.charAt(n));
            }else
                word.append(" ");
        }
        return word.toString();
    }
}