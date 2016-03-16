package com.assignments.acadgild.android_session6_assignment3;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_text_color, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mnu_Red) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                textView.setTextColor(getResources().getColor(R.color.colorRed,null));
            }
            Toast.makeText(MainActivity.this, "Select Red color", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.mnu_Green) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                textView.setTextColor(getResources().getColor(R.color.colorGreen,null));
            }
            Toast.makeText(MainActivity.this, "Select Green color", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.mnu_Blue) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                textView.setTextColor(getResources().getColor(R.color.colorBlue,null));
            }
            Toast.makeText(MainActivity.this, "Select Blue color", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
