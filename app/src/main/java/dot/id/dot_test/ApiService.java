package dot.id.dot_test;

import dot.id.dot_test.Model.CityResponse;
import dot.id.dot_test.Model.CostResponse;
import dot.id.dot_test.Model.ProvinceResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @GET("province")
    Call<ProvinceResponse> getProvince(@Header("key") String token);

    @GET("city")
    Call<CityResponse> getCity(@Header("key") String token, @Query("province") String province);

    @FormUrlEncoded
    @POST("cost")
    Call<CostResponse> getCost(@Header("key") String token, @Field("origin") String origin, @Field("destination") String destination, @Field("weight") String weight, @Field("courier") String courier);
}
