public class n17 {
    static String[] num2char = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        Node root = new Node("");
        constructtree(root, digits, 0);
        List<String> out = new ArrayList<>();
        traveltree(root, out, 0, digits.length(), "");
        return out;
    }
    public static void constructtree(Node root, String digits, int depth){
        if(depth == digits.length()){
            return;
        }
        String s = num2char[digits.charAt(depth) - '0'];
        root.children = new Node[s.length()];
        for(int i = 0; i < s.length(); ++i){
            root.children[i] = new Node("" + s.charAt(i));
            constructtree(root.children[i], digits, depth + 1);
        }
    }
    public static void traveltree(Node root, List<String> out, int depth, int maxdep, String s){
        if(depth == maxdep){
            out.add(s);
            return;
        }
        for(Node n : root.children){
            s = s + n.val;
            traveltree(n, out, depth + 1, maxdep, s);
            s = s.substring(0, s.length() - 1);
        }
    }
}
class Node{
    public String val;
    public Node[] children;

    public Node(String s){
        val = s;
    }
}