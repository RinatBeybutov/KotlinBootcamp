package sprint_1.task_08

fun main() {
    val manager = ProductManager()
    manager.addProduct(Category.FOOD, Product(1, "bread", Category.FOOD))
    manager.addProduct(Category.FOOD, Product(2, "bread", Category.FOOD))
    manager.addProduct(Category.FOOD, Product(2, "bread", Category.FOOD))
    manager.printAllProducts()
}