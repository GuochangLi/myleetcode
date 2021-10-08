public class n14 {
    // public String longestCommonPrefix(String[] strs) {
    //     if (strs == null || strs.length == 0) {
    //         return "";
    //     }
    //     String prefix = strs[0];
    //     int count = strs.length;
    //     for (int i = 1; i < count; i++) {
    //         prefix = longestCommonPrefix(prefix, strs[i]);
    //         if (prefix.length() == 0) {
    //             break;
    //         }
    //     }
    //     return prefix;
    // }

    // public String longestCommonPrefix(String str1, String str2) {
    //     int length = Math.min(str1.length(), str2.length());
    //     int index = 0;
    //     while (index < length && str1.charAt(index) == str2.charAt(index)) {
    //         index++;
    //     }
    //     return str1.substring(0, index);
    // }
    public static String longestCommonPrefix(String[] strs) {
        int minlen = strs[0].length();
        int minlenindex = 0;
        for(int i = 0; i < strs.length; ++i){
            if(strs[i].length() < minlen){
                minlen = strs[i].length();
                minlenindex = i;
            }
        }
        
        String minlenstr = strs[minlenindex];
        String outputstr = "";
        for(int i = 0; i <= minlenstr.length(); ++i){

            boolean isallequal = true;
            for(int j = 0; j < strs.length; ++j){
                if(strs[j].substring(0, i).equals(minlenstr.substring(0, i))){
                    continue;
                }
                else{
                    isallequal = false;
                    break;
                }
            }
            if(isallequal){
                outputstr = minlenstr.substring(0, i);
            }
        }
        return outputstr;
    }
}
