class Solution {
    public int[] solution(int n, int m) {
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        int less = 1;
        int lesstemp = 0;
        while( less <= min ){
            if( n % less == 0 && m % less == 0){
                lesstemp = less;
            }
            less++;
        }
        
        int more = max;
        int moretemp = 0;
        while (true){
            if( more % n == 0 && more % m == 0){
                moretemp = more;
                break;
            }
            more++;
        }
        
        return new int[]{lesstemp, moretemp};
    }
}