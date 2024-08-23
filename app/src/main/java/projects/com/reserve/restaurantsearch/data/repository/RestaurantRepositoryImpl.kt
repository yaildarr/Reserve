package projects.com.reserve.restaurantsearch.data.repository

import kotlinx.coroutines.flow.Flow
import projects.com.reserve.restaurantsearch.data.data_source.RestaurantDao
import projects.com.reserve.restaurantsearch.domain.model.Restaurant
import projects.com.reserve.restaurantsearch.domain.repository.RestaurantRepository

class RestaurantRepositoryImpl(private val dao: RestaurantDao) : RestaurantRepository {
    override fun getNotes(): Flow<List<Restaurant>> {
        return dao.getRestaurants()
    }

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        return dao.getRestaurantById(id)
    }
}