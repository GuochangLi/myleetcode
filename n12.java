public class n12 {
    public static String intToRoman(int num) {
        String output = "";
        int temp = 0;
        while(num > 0){
            if(num >= 1000){
                temp = num / 1000;
                for(int i = 0 ; i < temp; ++i){
                    output += "M";
                }
                num = num - temp * 1000;
            }
            else if(num >= 900){
                output += "CM";
                num = num - 900;
            }
            else if(num >= 500){
                output += "D";
                num = num - 500;
            }
            else if(num >= 400){
                output += "CD";
                num = num - 400;
            }
            else if(num >= 100){
                temp = num / 100;
                for(int i = 0; i < temp; ++i){
                    output += "C";
                }
                num = num - temp * 100;
            }
            else if(num >= 90){
                output += "XC";
                num = num - 90;
            }
            else if(num >= 50){
                output += "L";
                num = num - 50;
            }
            else if(num >= 40){
                output += "XL";
                num = num - 40;
            }
            else if(num >= 10){
                temp = num / 10;
                for(int i = 0; i < temp; ++i){
                    output += "X";
                }
                num = num - temp * 10;
            }
            else if(num >= 9){
                output += "IX";
                num = num - 90;
            }
            else if(num >= 5){
                output += "V";
                num = num - 5;
            }
            else if(num >= 4){
                output += "IV";
                num = num - 4;
            }
            else{
                temp = num / 1;
                for(int i = 0; i < temp; ++i){
                    output += "I";
                }
                num = num - temp * 1;
            }
        }
        return output;
    }
    // another solution
    // public static String intToRoman(int num){
    //     String output = "";
    //     int[] bases = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //     String[] baselabel = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    //     for(int i = 0; i < bases.length; ++i){
    //         if(num >= bases[i]){
    //             if(i % 4 == 0){
    //                 int temp = num / bases[i];
    //                 for(int j = 0; j < temp; ++j){
    //                     output += baselabel[i];
    //                 }
    //                 num -= temp * bases[i];
    //             }
    //             else{
    //                 output += baselabel[i];
    //                 num = num - bases[i];
    //             }
    //         }
            
    //     }
    //     return output;

    // }
}
