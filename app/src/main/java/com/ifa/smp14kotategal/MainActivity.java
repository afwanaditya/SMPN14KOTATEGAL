package com.ifa.smp14kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, GaleryActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void ujian(View view) {
        Intent intent = new Intent(MainActivity.this, UjianActivity.class);
        startActivity(intent);
    }

    public void youtube(View view) {
        Intent intent = new Intent(MainActivity.this, youtubeActivity.class);
        startActivity(intent);
    }

    public void instagram(View view) {
        Intent intent = new Intent(MainActivity.this, instagramActivity.class);
        startActivity(intent);
    }

    public void google(View view) {
        Intent intent = new Intent(MainActivity.this, googleActivity.class);
        startActivity(intent);
    }

    public void facebook(View view) {
        Intent intent = new Intent(MainActivity.this, facebookActivity.class);
        startActivity(intent);
    }
}