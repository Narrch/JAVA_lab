import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TaskMap {
    public static String getAlphabet(int i) {//функция чтобы найти букву по номеру
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
    public static void main(String[] args) {

        //HashMap
        HashMap<Integer, String> myMap = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            myMap.put(i, getAlphabet(i));
        }
        HashSet<Integer> myHashSet = new HashSet<Integer>(myMap.keySet());
        System.out.println(myHashSet);

        ArrayList<String> myArrayList = new ArrayList<>(myMap.values());
        System.out.println(myArrayList);

        System.out.println("Размер массива - " + myMap.size());
        myMap.clear();
        System.out.println("Проверка на пустоту - "+myMap.isEmpty());


        //Set
        for (Integer i = 27; i < 31; i++) {
            myHashSet.add(i);
        }
        System.out.println(myHashSet);
        for (Integer i = 1; i < 26; i++) {
            myHashSet.remove(i);
        }
        System.out.println(myHashSet);
        if (myHashSet.add(30)){
            System.out.println("Число добавлено");
        }else{
            System.out.println("Такое число уже есть");
        }


        // ArrayList
        int lSize = myArrayList.size();
        System.out.println("ArrayList - "+lSize);
        for (Integer i=1; i<14; i++){
            myArrayList.remove(getAlphabet(i));
            myArrayList.add(getAlphabet(i));
        }
        System.out.println(myArrayList);
    }
}
