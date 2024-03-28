package anonymized_class.anonymized_class;

interface SomeInterface {

    int method();

    default int anotherMethod() { // default -> should have body / override possible
        return -1;
    }

}
