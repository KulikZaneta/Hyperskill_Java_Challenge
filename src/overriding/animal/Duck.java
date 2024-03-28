package overriding.animal;

class Duck extends Animal {
    @Override
    public void say() {
        System.out.println("quack-quack");
    }

}

