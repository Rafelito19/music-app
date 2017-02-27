package com.example.rafa.djlobo_with_downloads;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        populateListView();
        selector();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);



        return true;

    }



    private void populateListView(){


        String [] myItems = {"http://music.djloboapp.com/music/BACHATA MIX 302.mp3" ,
                "http://music.djloboapp.com/music/BACHATA MIX 279.mp3" ,
                "http://music.djloboapp.com/music/BACHATA MIX 300 FRANK REYES.mp3"
               ," http://music.djloboapp.com/music/BACHATA MIX 299.mp3"
        ,"http://music.djloboapp.com/music/BACHATA MIX 298 HECTOR ACOSTA MIX.mp3"
       ," http://music.djloboapp.com/music/BACHATA MIX 297.mp3"
        ,"http://music.djloboapp.com/music/BACHATA MIX 296 CLASICO.mp3"
       ," http://music.djloboapp.com/music/BACHATA MIX 295 CLASICO.mp3"
       ," http://music.djloboapp.com/music/BACHATA MIX 294.mp3"
        ,"http://music.djloboapp.com/music/BACHATA MIX 293 CLASICO.mp3"
        ,"http://music.djloboapp.com/music/BACHATA MIX 292  RS FORMULA VOL 2 MIX.mp3"
       ," http://music.djloboapp.com/music/BACHATA MIX 291.mp3"
       ," http://music.djloboapp.com/music/BACHATA MIX 290.mp3"
        ,"http://music.djloboapp.com/music/BACHATA MIX 289.mp3"
        ,"http://music.djloboapp.com/music/BACHATA MIX 288.mp3"
       ," http://music.djloboapp.com/music/BACHATA MIX 287 RAULIN RODRIGUEZ MIX.mp3"

        };
//String [] myItems =  File_Array.file_toR("songs.txt");

        // build adapter


        ArrayAdapter  <String>  adapter= new ArrayAdapter<String>(this, R.layout.textview,myItems);

        ListView list =  (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }




    private void selector(){
        ListView list =  (ListView) findViewById(R.id.listView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

TextView textView = (TextView) view;
                String text4 = textView.getText().toString();
               // Toast.makeText(MainActivity.this,text4,Toast.LENGTH_LONG).show();
                WebActivity web = new WebActivity(text4);

Intent intent =new Intent(MainActivity.this, WebActivity.class);
                startActivity(intent);
            }



        });
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
