package com.UG.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.UG.data.ImageAdapter;
import com.UG.demo1.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        GridView gridView = (GridView)findViewById(R.id.grid);
        gridView.setAdapter(new ImageAdapter(this));
    }

}
