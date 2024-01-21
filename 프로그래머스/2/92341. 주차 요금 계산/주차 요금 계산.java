import java.util.*;

class Solution {
    public List<Integer> solution(int[] fees, String[] records) {

        Map<String, List<Integer> > map = new HashMap<>();
        List <Integer> list = null;
        List <Integer> answer = new ArrayList<>();
        
        String row[] = null;
        String carNumber = "";
        int time;
        for(int i = 0 ; i < records.length ; i++){
            
            row = records[i].split(" ");
            carNumber = row[1];
            time = convert(row[0]);

            if( !map.containsKey(carNumber) ){
                list = new ArrayList<>();
                map.put(carNumber, list);
            }
            
            list = map.get(carNumber);
            list.add(time);
            
        } // for
        Map<String, List<Integer>> sortedMap = new TreeMap<>(map);
        int timeTemp = 0;
        for(Map.Entry<String, List<Integer>> entry : sortedMap.entrySet() ){
            timeTemp = 0;
            list = entry.getValue();
            if(list.size() %2 == 1 ){
                list.add( convert("23:59") );
            }
            
            for(int z = list.size() -1 ; z >= 0 ; z-= 2){
                int endTime =  list.get(z);
                int startTime =  list.get(z-1);

                timeTemp += (endTime-startTime);
            }
            
            if( timeTemp <= fees[0] ){
                answer.add(fees[1]);
            }else{
                
                int diffTime = timeTemp - fees[0];
                
                diffTime = (int) Math.ceil(diffTime /(double) fees[2] );
                answer.add(fees[1] + diffTime*fees[3]);
            }
            
        } // for

        return answer;
    } // solution
    
    public static int convert(String time){
        String temp [] = time.split(":");
        
        return Integer.parseInt( temp[0] ) * 60 + Integer.parseInt( temp[1] );
        
    }
}