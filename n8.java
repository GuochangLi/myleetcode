/*状态机
*/
public class n8 {
    public int myAtoi(String s) {
        int s_len = s.length();
        DFM dfm = new DFM();

        for(int i = 0; i < s_len; ++i){
            dfm.accept_input(s.charAt(i));
        }

        return dfm.minus==true?-(int)dfm.out_num:(int)dfm.out_num;
    }
}
class DFM{
    public long out_num = 0;
    public boolean minus = false;
    private String state = "start";
    private Map<String, String[]> state_table = new HashMap<>();
    public DFM() {
         state_table.put("start", new String[]{"start", "signed", "number", "end"});
         state_table.put("signed", new String[]{"end", "end", "number", "end"});
         state_table.put("number", new String[]{"end", "end", "number", "end"});
         state_table.put("end", new String[]{"end", "end", "end", "end"});
     }

     public void accept_input(char c){
         statetransform(c);
         if(state.equals("signed")){
             minus = c == '+'?false:true;
         }
         else if(state.equals("number")){
             out_num = out_num * 10 + c - '0';
             out_num = minus==true?Math.min(out_num, -(long)Integer.MIN_VALUE):Math.min(out_num, Integer.MAX_VALUE);
         }
     }

     public void statetransform(char c) {
         if(c == '+' || c == '-'){
            state = state_table.get(state)[1];
         }
         else if(c == ' '){
            state = state_table.get(state)[0];
         }
         else if(c >= '0' && c <= '9'){
            state = state_table.get(state)[2];
         }
         else{
            state = state_table.get(state)[3];
         }
     }
}