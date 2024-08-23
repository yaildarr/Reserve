package projects.com.reserve.restaurantsearch.domain.useCase

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import projects.com.reserve.restaurantsearch.domain.model.Restaurant
import projects.com.reserve.restaurantsearch.domain.repository.RestaurantRepository
import projects.com.reserve.restaurantsearch.domain.util.OrderType
import projects.com.reserve.restaurantsearch.domain.util.RestaurantOrder

class GetRestaurant(
    private val repository: RestaurantRepository
) {

    operator fun invoke(
        restaurantOrder: RestaurantOrder = RestaurantOrder.Title(OrderType.Descending)
    ): Flow<List<Restaurant>>{
        return repository.getNotes().map { restaurants ->
            when(restaurantOrder.orderType) {
                is OrderType.Ascending -> {
                    when (restaurantOrder){
                        is RestaurantOrder.Title -> restaurants.sortedBy { it.name.lowercase() }
                        is RestaurantOrder.Rating -> restaurants.sortedBy { it.review }
                        is RestaurantOrder.AvgPrice -> restaurants.sortedBy { it.averagePrice }
                    }
                }
                is OrderType.Descending ->{
                    when (restaurantOrder){
                        is RestaurantOrder.Title -> restaurants.sortedByDescending { it.name.lowercase() }
                        is RestaurantOrder.Rating -> restaurants.sortedByDescending { it.review }
                        is RestaurantOrder.AvgPrice -> restaurants.sortedByDescending { it.averagePrice }
                    }
                }
            }
        }
    }
}