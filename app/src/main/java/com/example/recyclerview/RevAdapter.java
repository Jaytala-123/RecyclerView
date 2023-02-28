package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RevAdapter extends RecyclerView.Adapter<RevAdapter.ViewHolder>{

    MainActivity mainActivity;
    ArrayList<RevModal> arrayList;
    
    public RevAdapter(MainActivity mainActivity, ArrayList<RevModal> arrayList) {

        this.arrayList = arrayList;
        this.mainActivity = mainActivity;
        
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.rev_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        
        holder.textView.setText(arrayList.get(position).getName());
        holder.textView1.setText(arrayList.get(position).getSurname());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView,textView1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tvname);
            textView1 = itemView.findViewById(R.id.tvsurname);
        }
    }
}
