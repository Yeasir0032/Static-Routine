package com.jiggle.routine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearFirst;
    LinearLayout linearSecond;
    LinearLayout linearThird;
    LinearLayout linearFourth;

    Spinner spn;
    TextView time1;
    TextView name1;
    TextView details1;
    TextView time2;
    TextView name2;
    TextView details2;
    TextView time3;
    TextView name3;
    TextView details3;
    TextView time4;
    TextView name4;
    TextView details4;

    Calendar calendar = Calendar.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing all views in a function
        initializeViews();
        //Created an array adapter for spinner item
        ArrayAdapter<CharSequence> arr = ArrayAdapter.createFromResource(this,R.array.days, android.R.layout.simple_spinner_item);
        arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if(spn != null){
            //Setting adapter for the spinner
            spn.setAdapter(arr);
        }
        //Getting the current time
        calendar = Calendar.getInstance();

        //Switch case for current day selecting the item in the spinner
        switch (new SimpleDateFormat("EEEE").format(calendar.getTime())){

            case "Tuesday":
                spn.setSelection(1);
                break;
            case "Wednesday":
                spn.setSelection(2);
                break;
            case "Thursday":
                spn.setSelection(3);
                break;
            case "Friday":
                spn.setSelection(4);
                break;
            default:
                spn.setSelection(0);
                break;
        }
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i) {
                    case (0): {
                        time1.setText("10:00 am - 11:40 am");
                        time2.setText("11:40 am - 01:20 pm");
                        time3.setText("01:50 pm - 02:40 pm");
                        time4.setText("02:40 pm - 04:20 pm");
                        name1.setText("Basic Electrical Engineering");
                        name2.setText("Engineering Chemistry");
                        name3.setText("Programming in C");
                        name4.setText("Tutorial/Remedial classes");
                        details1.setText("EENUGES01");
                        details2.setText("CHMUGBS01");
                        details3.setText("CSEUGES01");
                        details4.setText("");
                        linearFourth.setVisibility(View.VISIBLE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (1): {
                        time1.setText("10:00 am - 11:40 am");
                        time2.setText("11:40 am - 01:20 pm");
                        time3.setText("01:50 pm - 02:40 pm");
                        time4.setText("02:40 pm - 04:20 pm");
                        name1.setText("Communicative English");
                        name2.setText("Engineering Mathematics II");
                        name3.setText("Engineering Chemistry");
                        name4.setText("Tutorial/Remedial classes");
                        details1.setText("ENGUGHU01");
                        details2.setText("MATUGBS02");
                        details3.setText("CHMUGBS01");
                        details4.setText("");
                        linearFourth.setVisibility(View.VISIBLE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (2): {
                        time1.setText("10:50 am - 01:20 pm");
                        time2.setText("01:50 pm - 03:30 pm");
                        time3.setText("03:30 pm - 05:10 pm");
                        name1.setText("Engineering Chemistry Lab");
                        name2.setText("Engineering Mathematics II");
                        name3.setText("Communicative English Lab");
                        details1.setText("CHMUGBS02");
                        details2.setText("MATUGBS02");
                        details3.setText("ENGUGHU02");
                        linearFourth.setVisibility(View.GONE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (3): {
                        time1.setText("10:00 am - 10:50 am");
                        time2.setText("10:50 am - 01:20 pm");
                        time3.setText("01:50 pm - 04:20 pm");
                        name1.setText("Basic Electrical Engineering");
                        name2.setText("Mechanical Lab");
                        name3.setText("Basic Electrical Engineering Lab");
                        details1.setText("EENUGES01");
                        details2.setText("MENUGES02");
                        details3.setText("EENUGES02");
                        linearFourth.setVisibility(View.GONE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (4): {
                        time1.setText("10:00 am - 10:50 am");
                        time2.setText("10:50 am - 12:30 pm");
                        time3.setText("01:50 pm - 05:10 pm");
                        name1.setText("Communicative English");
                        name2.setText("Programming in C");
                        name3.setText("Programming Lab");
                        details1.setText("ENGUGHU01");
                        details2.setText("CSEUGES01");
                        details3.setText("CSEUGES02");
                        linearFourth.setVisibility(View.GONE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    void initializeViews(){
        linearFirst = findViewById(R.id.linearFirst);
        linearSecond = findViewById(R.id.linearSecond);
        linearThird = findViewById(R.id.linearThird);
        linearFourth = findViewById(R.id.linearFourth);
        time1 = findViewById(R.id.time1);
        name1 = findViewById(R.id.name1);
        details1 = findViewById(R.id.details1);
        time2 = findViewById(R.id.time2);
        name2 = findViewById(R.id.name2);
        details2 = findViewById(R.id.details2);
        time3 = findViewById(R.id.time3);
        name3 = findViewById(R.id.name3);
        details3 = findViewById(R.id.details3);
        time4 = findViewById(R.id.time4);
        name4 = findViewById(R.id.name4);
        details4 = findViewById(R.id.details4);
        spn = findViewById(R.id.spinnerDay);

    }
}