public class n9 {
    //method one:转换为字符串
    public boolean isPalindrome(int x) {
        String input_num = x + "";

        int left_point = 0;
        int right_point = input_num.length() - 1;

        while(left_point <= right_point){
            if(input_num.charAt(left_point) != input_num.charAt(right_point)){
                return false;
            }
            left_point++;
            right_point--;
        }
        return true;
    }
    //method two:不使用字符串
    public boolean isPalindrome(int x) {
        int reverse = 0;
        if(x % 10 == 0 && x != 0){
            return false;
        }
        while(x >= reverse){
            if(x == reverse || x / 10 == reverse){
                return true;
            }
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return false;
    }
}
