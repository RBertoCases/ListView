package com.example.listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names = {"rob", "mark", "alesia", "mike", "tia", "roberto", "mallory", "delores", "bernard"};
    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAdapter myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, names);
        myList = (ListView) findViewById(R.id.MyList);
        myList.setAdapter(myadapter);
    }
}
