package dot.id.dot_test;

import android.annotation.SuppressLint;
import android.app.Application;

import dot.id.dot_test.interfaces.ApiService;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressLint("Registered")
public class BaseApps extends Application{
    public static ApiService services;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static ApiService getServices(){
        if (null==services){
            services = getRetrofit().create(ApiService.class);
        }
        return services;
    }

    public static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://api.rajaongkir.com/starter/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(getHttpClient())
                .build();
    }

    public static OkHttpClient getHttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(getHttpLogInterceptor())
                .build();
    }

    public static Interceptor getHttpLogInterceptor() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        HttpLoggingInterceptor.Level level;

        if (BuildConfig.DEBUG){
            level = HttpLoggingInterceptor.Level.BODY;
        } else {
            level = HttpLoggingInterceptor.Level.NONE;
        }
        loggingInterceptor.setLevel(level);
        return loggingInterceptor;
    }
}
