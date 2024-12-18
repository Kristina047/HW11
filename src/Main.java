public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", " Пушкин");

        Book alex = new Book("Сказка о царе Салтане", pushkin, 1831);
        System.out.println(alex.title);
        System.out.println(alex.author);
        System.out.println(alex.year + " год");
    }

    public static class Book {
        private String title;
        private Author author;
        private int year;

        public Book(String title, Author author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getName() {
            return this.title;
        }

        public Author getAge() {
            return this.author;
        }

        public void setAge(int year) {
            this.year = year;
        }
    }

    public static class Author {
        private String firstname;
        private String lastname;

        public String toString() {
            return firstname + lastname;
        }
        public String getName() {
            return this.firstname;
        }

        public String getAge() {
            return this.lastname;
        }

        public Author(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;


        }
    }
}



