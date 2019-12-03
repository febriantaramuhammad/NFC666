package com.example.nfc_gacor.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nfc_gacor.R;
import com.example.nfc_gacor.model.topup.Topup;
import com.example.nfc_gacor.model.user.User1;

import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<User1> dataItemList;
    //utk membedakan xml

    public UserAdapter(List<User1> dataItemList) {
        this.dataItemList = dataItemList;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemuser, parent, false);
        Penampung penampung = new Penampung(view);
        return penampung;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //((Penampung)holder).txtnama.setText("Name       : " + dataItemList.get(position).getNama());
        ((Penampung)holder).txtnominal.setText("Namanya   : " + dataItemList.get(position).getSaldo());
        // ((Penampung)holder).txtumur.setText("Umurnya   : " + (String.valueOf(dataItemList.get(position).getUmur())));
    }

    @Override
    public int getItemCount() {
        return dataItemList == null ? 0 : dataItemList.size();
    }

    static class Penampung extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtharga, txtnominal;

        public Penampung(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            txtharga = (TextView) itemView.findViewById(R.id.txtharga);
            txtnominal = (TextView) itemView.findViewById(R.id.txtnominal);


        }
        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " ");
        }
    }

}

