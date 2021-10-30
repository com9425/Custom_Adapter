package com.example.custom_adapter_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView guitarlistview2;
    gtMyAdapter gtadapter;
    String content[] = {"condtent", "condtent", "condtent", "condtent", "condtent", "condtent", "condtent", "condtent", "condtent", "condtent"};
    String title[] = {"Title", "Title", "Title", "Title", "Title", "Title", "Title", "Title", "Title", "Title"};
    int posterid[] = {R.drawable.fender1, R.drawable.cort, R.drawable.fender, R.drawable.esp, R.drawable.epiphone,
            R.drawable.fender1, R.drawable.fender1, R.drawable.fender1, R.drawable.fender1, R.drawable.fender1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guitarlistview2 = (ListView) findViewById(R.id.guitarlistview2);
        List<gtItemData> data = new ArrayList<gtItemData>();
        for (int i = 0; i < posterid.length; i++) {
            data.add(new gtItemData(posterid[i], title[i], content[i]));
        } // guitarlistView.xml 데이터 add
        gtadapter = new gtMyAdapter(this, data);
        guitarlistview2.setAdapter(gtadapter);


    }
}
