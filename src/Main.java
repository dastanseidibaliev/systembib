import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addDefaultBooks();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n========= БИБЛИОТЕКА =========");
            System.out.println("1. Показать все книги");
            System.out.println("2. Взять книгу");
            System.out.println("3. Вернуть книгу");
            System.out.println("4. Добавить книгу");
            System.out.println("5. Найти книгу");
            System.out.println("0. Выход");

            System.out.print("Выберите действие: ");

            try {

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:

                        library.showBooks();
                        break;

                    case 2:

                        System.out.print("Введите ID книги: ");
                        int borrowId = scanner.nextInt();

                        library.borrowBook(borrowId);
                        break;

                    case 3:

                        System.out.print("Введите ID книги: ");
                        int returnId = scanner.nextInt();

                        library.returnBook(returnId);
                        break;

                    case 4:

                        scanner.nextLine();

                        System.out.print("Введите название книги: ");
                        String title = scanner.nextLine();

                        System.out.print("Введите автора: ");
                        String author = scanner.nextLine();

                        Book newBook = new Book(title, author);

                        library.addBook(newBook);

                        System.out.println("Книга успешно добавлена!");
                        break;

                    case 5:

                        System.out.print("Введите название книги: ");
                        String search = scanner.nextLine();

                        library.findBook(search);
                        break;

                    case 0:

                        System.out.println("До свидания!");
                        return;

                    default:

                        System.out.println("Неверный выбор!");

                }

            } catch (Exception e) {

                System.out.println("Ошибка ввода!");

                scanner.nextLine();

            } finally {

                System.out.println("================================");

            }

        }

    }

}