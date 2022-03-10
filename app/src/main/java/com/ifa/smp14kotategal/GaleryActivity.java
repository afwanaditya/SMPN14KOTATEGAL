package com.ifa.smp14kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
    }


    public void albumfutsal(View view) {
        Intent intent = new Intent(GaleryActivity.this, AlbumfutsalActivity.class);
        startActivity(intent);
    }

    public void albumdrumbband(View view) {
        Intent intent = new Intent(GaleryActivity.this, AlbumdrumbbandActivity.class);
        startActivity(intent);
    }

    public void albumkegiatan(View view) {
        Intent intent = new Intent(GaleryActivity.this, AlbumkegiatanActivity.class);
        startActivity(intent);
    }
}