package com.ifa.smp14kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class GaleryActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.header,
            R.drawable.covid,
            R.drawable.icon,
            R.drawable.header

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
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