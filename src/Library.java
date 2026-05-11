import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {

        books.add(book);

    }

    public void showBooks() {

        System.out.println("\n===== СПИСОК КНИГ =====");

        for (Book book : books) {

            book.displayInfo();

        }

        System.out.println("\nВсего книг: " + Book.getCountBooks());

    }

    public void borrowBook(int id) {

        try {

            for (Book book : books) {

                if (book.getId() == id) {

                    book.borrowBook();
                    return;

                }

            }

            throw new LibraryException("Книга с таким ID не найдена!");

        } catch (LibraryException e) {

            System.out.println(e.getMessage());

        }

    }

    public void returnBook(int id) {

        try {

            for (Book book : books) {

                if (book.getId() == id) {

                    book.returnBook();
                    return;

                }

            }

            throw new LibraryException("Книга с таким ID не найдена!");

        } catch (LibraryException e) {

            System.out.println(e.getMessage());

        }

    }

    public void findBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {

                book.displayInfo();
                found = true;

            }

        }

        if (!found) {

            System.out.println("Книга не найдена.");

        }

    }

    public void addDefaultBooks() {

        books.add(new Book("Война и мир", "Лев Толстой"));
        books.add(new Book("Преступление и наказание", "Федор Достоевский"));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        books.add(new Book("Анна Каренина", "Лев Толстой"));
        books.add(new Book("Отцы и дети", "Иван Тургенев"));
        books.add(new Book("Евгений Онегин", "Александр Пушкин"));
        books.add(new Book("Герой нашего времени", "Михаил Лермонтов"));
        books.add(new Book("Тихий Дон", "Михаил Шолохов"));
        books.add(new Book("Идиот", "Федор Достоевский"));
        books.add(new Book("Мертвые души", "Николай Гоголь"));
        books.add(new Book("1984", "Джордж Оруэлл"));
        books.add(new Book("Гарри Поттер", "Джоан Роулинг"));
        books.add(new Book("Властелин колец", "Джон Толкин"));
        books.add(new Book("Маленький принц", "Антуан де Сент-Экзюпери"));
        books.add(new Book("Шерлок Холмс", "Артур Конан Дойл"));
        books.add(new Book("Три мушкетера", "Александр Дюма"));
        books.add(new Book("Алхимик", "Пауло Коэльо"));
        books.add(new Book("Код да Винчи", "Дэн Браун"));
        books.add(new Book("Унесенные ветром", "Маргарет Митчелл"));
        books.add(new Book("Дюна", "Фрэнк Герберт"));
        books.add(new Book("Граф Монте-Кристо", "Александр Дюма"));

    }

}