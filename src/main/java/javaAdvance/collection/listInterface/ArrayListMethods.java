package javaAdvance.collection.listInterface;
import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pavel");
        arrayList.add("Zuyonak");
        arrayList.add("Vasilisa");
        arrayList.add("Glasha");
        arrayList.add("QA Engineer");
//        arrayList.set(0, "QA Automation Engineer");

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList.add("Sveta");
        arrayList.add("Kisialevich");
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
//        System.out.println(arrayList.get(2)); //Get element with index 2
//        for (int i = 0; i < arrayList.size(); i++) { //Get all elements of ArrayLit
//            System.out.println(arrayList.get(i));
//        }
        ArrayList<String> arrayList1 = new ArrayList(arrayList);
        arrayList1.remove(3);
        arrayList1.remove("Glash");
    }
}
