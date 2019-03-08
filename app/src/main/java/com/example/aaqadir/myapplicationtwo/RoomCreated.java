package com.example.aaqadir.myapplicationtwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;

public class RoomCreated extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_created);

        Button btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dintent = new Intent(RoomCreated.this,NavMain.class);
                RoomCreated.this.startActivity(dintent);
                    /*    Snackbar.make(view, "Taking You Back", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

            }
        });
    }
}
