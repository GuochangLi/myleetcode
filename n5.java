/*
    @author:lgc
    @data:2021.4.14
    @question:最长回文子串
    @note:动态规划，第一个直接递归，第二种方法构造动态规划并填表，注意填表的顺序
*/
public class n5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    static String longestPalindrome(String s) {
        char[] sarray = s.toCharArray();
        int leftindex = 0;
        int rightindex = 0;
        int maxlength = -1;
        for(int i = s.length() - 1; i >= 0; --i){
            for(int j = 0; j <= i; ++j){
                if(ispalindrome(sarray, j, i) == true){
                    if(i - j > maxlength){
                        maxlength = i - j;
                        rightindex = i;
                        leftindex = j;
                        if(maxlength == s.length() - 1){
                            return s.substring(leftindex, rightindex + 1);
                        }
                    }
                }
            }
        }
        return s.substring(leftindex, rightindex + 1);
    }
    static boolean  ispalindrome(char[] s, int left, int right){
        if(right - left == 0){
            return true;
        }
        if(right - left == 1 && s[left] == s[right]){
            return true;
        }

        return s[left] == s[right] && ispalindrome(s, left + 1, right - 1);
    }

    static String longestPalindrome_2(String s) {
        char[] sarray = s.toCharArray();
        int [][] dynamictable = new int[s.length()][s.length()];
        int maxlength = -1;
        int left = 0;
        int right = 0;
        for(int i = 0; i < s.length(); ++i){
            dynamictable[i][i] = 1;
        }
        for(int col = 0; col < s.length(); ++col){
            for(int row = 0; row <= col; ++row){
                if(row == col){
                    dynamictable[row][col] = 1;
                }
                else if(col - row == 1){
                    dynamictable[row][col] = (sarray[row] == sarray[col]) ? 1 : 0;
                }
                else{
                    dynamictable[row][col] = (sarray[row] == sarray[col])?dynamictable[row + 1][col - 1]:0;
                }
                
                if(dynamictable[row][col] == 1){
                    if(col - row > maxlength){
                        maxlength = col - row;
                        left = row;
                        right = col;
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }
    
}