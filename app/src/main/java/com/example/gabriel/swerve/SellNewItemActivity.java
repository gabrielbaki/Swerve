package com.example.gabriel.swerve;

/**
 * Created by GABRIEL on 6/28/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class SellNewItemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellnewitem);
    }

    public void clickPost(View view){
        EditText etInsertImage = (EditText) findViewById(R.id.etInsertImage);
        EditText etInsertName = (EditText) findViewById(R.id.etInsertName);
        EditText etInsertPrice = (EditText) findViewById(R.id.etInsertPrice);
        MainActivity.recieveItemData(String.valueOf(etInsertImage.getText().toString()),
                String.valueOf(etInsertName.getText().toString()), Float.valueOf(etInsertPrice.getText().toString()));
        this.finish();
    }

    public void clickBack(View view) {
        this.finish();
    }

}