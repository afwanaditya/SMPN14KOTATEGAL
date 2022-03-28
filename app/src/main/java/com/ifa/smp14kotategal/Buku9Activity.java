package com.ifa.smp14kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku9);
    }

    public void mat9(View view) {
        goToUrl("https://drive.google.com/file/d/1WFP_KccRUPb3CyKmwzvb9f-AAgwM45Wu/view?usp=sharing");
    }

    public void bhsind9(View view) {
        goToUrl("https://drive.google.com/file/d/1Vv6yHaVZJRKk8hXtds1UER6s3xvRsDa2/view?usp=sharing");
    }

    public void ipa1kls9(View view) {
        goToUrl("https://drive.google.com/file/d/1W3tEbXUi71e6Aipc5WI_elJcMgdnI5n-/view?usp=sharing");
    }

    public void ipa2kls9(View view) {
        goToUrl("https://drive.google.com/file/d/1W5l5DT3coLDPr8EpLCb0AmogF3fztWjB/view?usp=sharing");
    }

    public void pra1kls9(View view) {
        goToUrl("https://drive.google.com/file/d/1WZ7UdHG4hK3GEnO5E9nCadmHJm0pcNOe/view?usp=sharing");
    }

    public void pra2kls9(View view) {
        goToUrl("https://drive.google.com/file/d/1WZ8ZK5q72ypgyZe5PiW5Y0ClEmDdchtc/view?usp=sharing");
    }

    public void paikls9(View view) {
        goToUrl("https://drive.google.com/file/d/1WIH4l0vlpgcjV20f-CJrMkc33T5tP7WY/view?usp=sharing");
    }

    public void ingkls9(View view) {
        goToUrl("https://drive.google.com/file/d/1W2a1N9C-TdEJn7JWZenO9rDLZwkuEPir/view?usp=sharing");
    }

    public void ppkn9(View view) {
        goToUrl("https://drive.google.com/file/d/1WZ7IbXuuBZzG0pO6qnf_vnDWC-D5qGU_/view?usp=sharing");
    }

    public void ipskls9(View view) {
        goToUrl("https://drive.google.com/file/d/1WlvCUen0MMEGq8lrxVucwOkntDJwYtPB/view?usp=sharing");
    }

    public void penjas9(View view) {
        goToUrl("https://drive.google.com/file/d/1WR34GStdgTftGtMKH6nFR-dnzkwNMKNd/view?usp=sharing");
    }

    public void sbykls9(View view) {
        goToUrl("https://drive.google.com/file/d/1Wa1O_jc7H7ldkFhEv-rjQApn33T16dC7/view?usp=sharing");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}