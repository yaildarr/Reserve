package projects.com.reserve.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import projects.com.reserve.domain.model.Restaurant


@Database(
    entities = [Restaurant::class],
    version = 1
)
abstract class RestaurantDatabase: RoomDatabase() {

    abstract val restaurantDao: RestaurantDao
}