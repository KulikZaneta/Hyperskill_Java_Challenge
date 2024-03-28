package overriding.animal;

class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("arf-arf");
    }

}

