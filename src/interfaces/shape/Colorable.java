package interfaces.shape;

public interface Colorable {
    default String color() {
        return "No Color";
    }
}
