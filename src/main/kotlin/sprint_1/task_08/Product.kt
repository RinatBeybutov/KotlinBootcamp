package sprint_1.task_08

class Product(
    val id: Int,
    val name: String,
    val category: Category
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        return id == other.id
    }

    override fun hashCode(): Int {
        return id
    }
}