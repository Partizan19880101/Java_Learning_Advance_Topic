package test;

public class GetSymbol {

    public static void main(String[] args) {
        getSymbol("1231231425345");
    }


    public static void getSymbol(String str) {
        for (int i = 0; i < str.length(); i+=3) {
            System.out.println(str.toCharArray()[i]);
        }
    }
}
