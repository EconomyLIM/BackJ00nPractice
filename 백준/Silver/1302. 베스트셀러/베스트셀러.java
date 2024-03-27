import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String line;
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			line = br.readLine();
			
			map.put(line, map.getOrDefault(line, 0) + 1);
		} // for
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		int max = 0;
		String tempString = "";
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			
			int tempInt = entry.getValue();
			String name = entry.getKey();
			
			if(max <= tempInt) {
				if(max == tempInt) {
					if( tempString.compareTo(name) < 0 )
						continue;
					else {
						tempString = name;
					}
					
					
				}else {
					max = tempInt;
					tempString = name;
				}
			}
		}
		
		System.out.println(tempString);
		
	}
}