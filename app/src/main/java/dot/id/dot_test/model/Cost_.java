package dot.id.dot_test.model;

import com.google.gson.annotations.SerializedName;

public class Cost_ {
    @SerializedName("value")
    private Integer value;
    @SerializedName("etd")
    private String etd;
    @SerializedName("note")
    private String note;

    public Cost_(Integer value, String etd, String note) {
        this.value = value;
        this.etd = etd;
        this.note = note;
    }

    public Integer getValue() {
        return value;
    }

    public String getEtd() {
        return etd;
    }

    public String getNote() {
        return note;
    }
}
