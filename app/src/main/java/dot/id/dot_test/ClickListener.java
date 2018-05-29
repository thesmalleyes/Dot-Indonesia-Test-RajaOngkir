package dot.id.dot_test;

import dot.id.dot_test.Model.CityResult;
import dot.id.dot_test.Model.ProvinceResult;

public interface ClickListener {
    void onProvinceItemClick(ProvinceResult provinceResult);
    void onCityItemClick (CityResult cityResult);
}
