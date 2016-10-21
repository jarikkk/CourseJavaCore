package task8_1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AbstractDaoImplementation abstractDaoImplementation = new AbstractDaoImplementation();
        ArrayList <Integer> list = new ArrayList<>();

        list.add(15);

        abstractDaoImplementation.save(list);
        abstractDaoImplementation.delete(list);
        abstractDaoImplementation.deleteAll(list);
        abstractDaoImplementation.saveAll(list);
        abstractDaoImplementation.getList();
    }

}
