package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

public class ProvinceResponse {
    @SerializedName("rajaongkir")
    public RajaOngkir rajaongkir;

    public RajaOngkir getRajaongkir() {
        return rajaongkir;
    }
}
