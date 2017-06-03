package com.kumar.user.app_11customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private CustomerListViewAdapter customerListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] bookTitles=new String[]{
                "The Alchemist",
                "The Giver",
                "How to Kill a Mockingbird",
                "Lost in Paradise",
                "The Complete Android and Java Developer...",
                "Titanic",
                "The Kite Runner",
                "Lord of the Rings",
                "The Hobbit",
                "Java in a Nutshell",
                "The Social Network",
                "Game Programming All in One"
        };
        final String[] bookPages=new String[]{

                "300 pages",
                "350 pages",
                "900 pages",
                "230 pages",
                "1200 pages",
                "450 pages",
                "350 pages",
                "120 pages",
                "2300 pages",
                "2100 pages",
                "329 pages",
                "1978 pages"
        };
        final String[] authors=new String[]{
                "Paulo Coelho",
                "Lois Lowry",
                "Harper Lee",
                "Somell Author!",
                "Paulo and Fahd",
                "Simon Adams",
                "Khaled Hosseini",
                "J. R. R. Tolkien",
                "J. R. R. Tolkien",
                "Flannagan",
                "Ben Mezrich",
                "Harbour"
        };
        ArrayList<HashMap<String,String>> authorList= new ArrayList<>();

        for (int i=0;i<10;i++){

            HashMap<String,String> data=new HashMap<>();
            data.put("titles",bookTitles[i]);
            data.put("pages",bookPages[i]);
            data.put("author",authors[i]);

            authorList.add(data);

        }
        listView= (ListView) findViewById(R.id.lsView);
        //setup Adapter
        customerListViewAdapter=new CustomerListViewAdapter(getApplicationContext(),authorList);
        listView.setAdapter(customerListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int intPosition=position;
                String clickable=listView.getItemAtPosition(intPosition).toString();
                Toast.makeText(MainActivity.this, "Item Clicked Id is :" + clickable, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
