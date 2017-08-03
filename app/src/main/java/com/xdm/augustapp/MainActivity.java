package com.xdm.augustapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class MainActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        View v;

        Gson g = new Gson();
//        g.fromJson()
    }

    /**
     * initialize views
     */
    private void initView(){


    }

    /**
     * initialize datas
     */
    private void initData(){

    }
}
