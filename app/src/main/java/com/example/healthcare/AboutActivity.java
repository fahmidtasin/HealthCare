package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
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

        // Create a custom AboutPage
        Element adsElement = new Element();
        adsElement.setTitle("Advertise here");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription("Our goal is to serve the people best services!")
                .addItem(new Element().setTitle("Version 1.0"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addGitHub("fahmidtasin")
                .addWebsite("https://fahmidtasin.github.io")
                .addFacebook("https://www.facebook.com/fahmid.tasin")
                .addPlayStore("MyPlaystore")
                .addInstagram("http://instagram.com/fahmidtasin")
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);
    }

    private Element createCopyright() {
        Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d by Fahmid Shafath Tasin", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);

        // ✅ Correct method for icon in latest Element
//        copyright.setIconResource(R.mipmap.ic_launcher);

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
