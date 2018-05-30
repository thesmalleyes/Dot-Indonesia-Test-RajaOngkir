package dot.id.dot_test.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import dot.id.dot_test.BaseApps;
import dot.id.dot_test.ConstantPref;
import dot.id.dot_test.adapter.CostAdapter;
import dot.id.dot_test.model.Cost;
import dot.id.dot_test.model.CostResponse;
import dot.id.dot_test.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CostActivity extends AppCompatActivity {
    RecyclerView recyclerCost;
    List<Cost> costs = new ArrayList<>();
    CostAdapter costAdapter = new CostAdapter(costs);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost);

        String token = getIntent().getStringExtra(ConstantPref.TOKEN);
        String origin = getIntent().getStringExtra(ConstantPref.ORIGIN);
        String destination = getIntent().getStringExtra(ConstantPref.DESTINATION);
        String weight = getIntent().getStringExtra(ConstantPref.WEIGHT);
        String courier = getIntent().getStringExtra(ConstantPref.COURIER).toLowerCase();

        recyclerCost = findViewById(R.id.rv_cost);
        recyclerCost.setLayoutManager(new LinearLayoutManager(this));
        recyclerCost.setAdapter(costAdapter);
        getCost(token, origin, destination, weight, courier);
    }

    public void getCost(String token, String origin, String dest, String weight, String courier){
        BaseApps.getServices().getCost(token, origin, dest, weight, courier).enqueue(new Callback<CostResponse>() {
            @Override
            public void onResponse(Call<CostResponse> call, Response<CostResponse> response) {
                if (response.isSuccessful()){
                    costs.addAll(response.body().getRajaongkir().getResults().get(0).getCosts());
                    costAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(CostActivity.this,ConstantPref.ERROR_NOT_SUCCESS, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<CostResponse> call, Throwable t) {

            }
        });
    }
}
