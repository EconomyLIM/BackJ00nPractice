class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int doTime = bandage[0]; // 시전 시간
        int upHealthPerSecond = bandage[1]; // 초당 회복량
        int addUpHealth = bandage[2]; // 추가 회복량
        
        int startSecond = 1;
        int maxHealth = health;
        
        for(int i = 0 ; i < attacks.length ; i++){
            int currentSecond = attacks[i][0];
            int attackDamage =  attacks[i][1];
            
            // 여태까지 지난 시간의 회복량 더하고
            int duration = Math.max(currentSecond - startSecond - 1, 0); // 2
            int secondHealth = duration * upHealthPerSecond;
            int addHealth = (duration / doTime) * addUpHealth;
            // System.out.println(duration);
            // System.out.println(secondHealth);
            // System.out.println(addHealth);
            health = Math.min(maxHealth, health + secondHealth + addHealth);
            
            // 현재 공격량 뺀 다음
            health -= attackDamage;
            
            System.out.println(health);
            // 죽었으면 -1 리턴
            if(health <= 0){
                return -1;
            }
            // 현재시간 동기화
            startSecond = currentSecond;
        }
        return health;
    }
}
/*
int answer = 0;
        
        int doTime = bandage[0]; // 시전 시간
        int secondUpHealth = bandage[1]; // 초당 회복량
        int addUpHealth = bandage[2]; // 추가 회복량
        
        int currentSecond = 0;
        int maxSecond = attacks[attacks.length-1][0];
        
        int currentHealth = health;
        int temp = 0; // attacks 배열 접근 인덱스
        int currentKeepTime = 0; // 연속 스킬 시전 시간
        
        while(currentSecond <= maxSecond){
            // 초기상태는 어차피 아무것도 안되니깐 1로 시작
            currentSecond ++;
            
            // 현재 체력이 0 이하로 떨어지면 0으로 리턴
            if(currentHealth <=0){
                return 0;
            }
            
            // 몬스터가 공격할 시 체력 추가 X, 시전시간 0으로 변경
            if(attacks[temp][0] == currentSecond){
                currentHealth -= attacks[temp][1];
                currentKeepTime = 0;
                temp ++;
                continue;
            }
            
            // 최대 회복량 넘지 않아야 함
            currentHealth = Math.min(health, currentHealth + secondUpHealth);
            if(currentKeepTime == doTime){
                currentHealth = Math.min(health, currentHealth + addUpHealth);
                continue;
            }
            currentKeepTime ++;
        }
        
        return currentHealth;
*/