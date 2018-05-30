package dot.id.dot_test.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import dot.id.dot_test.model.Cost;
import dot.id.dot_test.R;

public class CostAdapter extends RecyclerView.Adapter<CostAdapter.ViewHolder> {
    private List<Cost> costs;

    public CostAdapter(List<Cost> costs) {
        this.costs = costs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cost_list, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cost cost = costs.get(position);
        holder.tvServiceName.setText("Nama Service : " +cost.getService() + "("+cost.getDescription()+")");
        holder.tvHarga.setText("Harga : Rp. "+String.valueOf(cost.getCost().get(0).getValue()));
        holder.tvEstimation.setText("Estimasi waktu pengiriman : "+cost.getCost().get(0).getEtd());
    }

    @Override
    public int getItemCount() {
        return costs.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvServiceName;
        private TextView tvHarga;
        private TextView tvEstimation;
        ViewHolder(View itemView) {
            super(itemView);
            tvServiceName = itemView.findViewById(R.id.tv_service_name);
            tvHarga = itemView.findViewById(R.id.tv_cost);
            tvEstimation = itemView.findViewById(R.id.tv_estimatioon);
        }
    }
}
