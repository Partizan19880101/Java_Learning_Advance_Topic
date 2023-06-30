package test;
public class ReplaceString {

    public static void main(String[] args) {
        System.out.println(replaceSymbol("ANAS HA!@"));
    }
    public static char[] replaceSymbol(String str){
        char[] splitter = str.toCharArray();
        char[] afterSwitch = new char[splitter.length];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (splitter[i] == splitter[j]) {
                    afterSwitch[i] = ')';
                    afterSwitch[j] = ')';
                    break;
                }
                afterSwitch[i] = '(';
            }
        }
        return afterSwitch;
    }
}
