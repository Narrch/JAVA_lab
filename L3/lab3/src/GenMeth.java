public class GenMeth {

    public static <T> void printT(T[] items){
        for (T item: items){
            System.out.print(item + " ");
        }
    }

    public static void main (String args[]){
        GenClass <String> myGenClass1 = new GenClass<String>("Привет мир!");
        String a = myGenClass1.getId();
        System.out.println(a);

        GenClass <Integer> myGenClass2 = new GenClass<Integer>(1234567890);
        Integer b = myGenClass2.getId();
        System.out.println(b);

        GenMeth gm = new GenMeth();
        String[] chars = {"A","Б","В","Г","Д"};
        Integer[] numbs = {1,2,3,4,5,6,7,8,9,0};
        gm.printT(chars);
        gm.printT(numbs);
    }
}
