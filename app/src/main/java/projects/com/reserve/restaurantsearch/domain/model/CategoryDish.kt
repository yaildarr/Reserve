package projects.com.reserve.restaurantsearch.domain.model

data class CategoryDish (
    val name: String,
    val categoryMeny: MutableList<Product>
)