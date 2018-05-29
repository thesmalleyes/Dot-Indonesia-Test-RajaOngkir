package dot.id.dot_test.Model;

import com.google.gson.annotations.SerializedName;

public class CostResponse {
    @SerializedName("rajaongkir")
    private RajaongkirCost rajaongkir;

    public RajaongkirCost getRajaongkir() {
        return rajaongkir;
    }
}
