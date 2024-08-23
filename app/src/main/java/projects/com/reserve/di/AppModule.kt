package projects.com.reserve.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import projects.com.reserve.restaurantsearch.data.data_source.RestaurantDao
import projects.com.reserve.restaurantsearch.data.data_source.RestaurantDatabase
import projects.com.reserve.restaurantsearch.data.repository.RestaurantRepositoryImpl
import projects.com.reserve.restaurantsearch.domain.repository.RestaurantRepository
import projects.com.reserve.restaurantsearch.domain.useCase.GetRestaurant
import projects.com.reserve.restaurantsearch.domain.useCase.RestaurantSearchUseCases
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRestaurantDatabase(app: Application): RestaurantDatabase{
        return Room.databaseBuilder(
            app,
            RestaurantDatabase::class.java,
            RestaurantDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideRestaurantRepository(db: RestaurantDatabase) : RestaurantRepository{
        return RestaurantRepositoryImpl(db.restaurantDao)
    }

    @Provides
    @Singleton
    fun provideRestaurantUseCases(repository: RestaurantRepository) : RestaurantSearchUseCases{
        return RestaurantSearchUseCases(
            getRestaurant = GetRestaurant(repository)
        )
    }
}