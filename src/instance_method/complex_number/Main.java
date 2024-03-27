package instance_method.complex_number;

class Main {
    public static void main(String[] args) {
        //add
        Complex number = new Complex();
        number.real = 10;
        number.image = 4;

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;

        number.add(anotherNumber);
        System.out.println(number);

        //sub
        Complex numberSub = new Complex();
        numberSub.real = 10;
        numberSub.image = 4;

        Complex anotherNumberSub = new Complex();
        anotherNumberSub.real = 6;
        anotherNumberSub.image = 6;

        numberSub.subtract(anotherNumberSub);
        System.out.println(numberSub);

        anotherNumberSub.subtract(numberSub);
        System.out.println(anotherNumberSub);
    }
}