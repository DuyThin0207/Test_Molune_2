package Manager;

import Store.Store;

import java.util.ArrayList;
import java.util.List;

public interface IManager<E> {
    void add(E e);
    boolean edit(int id, E e);
    void delete(int id);
    List<E> findAll();
    List<E> searchName(String name);
    List<E> searchProductType(String name);
    E searchId(int id);
    int findIndexById (int id);

}
