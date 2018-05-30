package dot.id.dot_test.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import dot.id.dot_test.interfaces.ClickListener;
import dot.id.dot_test.model.CityResult;
import dot.id.dot_test.R;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {
    private List<CityResult> cityResults;
    private ClickListener clickListener;

    public CityAdapter(List<CityResult> cityResults) {
        this.cityResults = cityResults;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent,false), clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CityResult cityResult = cityResults.get(position);
        holder.showData(cityResult);
    }

    @Override
    public int getItemCount() {
        return cityResults.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ClickListener clickCityListener;
        private ConstraintLayout clItem;
        private TextView tvPilihan;
        public ViewHolder(View itemView, ClickListener clickListener) {
            super(itemView);
            tvPilihan = itemView.findViewById(R.id.tv_pilihan);
            clItem = itemView.findViewById(R.id.cl_item);
            clickCityListener = clickListener;
        }

        public void showData(final CityResult cityResult){
            tvPilihan.setText(cityResult.getCityName());
            clItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickCityListener.onCityItemClick(cityResult);
                }
            });
        }
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
