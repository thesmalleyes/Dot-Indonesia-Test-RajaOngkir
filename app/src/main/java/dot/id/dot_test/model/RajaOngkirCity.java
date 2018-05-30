package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RajaOngkirCity {
    @SerializedName("results")
    private List<CityResult> results = null;

    public List<CityResult> getResults() {
        return results;
    }
}
