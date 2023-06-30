package live_coding;

public class RemoveSpaces {

    public static Object removeSpaces(){
        String s = "I love1               kiss turkish  girls";

        String[] arr = s.split("\\s+");

        for (String pp : arr) {
            System.out.println(new StringBuilder(pp).reverse());
        }
        return null;
    }
}
