package task10_4;


public class ClassException {


    public void g() throws FirstException {
        try {
            throw new FirstException();
        } finally {

        }
    }

    public void f() throws SecondException {
        try {
            g();

        } catch (FirstException e) {
            System.out.println("This is first exception with calling method g()");
            throw new SecondException();

        }


    }

    public static void main(String[] args) throws FirstException {

        ClassException classException = new ClassException();
        try {
            classException.f();
        } catch (SecondException s) {
            System.out.println("This is second exception with calling method f()");
        }


    }


}


