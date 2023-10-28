import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < word.length(); i++) {
			for (int j = i+1; j < word.length(); j++) {
				StringBuilder sb1 = new StringBuilder(word.substring(0,i));
				StringBuilder sb2 = new StringBuilder(word.substring(i,j));
				StringBuilder sb3 = new StringBuilder(word.substring(j));
				StringBuilder sb = new StringBuilder();
				sb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
				
				list.add(sb.toString());
			} //for
		} //for
		Collections.sort(list);
		System.out.println(list.get(0));
	} //main
} //class
