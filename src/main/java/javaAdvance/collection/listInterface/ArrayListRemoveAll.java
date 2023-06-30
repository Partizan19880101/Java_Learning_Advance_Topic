package javaAdvance.collection.listInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListRemoveAll {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pavel");
        arrayList.add("Zuyonak");
        arrayList.add("Vasilisa");
        arrayList.add("Glasha");
        System.out.println(arrayList);
        List<Integer> list3 = List.of(3, 4, 6); //static method list of

//        Object[] array = arrayList.toArray();
//        String[] arr = arrayList.toArray(new String[4]);
////        System.out.println(java.util.Arrays.toString(arr));
//        for (String s : arr) {
//            System.out.println(s);
//        }

        List<String> list2 = List.copyOf(arrayList);
        System.out.println(list2);


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Kate");
        arrayList2.add("Nadia");
        arrayList2.add("Darya");
        arrayList2.add("Vasilisa");
//        arrayList.removeAll(arrayList2); //delete all elements which match in parameter List
        arrayList.retainAll(arrayList2); //save all elements which match in parameter List
        System.out.println(arrayList);

        boolean result = arrayList.containsAll(arrayList2);
        System.out.println(result);
        List<String> subL = arrayList2.subList(0, 2);
        subL.add("ll");
        System.out.println(subL);

    }

}
