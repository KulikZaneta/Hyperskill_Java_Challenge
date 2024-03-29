package _super.multilevel_inheritance;

class B extends A {

    protected int n = 20;
    protected String s = "str";
    protected char ch = 'z';

    public B(int n, String s, char ch) {
        super(n);
        this.s = s;
        super.ch = ch;
    }

    public void print() {
        System.out.println(super.n + " " + super.s + " " + ch);
    }

    public void printAll() {
        System.out.println("super.n = " + super.n);
        System.out.println("super.s = " + super.s);
        System.out.println("super.ch = " + super.ch);
        System.out.println("n = " + n);
        System.out.println("s = " + s);
        System.out.println("ch = " + ch);

        System.out.println(super.n + " " + super.s + " " + ch);
    }
}

