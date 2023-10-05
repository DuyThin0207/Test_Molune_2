package Manager;

import Store.Store;

import java.util.ArrayList;

public interface IManager<E> {
    void add(E e);
    boolean edit(int id, E e);
    void delete(int id);
    ArrayList<Store> findAll();
    ArrayList<E> searchName(String name);
    Store searchId(int id);
    int findIndexById (int id);

}
