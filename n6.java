public class n6 {
    public static String convert(String s, int numRows){
        int s_len = s.length();
        char[][] out_s = new char[numRows][s_len];
        for(int i = 0; i < numRows; ++i){
            for(int j = 0; j < s_len; ++j){
                out_s[i][j] = '0';
            }
        }
        int index = 0;
        int row_position = 0;
        int col_position = 0;

        try {
            while(index < s_len){
                for(int i = 0; i < numRows; ++i){
                    System.out.println(i + "," + col_position);
                    out_s[i][col_position] = s.charAt(index++);
                }
                row_position = row_position + numRows - 1;

                for(int i = 0; i < numRows - 2; ++i){
                    row_position -= 1;
                    col_position += 1;
                    System.out.println(row_position + "," + col_position);
                    out_s[row_position][col_position] = s.charAt(index++);
                }
                row_position -= 1;
                col_position += 1;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        String output_s = "";
        for(int i = 0; i < numRows; ++i){
            for(int j = 0; j < s_len; ++j){
                if(out_s[i][j] != '0'){
                    output_s += out_s[i][j];
                }
            }
        }
        return output_s;
    }
}
/**
 * class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
 */