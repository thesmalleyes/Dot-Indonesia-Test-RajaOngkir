package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RajaOngkir {
    @SerializedName("query")
    private List<Object> query = null;
    @SerializedName("results")
    private List<ProvinceResult> results = null;

    public List<Object> getQuery() {
        return query;
    }

    public List<ProvinceResult> getResults() {
        return results;
    }
}
