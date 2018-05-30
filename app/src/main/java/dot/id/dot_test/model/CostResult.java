package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CostResult {
    @SerializedName("code")
    public String code;
    @SerializedName("name")
    public String name;
    @SerializedName("costs")
    public List<Cost> costs = null;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Cost> getCosts() {
        return costs;
    }
}
