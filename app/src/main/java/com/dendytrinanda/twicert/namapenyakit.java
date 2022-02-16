package com.dendytrinanda.twicert;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class namapenyakit extends ListActivity {
    TextView selection;
    String[] items={"Jakarta", "Bangka Belitung","Pangkalpinang"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.namapenyakit);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items));
        selection=(TextView)findViewById(R.id.selection);
    }

    public void onListItemClick(ListView parent, View v, int position,long id) {
        selection.setText(items[position]);
    }
}