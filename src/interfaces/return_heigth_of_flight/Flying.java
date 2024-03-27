package interfaces.return_heigth_of_flight;

public interface Flying {
    int METRIC_DIVIDER = 1000;
    int getHeight();

    default int getHeightInKm() {
        //return (int) (getHeight() * 0.001);
        return getHeight() / METRIC_DIVIDER;
    }
}
