package projects.com.reserve.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Restaurant(
    val name: String,
    val urlImage: String,
    val address: String,
    val services: MutableList<Service>,
    val menuCategory: MutableList<CategoryDish>,
    val numberPhone: String,
    val review: Int,
    @PrimaryKey val id: Int? = null
)
