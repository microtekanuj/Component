package com.example.component;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1;
        ToggleButton t1;
        Switch s;
        Spinner s1;
        CheckBox c1;
        RadioButton r1;
        ListView l1;
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.tbutton);
        s=findViewById(R.id.s);
        s1=findViewById(R.id.spinner);
        c1=findViewById(R.id.checkbox);
        r1=findViewById(R.id.rbutton);
        l1=findViewById(R.id.listview);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this, "Going to second activity", Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this, "Toggle to second activity", Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this, "Switch to second activity", Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Spinner selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                Toast.makeText(MainActivity.this, "Spinner not selected", Toast.LENGTH_SHORT).show();
            }
        });
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                Toast.makeText(MainActivity.this, "Item Checked", Toast.LENGTH_SHORT).show();
            }
        });
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Radio button", Toast.LENGTH_SHORT).show();
            }
        });
        String example[]={"Anuj","Ashish","Dhruv","Sid","Rahul"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,example);
        l1.setAdapter(arrayAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "List view", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
