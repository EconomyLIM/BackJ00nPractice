import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 보석의 무게는 가벼운것부터, 가격은 비싼거부터
//		PriorityQueue<Jewelries> queue = new PriorityQueue<>( (o1, o2) 
//				-> o1.jewelryPrice == o2.jewelryPrice ? o2.jewelryWeight - o1.jewelryWeight : o1.jewelryPrice - o2.jewelryPrice );
		
		ArrayList<Jewelries> list = new ArrayList<>(); 
		int bag[] = new int[k];
		
		// jewelry init
		Jewelries jewelries;
		int weight, price;
		StringTokenizer convert;
		for (int i = 0; i < n; i++) {
			convert = new StringTokenizer(br.readLine());
			weight =  Integer.parseInt(convert.nextToken());
			price = Integer.parseInt(convert.nextToken());
			jewelries = new Jewelries(weight, price);

			list.add(jewelries);
		} // for
		
		// 보석의 무게는 가벼운것부터, 가격은 비싼거부터
		Collections.sort(list , (o1, o2) -> o1.jewelryWeight - o2.jewelryWeight );
		
		// bag init
		for (int i = 0; i < bag.length; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(bag); // 가방 크기가 작은것부터
		
		long sum = 0;
		int j = 0;
		int bagWeight;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for (int i = 0; i < bag.length; i++) {
			bagWeight = bag[i];
			while ( j < n && list.get(j).jewelryWeight <= bagWeight ) {
				pq.offer(list.get(j++).jewelryPrice);
			}
			
			if( !pq.isEmpty() ) {
				sum += pq.poll();
			}
			
		} // for
		
		System.out.println(sum);
	} // main
	
	public static class Jewelries {
		int jewelryWeight;
		int jewelryPrice;
		
		public Jewelries(int jewelryWeight, int jewelryPrice ) {
			this.jewelryWeight = jewelryWeight;
			this.jewelryPrice = jewelryPrice;
		}
	} // class Node
} // class