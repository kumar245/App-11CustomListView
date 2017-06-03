package com.kumar.user.app_11customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by User on 6/3/2017.
 */

public class CustomerListViewAdapter extends BaseAdapter {
private Context context;
    private ArrayList<HashMap<String,String>> books;
    private static LayoutInflater inflater=null;

    public CustomerListViewAdapter(Context context, ArrayList<HashMap<String, String>> books) {
        this.context = context;
        this.books = books;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
if (convertView==null){
    view=inflater.inflate(R.layout.list_row,null);
    TextView title= (TextView) view.findViewById(R.id.bookTitle);
    TextView author= (TextView) view.findViewById(R.id.bookAuthor);
    TextView pages= (TextView) view.findViewById(R.id.pages);
    ImageView imageView= (ImageView) view.findViewById(R.id.list_image);
    HashMap<String,String> mBook=new HashMap<>();
    mBook=books.get(position);
    title.setText(mBook.get("titles"));
    author.setText(mBook.get("author"));
    pages.setText(mBook.get("pages"));
    imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.blue_swirl));

    }
        return view;

    }

    }
