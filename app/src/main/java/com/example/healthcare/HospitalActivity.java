package com.example.healthcare;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class HospitalActivity extends AppCompatActivity {

    ListView listView;

    String mTitle [] = {"Apollo Hospital Dhaka","United Hospital Dhaka","Central Hospital Dhaka","Square Hospital Dhaka","Shishu Hospital Dhaka"};

    String mDescription [] ={"Press to the visit website","Press to the visit website","Press to the visit website","Press to the visit website","Press to the visit website"};

    int image[] = {R.drawable.apollo,R.drawable.united,R.drawable.central,R.drawable.square,R.drawable.shisu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,mTitle,mDescription,image);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(HospitalActivity.this, WebApollo.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Wait Loading..",Toast.LENGTH_SHORT).show();
                    //class
                }
                if(position==1){
                    Intent intent = new Intent(HospitalActivity.this, WebUnited.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Wait Loading..",Toast.LENGTH_SHORT).show();
                    // class
                }
                if(position==2){
                    Intent intent = new Intent(HospitalActivity.this, WebCentral.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Wait Loading..",Toast.LENGTH_SHORT).show();
                    // class
                }
                if(position==3){
                    //class
                    Intent intent = new Intent(HospitalActivity.this, WebSquare.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Wait Loading..",Toast.LENGTH_SHORT).show();
                }
                if ((position == 4)) {
                    Intent intent = new Intent(HospitalActivity.this, WebShishu.class);
                    startActivity(intent);
                    Toast.makeText(HospitalActivity.this,"Wait Loading..",Toast.LENGTH_SHORT).show();
                    //class
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
            super(c,R.layout.row2,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rimgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row2 = layoutInflater.inflate(R.layout.row2,parent,false);

            ImageView images = row2.findViewById(R.id.image);

            TextView myTitle = row2.findViewById(R.id.textView1);

            TextView myDescription = row2.findViewById(R.id.textView2);

            images.setImageResource(rimgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row2;
        }
    }
}
