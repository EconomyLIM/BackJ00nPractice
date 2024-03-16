class Solution {
    public String solution(String my_string) {
        
        String temp[] = {"a", "e", "i", "o", "u"};
        for(int i = 0 ; i < temp.length ; i++){
            my_string = my_string.replaceAll(temp[i], "");
        }
        return my_string;
    }
}