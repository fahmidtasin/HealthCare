package com.example.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Element adsElement = new Element();
        adsElement.setTitle("Advertise here");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription("Our goal is to serve the people best services!")
                .addItem(new Element().setTitle("Version 1.0"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addWebsite("http://CarLMama.com")
                .addFacebook("https://www.facebook.com/fahmid.tasin")
                .addTwitter("https://twitter.com/fahmidtasin")
                .addYoutube("https://www.youtube.com/channel/UChu4_VRFCW_6YW3v3kAwNzQ?")
                .addPlayStore("MyPlaystore")
                .addInstagram("MyInstagram")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }

    private Element createCopyright() {

        Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d by CarLMama", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutActivity.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }

}
