package projects.com.reserve.restaurantsearch.domain.repository

import kotlinx.coroutines.flow.Flow
import projects.com.reserve.restaurantsearch.domain.model.Restaurant

interface RestaurantRepository {
    fun getNotes(): Flow<List<Restaurant>>

    suspend fun getRestaurantById(id: Int): Restaurant?

}