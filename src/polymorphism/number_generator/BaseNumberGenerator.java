package polymorphism.number_generator;

class BaseNumberGenerator {

    protected int base;

    public BaseNumberGenerator(int base) {
        this.base = base;
    }

    public int generate() {
        return base + 11;
    }

    public int getBase() {
        return base;
    }
}

