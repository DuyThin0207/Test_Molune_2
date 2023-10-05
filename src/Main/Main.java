package Main;

import MenuStone.Menu;
import Store.Store;
import readAnd.RWStudent;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        RWStudent rw = new RWStudent();
        rw.readFile();
        menu.showMenuStudent();

    }
}
