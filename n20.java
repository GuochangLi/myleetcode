public class n20 {
    public static boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            switch(c){
                case '(': 
                case '{':
                case '[': symbols.add(c); break;
                case ')': if(symbols.isEmpty() == false && symbols.peek() == '('){symbols.pop();}else{return false;}break;
                case ']': if(symbols.isEmpty() == false && symbols.peek() == '['){symbols.pop();}else{return false;}break;
                case '}': if(symbols.isEmpty() == false && symbols.peek() == '{'){symbols.pop();}else{return false;}break;
                default : return false;
            }
        }
        if(symbols.isEmpty() == false){
            return false;
        }
        return true;
    }
}
