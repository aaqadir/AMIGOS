package com.example.aaqadir.myapplicationtwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CreateRoom extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"a_aqadir", "a_ashfi", "c_faizan", "a_khalid", "c_sami", "b_hammad",
            "a_masood", "h_ahad", "g_kashyap", "a_shamshad", "k_husain", "a_anwar", "a_bhumeet", "b_praneet",
            "d_chetan", "a_salman", "a_shahid", "a_haaris", "a_izhan", "a_razique"};
    int flags[] = {
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp, R.drawable.ic_person_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_room);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);


   /* @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_room);
*/

        Button btn = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rcintent = new Intent(CreateRoom.this, RoomCreated.class);
                CreateRoom.this.startActivity(rcintent);
            }
        });

    }
}
