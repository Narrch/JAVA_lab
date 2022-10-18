public class Lada implements Car {
    public void showDate(int x) {
        System.out.println(x);
    }
    public void showFuel(String s) {
        System.out.println(s);
    }
    public void showCountry(String n) {
        System.out.println(n);
    }
    public void showType(String u){
        System.out.println(u);
    }
    public void showInfo(int x, String s,String n, String u){
        showDate(x);
        showFuel(s);
        showCountry(n);
        showType(u);
    }
}
