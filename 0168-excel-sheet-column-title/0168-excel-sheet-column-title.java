class Solution {
    public String convertToTitle(int colNum) {
        char[] map = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        StringBuilder sb = new StringBuilder();
        int rem = 0;
        while(colNum > 26){
            rem = colNum % 26;
            colNum = colNum/26;
            if(rem==0) {
                rem = 26;
                colNum--;
            }
            sb.append(map[rem-1]);
        }
        sb.append(map[colNum-1]);
        return sb.reverse().toString();
    }
}