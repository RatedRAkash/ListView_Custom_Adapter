package com.example.listview_custom_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] countryNames;
    Context context; // Context er madhhome Activity er shb store korte pari
    private LayoutInflater inflater;  // "xml" file ke "view" te convert korar kaaj ei "LayoutInflater" er

    CustomAdapter(Context context, String[] countryNames, int[] flags)
    {
        this.context=context; //Ei line er maddhome amra MainActivity er shb kisu Store kore fellam Context er moddhe...
        this.countryNames=countryNames;
        this.flags=flags;
    }


    @Override
    public int getCount() {
        return countryNames.length; // koita item return korbe sheita indicate kore... Total Number of item jeita display korar kotha
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //first ee "Layout_Inflater_Service" ta ke niye sheita "inflater" ee save korlam
            convertView = inflater.inflate(R.layout.sample_view_custom,parent,false);  // then ei "sample_view" ke amra VIEW te convert korbo Inflater er sahajje...
        }

        //ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.countryNameId);

        //imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);


        return convertView;
    }
}

