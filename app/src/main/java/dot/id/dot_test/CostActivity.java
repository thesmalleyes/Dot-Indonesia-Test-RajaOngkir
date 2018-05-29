package dot.id.dot_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dot.id.dot_test.Model.Cost;
import dot.id.dot_test.Model.CostResponse;
import dot.id.dot_test.Model.Cost_;
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
        String origin = getIntent().getStringExtra(ConstantPref.TOKEN);
        String destination = getIntent().getStringExtra(ConstantPref.TOKEN);
        String weight = getIntent().getStringExtra(ConstantPref.TOKEN);
        String courier = getIntent().getStringExtra(ConstantPref.TOKEN);

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

                }
            }

            @Override
            public void onFailure(Call<CostResponse> call, Throwable t) {

            }
        });
    }
}
