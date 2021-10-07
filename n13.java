public class n13 {
    public static int romanToInt(String s) {
        Map<String, Integer> basemap = new HashMap<>();
        int[] bases = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] baselabel = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0;i < bases.length; ++i){
            basemap.put(baselabel[i], bases[i]);
        }

        int index = 0;
        int output = 0;
        while(index < s.length()){
            if(index + 2 <= s.length() && basemap.containsKey(s.substring(index, index + 2))){
                output += basemap.get(s.substring(index, index + 2));
                index += 2;
            }
            else{
                output += basemap.get("" + s.charAt(index));
                index++;
            }
        }
        return output;
    }
}
