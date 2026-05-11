public class Book implements Borrowable {

    private int id;
    private String title;
    private String author;
    private boolean borrowed;

    private static int counter = 1;
    private static int countBooks = 0;

    public Book(String title, String author) {

        this.id = counter++;
        this.title = title;
        this.author = author;
        this.borrowed = false;

        countBooks++;
    }

    @Override
    public void borrowBook() {

        if (!borrowed) {

            borrowed = true;
            System.out.println("Вы взяли книгу: " + title);

        } else {

            System.out.println("Книга уже выдана!");

        }

    }

    @Override
    public void returnBook() {

        if (borrowed) {

            borrowed = false;
            System.out.println("Книга возвращена: " + title);

        } else {

            System.out.println("Книга не была взята.");

        }

    }

    public void displayInfo() {

        System.out.println(
                "ID: " + id +
                        " | Название: " + title +
                        " | Автор: " + author +
                        " | Статус: " + (borrowed ? "Выдана" : "Доступна")
        );

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public static int getCountBooks() {
        return countBooks;
    }

}