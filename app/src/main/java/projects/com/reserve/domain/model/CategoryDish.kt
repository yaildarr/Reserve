package projects.com.reserve.domain.model

data class CategoryDish (
    val name: String,
    val categoryMeny: MutableList<Product>
)