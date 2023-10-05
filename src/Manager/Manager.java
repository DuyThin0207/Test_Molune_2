package Manager;

import Store.Store;
import readAnd.RWStore;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IManager<Store> {
    private List<Store> list;
    private RWStore rwStudent = new RWStore();

    public Manager() {
        this.list = rwStudent.readFile();
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
    public List<Store> findAll() {
        return list;
    }

    @Override
    public List<Store> searchName(String name) {
        List<Store> stores = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                stores.add(list.get(i));
            }
        }
        return stores;
    }

    @Override
    public List<Store> searchProductType(String name) {
        List<Store> stores = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProductType().toLowerCase().contains(name.toLowerCase())) {
                stores.add(list.get(i));
            }
        }
        return stores;
    }

    @Override
    public Store searchId(int id) {
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
