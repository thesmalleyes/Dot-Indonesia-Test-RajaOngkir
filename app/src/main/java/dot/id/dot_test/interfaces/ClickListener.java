package dot.id.dot_test.interfaces;

import dot.id.dot_test.model.CityResult;
import dot.id.dot_test.model.ProvinceResult;

public interface ClickListener {
    void onProvinceItemClick(ProvinceResult provinceResult);
    void onCityItemClick (CityResult cityResult);
}
