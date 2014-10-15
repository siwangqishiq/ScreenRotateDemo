package com.xinlans.screenrotate;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.res.Configuration;

public class MainActivity extends Activity
{
    private TextView title;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        System.out.println("create---");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.titile);
        ++num;
        title.setText(num + "");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        System.out.println("onConfigurationChanged---");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)//
        {
            Toast.makeText(MainActivity.this, "现在是竖屏", Toast.LENGTH_SHORT)
                    .show();
            setContentView(R.layout.activity_main);
        }
        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast.makeText(MainActivity.this, "现在是横屏", Toast.LENGTH_SHORT)
                    .show();
            setContentView(R.layout.activity_main_landscape);
        }
        
        ++num;
        title.setText(num + "");
    }
}// end class
