package inheritance.animal;

class Cat extends Pet {

    protected String color;

    public Cat(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

