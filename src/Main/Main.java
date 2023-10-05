package Main;

import MenuStone.Menu;
import readAnd.RWStore;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        RWStore rw = new RWStore();
        rw.readFile();
        menu.showMenuStudent();

    }
}
