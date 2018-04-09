package com.example.admin.app3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.BaseAdapter;

public class CustomAdapter extends AppCompatActivity {
    Context c;
    int[] image= new int[]{R.drawable.mu1,
            R.drawable.kov3,
            R.drawable.thk1,
            R.drawable.kumr1,
            R.drawable.var1 };
    String[]Name={" Munnar",
            "Kovalam",
            "Thekkady",
            "Kumarakom",
            "Varkala"};

    String[]Places={
            "Get ready to be lost in the chanceless beauty of the place where three rivers meet, namely Kundalay, Mudrapuzha and Nallathanni." +
            " Situated at 1524-metre altitude on the Western Ghats, the tourist places in Munnar makes you wonder if it is the" +
            " birthplace of beauty. The lush green landscape, waterfalls, lakes, forests and tea plantations make this place a heaven" +
            " on earth. The place offers spectacular view of misty valleys and lakes. " +
            "You might never have believed that watching tea plantations continuously might be so absorbing and interesting. " +
            "You can have your share of adventure here as you can go paragliding, trekking and rock climbing.\n\n" +
                    "Visitor Information\n\n" +
                    "\uF0B7Famous for: Hill station, Landscape, Tea Estates, Flora, Fauna\n" +
                    "\uF0B7Major Attractions: Eravikulam National Park, Tea Estates and Anamudi.\n" +
                    "\uF0B7Nearby Places: Chalakudy, Thekkady.\n" +
                    "\uF0B7Ideal Visit Time: 2-3 days.",

                    "Kovalam is yet another stunning location in Kerala. Situated 16 kms away from the city of Trivandrum,Kovalam has three enchanting beaches. The largest of all the three beaches is the Lighthouse Beach. " +
                    "Hawah Beach is the second largest one here and the third beach is Samudra. " +
                    "Kovalam is one of the most sought after destinations in Kerala. \n\n" +
                            "Visitor Information\n\n" +
                            "\uF0B7Famous for: Backwaters, Nature, Houseboats.\n" +
                            "\uF0B7Major Attraction: Vembanad Lake.\n" +
                            "\uF0B7Nearby Places: Alleppey, Thekkady.\n" +
                            "\uF0B7Ideal Visit Time: 2 days.",

                    "Thekkady offers a great chance to view wildlife while on a cruise. " +
                    "You can find various wildlife species here including elephants, tigers, deer, bisons and many more. " +
                    "Elephant rides are available here to take you inside the forest. " +
                    "Plantations and hill stations offer a picturesque setting to the place. You can go on a trek here. " +
                    "Some of the most important tourist attractions in Thekkady are Periyar River, Murikkady and Chellarkovil.\n\n" +
                            "Visitor Information\n\n" +
                            "\uF0B7Famous for: Backwaters, Wildlife, Elephant rides.\n" +
                            "\uF0B7Major Attraction: Periyar National Park.\n" +
                            "\uF0B7Nearby Places: Alleppey, Kumarakom.\n" +
                            "\uF0B7Ideal Visit Time: 1-2 days.",

                    "Kumarakom is located near Kottayam. It is one of the famous attractions of Kerala." +
                    " It is bird watchers’ paradise owing to the 14-acre bird sanctuary, a favorite ground for migratory birds." +
                    " Kumarakom is also a spectacular backwater destination and hence you can go on a boating ride here. " +
                    "As Ayurvedic massage is done here, the place is a favorite for everyone who seeks to relax body and mind." +
                    " The Vembanad Lake in Kumarakom is a favorite tourist spot. It is the largest lake in Kerala and the longest lake in India. " +
                    "It is a great place to spend a relaxed day watching sunrise or sunset depending on the time of cruise.\n\n" +
                            "Visitor Information\n\n" +
                            "\uF0B7Famous for: Beaches, Cliffs, Landscape.\n" +
                            "\uF0B7Major Attractions: Varkala beach and cliffs.\n" +
                            "\uF0B7Nearby Places: Thiruvananthapuram, Kovalam, Paravur.\n" +
                            "\uF0B7Ideal Visit Time: 2 days." ,


                    "Varkala is famous for Ayurvedic massage and the place itself is in a wonderful setting. " +
                    "The beach and the mountain make the place attractive. You would not want to miss the sight of sunset here. " +
                    "The beach is clean and offers a great relaxation. You could stretch and let your eyes feast on the tranquil atmosphere or go for swimming and enjoy a great physical exercise." +
                    " One of the most important aspects about the beach is that it is less crowded and hence you can have your space without being disturbed. " +
                    "Let the beauty of the beach and the atmosphere sinks in as you spend a quiet evening here.\n\n" +
                            "Visitor Information\n\n" +
                            "\uF0B7Famous for: Beaches, Nature, Rivers.\n" +
                            "\uF0B7Major Attraction: Kovalam beach\n" +
                            "\uF0B7Nearby Places: Thiruvananthapuram, Varkala.\n" +
                            "\uF0B7Ideal Visit Time: 2 days."};

    public CustomAdapter (Context ctx){

        this.c=ctx;
    }
    public int getCount(){
        return Name.length;
    }
    public Object getItem(int Position) {
        return Name[Position] ;
    }
    public long getItemId(int Positiion) {
        return Positiion;
    }
    public View getView(int Position, View convertview, ViewGroup viewGroup) {
        if (convertview==null)
        {
            LayoutInflater inflater= (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview=inflater.inflate(R.layout.activity_main3,null);
        }
        TextView nametext=(TextView)convertview.findViewById(R.id.Name);

        ImageView img=(ImageView) convertview.findViewById(R.id.imageView1);
        nametext.setText(Name[Position]);
        img.setImageResource(image[Position]);
        return convertview;

    }

}
