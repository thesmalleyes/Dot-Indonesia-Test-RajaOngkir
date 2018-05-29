package dot.id.dot_test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import dot.id.dot_test.Model.Cost;
import dot.id.dot_test.Model.Cost_;

public class CostAdapter extends RecyclerView.Adapter<CostAdapter.ViewHolder> {
    List<Cost> costs;

    public CostAdapter(List<Cost> costs) {
        this.costs = costs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cost_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cost cost = costs.get(position);
        holder.tvServiceName.setText(cost.getService());
        holder.tvHarga.setText(cost.getCost().get(position).getValue());
        holder.tvEstimation.setText(cost.getCost().get(position).getEtd());
    }

    @Override
    public int getItemCount() {
        return costs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvServiceName;
        TextView tvHarga;
        TextView tvEstimation;
        public ViewHolder(View itemView) {
            super(itemView);
            tvServiceName = itemView.findViewById(R.id.tv_service_name);
            tvHarga = itemView.findViewById(R.id.tv_cost);
            tvEstimation = itemView.findViewById(R.id.tv_estimatioon);
        }
    }
}
