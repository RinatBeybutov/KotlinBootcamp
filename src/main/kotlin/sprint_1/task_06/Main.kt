package sprint_1.task_06

fun main() {
    val library = LibrarySystem()
    library.addBook("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Shelf 1")
    library.addBook("The Hobbit", "J.R.R. Tolkien", 1937, "Shelf 2")
    library.addBook("The Silmarillion", "J.R.R. Tolkien", 1177, "Shelf 3")
    //library.printAllBooks()
    library.removeBook("Gaben", "Rodjer", 2017)
    library.findBook("The Hobbit", "J.R.R. Tolkien", 1937)
}