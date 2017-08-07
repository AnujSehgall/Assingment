package com.example.anuj.assingment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Home_Act extends AppCompatActivity {

    String[] images = {"https://www.pablopicasso.org/images/paintings/three-musicians.jpg",
            "http://www.themost10.com/wp-content/uploads/2012/03/Blue-Nude-By-Pablo-Picasso.jpg",
            "http://thirddime.com/media/1/salvador-dali/salvador-dali_the-elephants_thirddime.jpg",
            "http://www.themost10.com/wp-content/uploads/2012/03/03-Asleep.jpg"
            ,"https://www.dalipaintings.com/images/paintings/the-burning-giraffe.jpg"
    };

    String[] names = {"Pablo Picasso", "Pablo Picasso","Salvador Dali","Pablo Picasso","Salvador Dali"};

    String[] des = {"Three Musicians"," Blue Nude ","The Elephants","Asleep","The Burning Giraffe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        ListView listView = (ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

    }



    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview);
            TextView textView = (TextView)convertView.findViewById(R.id.text);
            TextView text = (TextView)convertView.findViewById(R.id.text2);
            Button fav = (Button)convertView.findViewById(R.id.button);

            Picasso.with(getApplicationContext())
                    .load(images[position])
                    .into(imageView);
            // imageView.setImageResource(images[position]);
            textView.setText(names[position]);
            text.setText(des[position]);
            return convertView;
        }
    }
}
