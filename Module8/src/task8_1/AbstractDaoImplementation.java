package task8_1;

import java.util.ArrayList;
import java.util.List;

public class AbstractDaoImplementation<T> implements AbstractDAO<T> {

    List<T> list = new ArrayList<T>();

    @Override
    public T save(T t) {
        System.out.println("Item is saved:" + t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
        System.out.println("Item is removed:" + t);
    }

    @Override
    public void deleteAll(List T) {
        list.removeAll(T);
        System.out.println("Item is removed:" + T);
    }

    @Override
    public void saveAll(List T) {

        System.out.println("Item is saved:" + T);

    }

    @Override
    public List<T> getList() {
        return list;
    }
}
