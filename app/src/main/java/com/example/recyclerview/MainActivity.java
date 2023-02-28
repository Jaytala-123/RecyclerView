package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rev;
    EditText edname,rdsurname;
    Button btnadd;

    ArrayList<RevModal>arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rev = findViewById(R.id.rev);
        edname = findViewById(R.id.edname);
        rdsurname = findViewById(R.id.rdsurname);
        btnadd = findViewById(R.id.btnadd);

        RevAdapter adapter = new RevAdapter(MainActivity.this,arrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rev.setLayoutManager(linearLayoutManager);
        rev.setAdapter(adapter);

        RevModal modal = new RevModal();
        modal.setName(edname.getText().toString());
        modal.setSurname(rdsurname.getText().toString());
        arrayList.add(modal);

        adapter.notifyDataSetChanged();
    }
}