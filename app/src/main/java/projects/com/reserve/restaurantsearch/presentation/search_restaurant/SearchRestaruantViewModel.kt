package projects.com.reserve.restaurantsearch.presentation.search_restaurant

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import projects.com.reserve.restaurantsearch.domain.useCase.RestaurantSearchUseCases
import javax.inject.Inject

@HiltViewModel
class SearchRestaruantViewModel @Inject constructor(
    private val restaurantSearchUseCases: RestaurantSearchUseCases
) : ViewModel() {


}