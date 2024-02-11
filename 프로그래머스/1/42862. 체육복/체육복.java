import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();
        for(int i : lost){
            list.add(i);
        }
        
        for(int j = 0 ; j < reserve.length; j++ ) {
        	 if(list.contains(reserve[j])){
                 list.remove(Integer.valueOf(reserve[j]));
             }else {
            	 reserveList.add(reserve[j]);
             }
        }
        for(int i = 0 ; i < reserveList.size() ; i++ ){   
            for(int j = 0; j < list.size() ; j++){
            	int temp = list.get(j);
                if( Math.abs(reserveList.get(i) - temp ) <= 1 ){
                    list.remove(j);
                    break;
                }
            } // for
        } //for
        return n - list.size();
    }
}