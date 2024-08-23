package projects.com.reserve.restaurantsearch.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import projects.com.reserve.restaurantsearch.domain.model.Restaurant


@Database(
    entities = [Restaurant::class],
    version = 1
)
abstract class RestaurantDatabase: RoomDatabase() {

    abstract val restaurantDao: RestaurantDao

    companion object{
        const val DATABASE_NAME = "restaurants_db"
    }
}