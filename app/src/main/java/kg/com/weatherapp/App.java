package kg.com.weatherapp;

import android.app.Application;

import kg.com.weatherapp.data.remote.RetrofitClient;
import kg.com.weatherapp.data.repositories.MainRepository;

public class App extends Application {

    private RetrofitClient retrofitClient;
    public static MainRepository repository;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        repository = new MainRepository(retrofitClient.provideApi());
    }
}
