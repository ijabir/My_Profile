package com.example.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }








    String fb = "https://fb.com/gxabir", gp = "https://plus.google.com/111073927113414083251",
                li = "https://bd.linkedin.com/pub/jabir-ibne-kamal/87/295/314";

    public void fb(View v)
    {
        Uri webPage = Uri.parse(fb);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);
    }


    public void gp(View view)
    {
        Uri webPage = Uri.parse(gp);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);
    }

    public void li(View view)
    {
        Uri webPage = Uri.parse(li);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);
    }

















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
