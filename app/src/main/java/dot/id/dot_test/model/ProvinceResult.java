package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

public class ProvinceResult {
        @SerializedName("province_id")
        private String provinceId;
        @SerializedName("province")
        private String province;

    public String getProvinceId() {
        return provinceId;
    }

    public String getProvince() {
        return province;
    }
}
