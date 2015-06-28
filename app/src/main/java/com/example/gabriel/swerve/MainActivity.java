package com.example.gabriel.swerve;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static ArrayList<Item> arrayItem;
    private static ItemAdapter itemAdapter;
    private static ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ATTACH ADAPTER TO LIST VIEW

        // Construct the data source
        arrayItem = new ArrayList<Item>();
        // Create the adapter to convert the array to views
        itemAdapter = new ItemAdapter(this);
        // Attach the adapter to a ListView

        listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(itemAdapter);
    }

    public void clickSellNew(View view) {
        Intent secondIntent = new Intent(MainActivity.this,
                SellNewItemActivity.class);
        startActivity(secondIntent);
    }

    //static because from 2nd activity
    public static void recieveItemData(String image, String name, float price){
        itemAdapter.clear();
        arrayItem.add(new Item(image, name, price));
        int arrayItemSize = arrayItem.size();
        for(int i=0;i<arrayItemSize; i++){
            itemAdapter.add(arrayItem.get(i));
        }
    }
}
