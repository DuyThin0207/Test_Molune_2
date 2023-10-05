package Manager;

import Store.Store;
import readAnd.RWStudent;

import java.util.ArrayList;

public class Manager implements IManager<Store> {
    private ArrayList<Store> list;
    private RWStudent rwStudent = new RWStudent();

    public Manager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Store store) {
        list.add(store);
        rwStudent.writeFile(list);
    }

    @Override
    public boolean edit(int id, Store store) {
        int index = findIndexById(id);
        if (index == -1) {
            return false;
        }
            list.set(index, store);
            rwStudent.writeFile(list);
            return true;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        rwStudent.writeFile(list);
        list.remove(index);
    }

    @Override
    public ArrayList<Store> findAll() {
        return list;
    }

    @Override
    public ArrayList<Store> searchName(String name) {
        ArrayList<Store> stores = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                stores.add(list.get(i));
            }
        }
        return stores;
    }

    @Override
    public Store searchId(int id) {
        int index = findIndexById(id);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}