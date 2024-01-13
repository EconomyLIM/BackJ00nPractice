import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        String s[] = {"code", "date", "maximum", "remain"};
        List<int[]> list = new ArrayList<>();
        
        int valIndex = 0;
        int sortIndex = 0;
        
        for(int i = 0 ; i < 4 ; i++){
            if(ext.equals(s[i])) valIndex = i;
            if(sort_by.equals(s[i])) sortIndex = i;
        } // for
        
        for(int i = 0; i < data.length ; i++){
            if(data[i][valIndex] < val_ext) list.add(data[i]);
        } // for
        
        final int si = sortIndex;
        
        Collections.sort(list, (o1,o2) -> o1[si] - o2[si] );
        
        return list;
    }
}