public class TestBoxGeneric {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("jiji", "jojo", 2.5));
        bookBox.addItem(new Book("jaja", "jwjw", 3.5));
        System.out.println(bookBox);
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("sassas", "dsa", "iran", 23.3));
        System.out.println(fruitBox);
//        Box box = new Box(Integer);
        System.out.println(BoxUtils.getCountOfItems(bookBox));
    }
}
