package projects.com.reserve.restaurantsearch.domain.util

sealed class RestaurantOrder(val orderType: OrderType) {
    class Title(orderType: OrderType): RestaurantOrder(orderType)
    class Rating(orderType: OrderType): RestaurantOrder(orderType)
    class AvgPrice(orderType: OrderType): RestaurantOrder(orderType)

}