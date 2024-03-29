package _static.manufacturing_controller;

class ManufacturingController {
    public static int numberOfProducts = 0;

    public static String requestProduct(String product) {
        numberOfProducts++;
        return numberOfProducts + ". Requested " + product;
        //return String.format("%d. Requested %s", ++requestsCount, product);
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}

