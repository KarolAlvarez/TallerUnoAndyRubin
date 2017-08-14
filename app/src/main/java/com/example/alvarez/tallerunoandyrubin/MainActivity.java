package com.example.alvarez.tallerunoandyrubin;

import android.support.v7.app.ActionBar;
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

        ActionBar atras = getSupportActionBar();
        atras.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcionMenu) {
        int id = opcionMenu.getItemId();
        if (id == R.id.salir) {
            SalirDeTallerUnoAndyRobin(null);
            return true;
        }
        return super.onOptionsItemSelected(opcionMenu);
    }

    public void SalirDeTallerUnoAndyRobin(View v) {
        finish();
    }

}

