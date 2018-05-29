package dot.id.dot_test.Model;

import com.google.gson.annotations.SerializedName;

public class CityResult {
    @SerializedName("city_id")
    private String cityId;
    @SerializedName("province_id")
    private String provinceId;
    @SerializedName("province")
    private String province;
    @SerializedName("type")
    private String type;
    @SerializedName("city_name")
    private String cityName;
    @SerializedName("postal_code")
    private String postalCode;

    public String getCityId() {
        return cityId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public String getProvince() {
        return province;
    }

    public String getType() {
        return type;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
