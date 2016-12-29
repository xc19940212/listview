package com.example.listview;

import com.example.adapter.Myadapter;
import com.example.model.DataSource;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends Activity {
	private ListView mLv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        inListener();
    }
	private void inListener() {
		// TODO 自动生成的方法存根
		
	}
	private void initData() {
		
		mLv_show.setAdapter(new Myadapter(DataSource.getData(), MainActivity.this));
	}
	private void initView() {
		mLv_show=(ListView) findViewById(R.id.lv_show);
	}


   
}
