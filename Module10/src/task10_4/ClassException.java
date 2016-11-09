package task10_4;


public class ClassException {


    public void g() throws FirstException {
        throw new FirstException();
    }

    public void f() throws SecondException {
        try {
            g();
        } catch (FirstException e) {
            System.out.println(e.getExceptionMessege());
            throw new SecondException();
        }


    }

    public static void main(String[] args) throws FirstException {

        ClassException classException = new ClassException();
        try {
            classException.f();
        } catch (SecondException s) {
            System.out.println(s.getExceptionMessege());
        }
    }




}


