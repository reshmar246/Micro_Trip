package com.example.admin.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    ListView list;
    int[] image= new int[]{R.drawable.mu1,
            R.drawable.kov1,
            R.drawable.thk1,
            R.drawable.kumr1,
            R.drawable.var1 };
    String[]Name={"Munnar",
            "Kovalam",
            "Thekkady",
            "Kumarakom",
            "Varkala"
    };
    String[]Desc={"  District: Idukki\n  Kashmir of South India","  District: Trivandrum\n  Paradise of South","  District: Idukki \n   Wildife Reserves ",
            "  District: Idukki \n  Backwater Tourism"," District: Trivandrum\n  Popular Papanasam Beach"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        list=(ListView)findViewById(R.id.listview);
        CustomAdapter CustomAdapter=new CustomAdapter();
        list.setAdapter(CustomAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int Position, long id) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("Position",Position);
                startActivity(intent);
            }
        });

    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
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
        public View getView(int position, View convertview, ViewGroup parent){
            View view1=getLayoutInflater().inflate(R.layout.activity_custom_adapter,null);
            ImageView imageView=(ImageView) view1.findViewById(R.id.imageView);
            TextView textView=view1.findViewById(R.id.TextView);
            TextView textView2=view1.findViewById(R.id.TextView2);
            imageView.setImageResource(image[position]);
            textView.setText(Name[position]);
            textView2.setText(Desc[position]);
            return view1;
        }
    }
}
