

public class Main {
    public static void main(String[] args) {
       System.out.println(convert("PAYPALISHIRING", 4));
    }
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
