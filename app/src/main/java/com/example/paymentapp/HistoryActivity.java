package com.example.paymentapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    ListView lvHistory;
    ArrayList<String> historyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        lvHistory = findViewById(R.id.lvHistory);

        // Demo: dữ liệu mẫu, sau này có thể lấy từ DB hoặc SharedPreferences
        historyList = new ArrayList<>();
        historyList.add("Mai Quoc Long - $500 - 27/09/2025");
        historyList.add("Nguyen Van A - $200 - 26/09/2025");
        historyList.add("Le Thi B - $1000 - 25/09/2025");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                historyList
        );

        lvHistory.setAdapter(adapter);
    }
}
