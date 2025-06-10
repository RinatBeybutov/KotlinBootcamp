package sprint_1.task_06

class LibrarySystem {
    private val books = HashMap<Book, String>()

    fun addBook(title: String, author: String, year: Int, location: String) {
        val book = Book(title, author, year)
        books[book] = location
    }

    fun removeBook(title: String, author: String, year: Int) {
        val removed = books.remove(Book(title, author, year))
        if (removed == null) {
            println("Запрошенная книга не найдена в библиотеке")
        }
    }

    fun findBook(title: String, author: String, year: Int) {
        val book = Book(title, author, year)
        val location = books[book]
        if (location != null) {
            println("Книга $book находится в библиотеке на месте $location")
        } else {
            println("Книга не найдена в библиотеке")
        }
    }

    fun printAllBooks() {
        for ((book, location) in books) {
            println("Книга ${book.title} автора ${book.author} года издания ${book.year} находится в библиотеке в местонахождении $location")
        }
    }
}