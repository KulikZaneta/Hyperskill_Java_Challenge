package constructors.many_constructors;

public class Book {
        String title;
        String author;
        double price;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 0;
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getDetails() {
            if (price > 0) {
                return title + " -" + author + " - " + price;
            } else {
                return title + " -" + author + " - " + "0.0";
            }
        }
}

