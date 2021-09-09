public class n7 {
    public static int reverse(int x) {
        boolean minus = false;
        if(x < 0){
            minus = true;
            x = -x;
        }

        int out_int = 0;
        int temp = 0;

        while(x != 0){
            if (out_int < Integer.MIN_VALUE / 10 || out_int > Integer.MAX_VALUE / 10) {
                return 0;
            }
            temp = x % 10;
            out_int = 10 * out_int + temp;
            x = x / 10;
        }

        if(minus)
            out_int = - out_int;

        return out_int;
    }
}
