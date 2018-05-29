package dot.id.dot_test.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cost {
    @SerializedName("service")
    private String service;
    @SerializedName("description")
    public String description;
    @SerializedName("cost")
    private List<Cost_> cost = null;

    public String getService() {
        return service;
    }

    public String getDescription() {
        return description;
    }

    public List<Cost_> getCost() {
        return cost;
    }
}
