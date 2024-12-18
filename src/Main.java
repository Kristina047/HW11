public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", " Пушкин");
        Author turgenev = new Author("Иван", " Тургенев");


        Book alex = new Book("Сказка о царе Салтане", pushkin, 1831);
        alex.setYear(1832);

        System.out.println(alex.title);
        System.out.println(alex.author);
        System.out.println(alex.getYear() + " год");
        System.out.println();

        Book tur = new Book("Записки охотника", turgenev, 1852);
        System.out.println(tur.title);
        System.out.println(tur.author);
        System.out.println(tur.year + " год");
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

        public static class Book {
            private String title;
            private Author author;
            private int year;


            public Book(String title, Author author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            public String getTitle() {
                return this.title;
            }

            public Author getAuthor() {
                return this.author;
            }

            public int getYear() {
                return this.year;
            }

            public int setYear(int year) {
                this.year = year;
                return this.year;
            }
        }

}





