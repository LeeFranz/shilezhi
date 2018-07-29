package leo.fragmentapp_1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/17.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private ArrayList<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mNameText;
        TextView mDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            mNameText = (TextView) itemView.findViewById(R.id.name);
            mDescription = (TextView) itemView.findViewById(R.id.description);
        }
    }

    public FruitAdapter(ArrayList<Fruit> fruitArrayList) {
        mFruitList = fruitArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_element_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.mNameText.setText(fruit.getmName());
        holder.mDescription.setText(fruit.getmDescription());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
