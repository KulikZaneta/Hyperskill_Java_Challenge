package instance_method.count_cart;

class Cart {
    private int total;

    public Cart() {
        this.total = 0;
    }

    public int addToCart(int price) {
        total += price;
        return total;
    }

    public int getTotal() {
        return total;
    }
}