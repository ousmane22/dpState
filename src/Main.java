import state.AvionImpl;

public class Main {
    public static void main(String[] args) {
        AvionImpl avion =  new AvionImpl();
        avion.doActivity();
        System.out.println("=====================");
        avion.SortirDuGarage();
    }
}