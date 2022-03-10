package com.ifa.smp14kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkstrakulikulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakulikuler);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(EkstrakulikulerActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(EkstrakulikulerActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(EkstrakulikulerActivity.this, FutsalActivity.class);
        startActivity(intent);
    }

    public void volly(View view) {
        Intent intent = new Intent(EkstrakulikulerActivity.this, DrumbbandActivity.class);
        startActivity(intent);
    }
}