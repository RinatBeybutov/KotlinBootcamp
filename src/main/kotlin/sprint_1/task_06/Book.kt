package sprint_1.task_06

class Book(
    val title: String,
    val author: String,
    val year: Int
) {

    override fun equals(other: Any?): Boolean {
        if (other !is Book) {
            return false
        }
        return this.title == other.title &&
                this.author == other.author &&
                this.year == other.year
    }

    override fun hashCode(): Int {
        return title.hashCode() + author.hashCode() + year.hashCode()
    }

    override fun toString(): String {
        return "$title $author $year"
    }
}