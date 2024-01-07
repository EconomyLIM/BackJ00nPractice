import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
		Arrays.sort(phone_book);
        
        String word = "";
        String value = "";
        
        for(int i = 0 ; i < phone_book.length -1; i++){
            word = phone_book[i];
             value = phone_book[i+1];
            if(value.startsWith(word)){
                return false;
            } // if
        } //for
	        
	    return true;
    }
}