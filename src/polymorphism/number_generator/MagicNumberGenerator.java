package polymorphism.number_generator;

class MagicNumberGenerator extends NumberGenerator {


    public MagicNumberGenerator(int base) {
        super(base);
    }

    @Override
    protected int getNumber() {
        return this.base + 7;
    }

    @Override
    public String toString() {
        return "MagicNumberGenerator{" +
                "base=" + base +
                '}';
    }

    public static void main(String[] args) {
        BaseNumberGenerator generator = new MagicNumberGenerator(10);
        System.out.println(generator.generate());
    }
}

