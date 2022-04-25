package kg.com.weatherapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import kg.com.weatherapp.data.model.WeatherApp;
import kg.com.weatherapp.App;
import kg.com.weatherapp.common.Resource;

public class WeatherViewModel extends ViewModel {

    public LiveData<Resource<WeatherApp>> liveData;

    public WeatherViewModel() {
    }


    public void getWeatherByCityName(String cityName) {
        liveData = App.repository.getWeatherByCityName(cityName);
    }

}
