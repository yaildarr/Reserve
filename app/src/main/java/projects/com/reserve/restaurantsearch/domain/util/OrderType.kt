package projects.com.reserve.restaurantsearch.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}