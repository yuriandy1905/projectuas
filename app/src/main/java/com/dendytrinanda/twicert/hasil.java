package com.dendytrinanda.twicert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hasil extends Activity{
    Button backnamapenyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView (R.layout.hasil);
        backnamapenyakit = (Button) findViewById (R.id.gejala);
        backnamapenyakit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                startActivity (new Intent ("com.dendytrinanda.twicert.GEJALA"));
            }
        });
    }

}
