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
import dot.id.dot_test.model.ProvinceResult;
import dot.id.dot_test.R;

public class ProvinceAdapter extends RecyclerView.Adapter<ProvinceAdapter.ViewHolder> {
    private List<ProvinceResult> provinceResults;
    private ClickListener clickListener;

    public ProvinceAdapter(List<ProvinceResult> provinceResults) {
        this.provinceResults = provinceResults;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        return new ViewHolder(view, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ProvinceResult provinceResult = provinceResults.get(position);
        holder.showData(provinceResult);
    }

    @Override
    public int getItemCount() {
        return provinceResults.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ClickListener mListener;
        private TextView tvPilihan;
        public ConstraintLayout clItem;
        ViewHolder(View itemView, ClickListener clickListener) {
            super(itemView);
            tvPilihan = itemView.findViewById(R.id.tv_pilihan);
            clItem = itemView.findViewById(R.id.cl_item);
            mListener = clickListener;
        }

        public void showData(final ProvinceResult provinceResult){
            tvPilihan.setText(provinceResult.getProvince());
            clItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListener.onProvinceItemClick(provinceResult);
                }
            });
        }
    }

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
}
