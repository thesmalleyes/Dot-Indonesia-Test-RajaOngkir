package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

public class CostResponse {
    @SerializedName("rajaongkir")
    private RajaongkirCost rajaongkir;

    public RajaongkirCost getRajaongkir() {
        return rajaongkir;
    }
}
