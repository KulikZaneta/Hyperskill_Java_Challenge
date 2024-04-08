package polymorphism.number_generator;

class NumberGenerator extends BaseNumberGenerator {


    public NumberGenerator(int base) {
        super(base);
    }

    @Override
    public int generate() {

        return super.generate() + getNumber();
    }


    protected int getNumber() {
        return this.base - 7;
    }

    @Override
    public String toString() {
        return "NumberGenerator{" +
                "base=" + base +
                '}';
    }
}

