package sprint_1.task_08

class ProductManager {
    private val products = mutableSetOf<Product>()
    private val categoryMap = mutableMapOf<Category, MutableList<Product>>()

    fun addProduct(category: Category, product: Product) {
        val isAdded = products.add(product)
        if(isAdded){
            val listProducts = categoryMap.putIfAbsent(category, mutableListOf())
            listProducts?.add(product)
        }
    }

    fun removeProduct(category: Category, product: Product) {
        products.remove(product)
        val listProducts = categoryMap.get(category)
        listProducts?.remove(product)
        if(listProducts?.size == 0) {
            categoryMap.remove(category)
        }
    }

    fun findProductsByCategory(category: Category): List<Product> {
        return categoryMap.get(category).orEmpty()
    }

    fun groupProductsByCategory() {
        categoryMap.clear()
        for(product in products) {
            val listProducts = categoryMap.putIfAbsent(product.category, mutableListOf())
            listProducts?.add(product)
        }
    }

    fun printAllProducts() {
        for((key, value) in categoryMap) {
            println(key)
            for (product in value) {
                println(product.name)
            }
        }
    }
}