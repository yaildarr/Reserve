package projects.com.reserve.restaurantsearch.data.data_source

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import projects.com.reserve.restaurantsearch.domain.model.Restaurant

@Dao
interface RestaurantDao {

    @Query("SELECT * FROM restaurant")
    fun getRestaurants(): Flow<List<Restaurant>>

    @Query("SELECT * FROM restaurant WHERE id = :id")
    suspend fun getRestaurantById(id: Int): Restaurant?

}