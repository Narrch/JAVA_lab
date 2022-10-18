public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Lada lada = new Lada();
        lada.showInfo(1999, "АИ-92 ", "Russian", "Легковое авто");
        Student stud = new Student();
        System.out.println("Машина подходит студенту");
        stud.showStudCar();
        stud.showStudGoes();
        stud.goFinish();
        System.out.println("----------------------------Reflector----------------------------");
        Reflector.dumpEverything(lada.getClass().getName());
        Reflector.dumpEverything(lada.getClass().getSuperclass().getName());
    }
}