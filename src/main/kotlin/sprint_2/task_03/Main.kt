package org.example.sprint_2.task_03

fun main() {
    val origImage: Image = Image("image.jpg", "Оригинальное изображение")
    val filterProcessor = FilterProcessor()

    // Function<Image, Image> grayscaleFilter = (image) -> new Image(image.getName(), image.getDescription() + " | Фильтр: черно-белый");

    val grayFilter =
        { image: Image -> Image(image.name, image.description + " | Фильтр: черно-белый") }

    val sepiaFilter =
        { image: Image -> Image(image.name, image.description + " | Фильтр: сепия") }

    val combineFilters = filterProcessor.combineFilters(grayFilter, sepiaFilter)

    val grayImage = filterProcessor.applyFilter(origImage, grayFilter)
    println(grayImage.description)

    val combinedImage = filterProcessor.applyFilter(origImage, combineFilters)
    println(combinedImage.description)
}