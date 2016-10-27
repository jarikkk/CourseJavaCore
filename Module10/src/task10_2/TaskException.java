package task10_2;

import java.util.List;

public class TaskException extends Throwable {

    String string;

    public TaskException(String string) {

        this.string = string;

    }


    public void printString() {
        System.out.println("Printed string is: " + string);

    }


    public static void main(String[] args) {

        Integer i = 0;

        try {
            TaskException t = new TaskException(i.toString());
            t.printString();
        } catch (Throwable e) {
            System.out.println("Got exception");
        }


    }

}
