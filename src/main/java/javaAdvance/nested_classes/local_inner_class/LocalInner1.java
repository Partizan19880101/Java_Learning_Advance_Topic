package javaAdvance.nested_classes.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Meth m = new Meth();
        m.getResult(21, 4);
    }
}
class Meth {
    public void getResult(final int a, final int b) {

        class Delete {
            public int getQuotient(){
                return a / b;
            }
            public int getRemains(){
                return a % b;
            }
        }
        Delete delete = new Delete();
        System.out.println("Del - " + a + " del2 - " + b);
        System.out.println("Quotient - " + delete.getQuotient());
        System.out.println("getRemains - " + delete.getRemains());
    }
}