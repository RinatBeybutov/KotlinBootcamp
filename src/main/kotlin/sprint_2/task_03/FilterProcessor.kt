package org.example.sprint_2.task_03

import java.util.function.Function

class FilterProcessor {

    fun applyFilter(image: Image, filter: Function<Image, Image>): Image {
        return filter.apply(image)
    }

    fun combineFilters(filter1: Function<Image, Image>,
                       filter2: Function<Image, Image>): Function<Image, Image> {
        return filter1.andThen(filter2)
    }
}