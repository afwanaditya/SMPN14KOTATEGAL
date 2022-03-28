package com.ifa.smp14kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku8);
    }

    public void mat8s1(View view) {
        goToUrl("https://drive.google.com/file/d/1U3NTQWTF2NBVtuk_hakHouzUJV4Af7FA/view?usp=sharing");
    }

    public void mat8s2(View view) {
        goToUrl("https://drive.google.com/file/d/1U6Vgwdb_Xiglv3Pxn6OsWaTuiXUi4ffl/view?usp=sharing");
    }

    public void ipa1kls8(View view) {
        goToUrl("https://drive.google.com/file/d/1TxMrzAmD_VAgo50tpFW3roYoZK6iUf_6/view?usp=sharing");
    }

    public void ipa2kls8(View view) {
        goToUrl("https://drive.google.com/file/d/1U-MMg75uBOYIOmRc77Bepxr9riIrwXz1/view?usp=sharing");
    }

    public void pra1kls8(View view) {
        goToUrl("https://drive.google.com/file/d/1VdwP4T_i729bJRqSwLW_zCsFtmey6KD4/view?usp=sharing");
    }

    public void pra2kls8(View view) {
        goToUrl("https://drive.google.com/file/d/1Vlq9oo8qaQkNzACCgUNcmKfJRxm-oWrA/view?usp=sharing");
    }

    public void indkls8(View view) {
        goToUrl("https://drive.google.com/file/d/1TslxrtBmz_m4VCa7IlewKWjbQj2GTcSz/view?usp=sharing");
    }

    public void ingkls8(View view) {
        goToUrl("https://drive.google.com/file/d/1TtzAclXmXX-wEJXgk3_HVWtcuWVDXrqq/view?usp=sharing");
    }

    public void ppkn8(View view) {
        goToUrl("https://drive.google.com/file/d/1WiuFjy6XwtWfPUKcWdNAn-WEGPW0dC7R/view?usp=sharing");
    }

    public void paikls8(View view) {
        goToUrl("https://drive.google.com/file/d/1VtvtHEMD9N0t_rg40CaB_wnC1ZyBBPl3/view?usp=sharing");
    }

    public void penjas8(View view) {
        goToUrl("https://drive.google.com/file/d/1UI6h7y3c1ISx1wg32siJARstFtEoYSLr/view?usp=sharing");
    }

    public void sbykls8(View view) {
        goToUrl("https://drive.google.com/file/d/1VsHDDRYLcBAWj0DyhPazXy-urnHiK6kW/view?usp=sharing");
    }

    public void ipskls8(View view) {
        goToUrl("https://drive.google.com/file/d/1VdtC2d8igkOYX1IAC8dteOyvWJyZoxtL/view?usp=sharing");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}