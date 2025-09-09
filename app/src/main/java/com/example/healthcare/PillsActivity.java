package com.example.healthcare;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PillsActivity extends AppCompatActivity {

    ListView listView;

    String mTitle [] = {"Allergy","Fever","Gastric","Diarrhea"};

    String mDescription [] ={"Drugs for Allergy","Drugs for Fever","Drugs for Gastric","Drugs for Diarrhea"};

    int image[] = {R.drawable.allery,R.drawable.fever,R.drawable.gas,R.drawable.diarrhea};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pills);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,mTitle,mDescription,image);
        listView.setAdapter(adapter);

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

             if(position==0){
                 Intent intent = new Intent(PillsActivity.this, DetailAllergy.class);
                 startActivity(intent);
                 Toast.makeText(PillsActivity.this,"Allergy",Toast.LENGTH_SHORT).show();
                 //class
             }
             if(position==1){
                 Intent intent = new Intent(PillsActivity.this, DetailFever.class);
                 startActivity(intent);
                 Toast.makeText(PillsActivity.this,"Fever",Toast.LENGTH_SHORT).show();
                 // class
             }
             if(position==2){
                 Intent intent = new Intent(PillsActivity.this, DetailGastric.class);
                 startActivity(intent);
                 Toast.makeText(PillsActivity.this,"Gastric",Toast.LENGTH_SHORT).show();
                 // class
             }
             if(position==3){
                 Intent intent = new Intent(PillsActivity.this, DetailDiarrhea.class);
                 startActivity(intent);
                 Toast.makeText(PillsActivity.this,"Diarrhea",Toast.LENGTH_SHORT).show();
                 // class
             }
         }
     });
}

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String  rTitle[];
        String  rDescription[];
        int rimgs[];

        MyAdapter (Context c, String title[], String description[],int imgs[]){
            super(c,R.layout.row,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rimgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row,parent,false);

            ImageView images = row.findViewById(R.id.image);

            TextView myTitle = row.findViewById(R.id.textView1);

            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rimgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }
}