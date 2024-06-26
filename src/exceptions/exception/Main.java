package exceptions.exception;

class MyException extends Exception { //Throwable
    public MyException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}