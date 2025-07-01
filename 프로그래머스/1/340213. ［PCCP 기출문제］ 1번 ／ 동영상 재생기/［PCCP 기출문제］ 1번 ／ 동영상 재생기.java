class Solution {
    // "mm:ss" → 초 변환
    private int toSec(String t) {
        String[] s = t.split(":");
        return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
    }
    // 초 → "mm:ss"
    private String toMMSS(int sec) {
        int m = sec / 60;
        int s = sec % 60;
        return String.format("%02d:%02d", m, s);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoTime = toSec(video_len);
        int currentTime = toSec(pos);
        int opStart = toSec(op_start);
        int opEnd = toSec(op_end);

        // 시작 위치가 오프닝이면 바로 건너뜀
        if (currentTime >= opStart && currentTime <= opEnd) {
            currentTime = opEnd;
        }

        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                currentTime = Math.max(0, currentTime - 10);
            } else if (cmd.equals("next")) {
                currentTime = Math.min(videoTime, currentTime + 10);
            }
            // 오프닝 구간 건너뛰기
            if (currentTime >= opStart && currentTime <= opEnd) {
                currentTime = opEnd;
            }
        }
        return toMMSS(currentTime);
    }
}