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
            case "Saturday":
                spn.setSelection(5);
            case "Sunday":
                spn.setSelection(6);
            default:
                spn.setSelection(0);
                break;
        }
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i) {
                    case (0): {
                        //MONDAY ROUTINE
                        time1.setText("10:00 am - 11:40 am");
                        time2.setText("11:40 am - 01:20 pm");
                        time3.setText("01:50 pm - 03:30 pm");
                        time4.setText("03:30 pm - 05:10 pm");
                        name1.setText("INDIAN CONSTITUTION");
                        name2.setText("SIGNALS AND NETWORKS");
                        name3.setText("ENGINEERING MATHEMATICS III");
                        name4.setText("REMEDIAL CLASSES");
                        details1.setText("UCCUGAU03");
                        details2.setText("ECEUGPC02");
                        details3.setText("MATUGBS03");
                        details4.setText("");
                        linearFourth.setVisibility(View.VISIBLE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        linearFirst.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (1): {
                        //TUESDAY ROUTINE
                        time1.setText("10:00 am - 11:40 am");
                        time2.setText("11:40 am - 01:20 pm");
                        time3.setText("01:50 pm - 03:30 pm");
                        time4.setText("03:30 pm - 05:10 pm");
                        name1.setText("ENGINEERING MATHEMATICS III");
                        name2.setText("PHYSICS OF SEMICONDUCTOR DEVICES");
                        name3.setText("ANALOG ELECTRONICS");
                        name4.setText("REMEDIAL CLASSES");
                        details1.setText("MATUGBS03");
                        details2.setText("ECEUGPC03");
                        details3.setText("ECEUGPC01");
                        details4.setText("");
                        linearFourth.setVisibility(View.VISIBLE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        linearFirst.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (2): {
                        //WEDNESDAY ROUTINE
                        time1.setText(" ");
                        time2.setText("10:50 am - 01:20 am ");
                        time3.setText("01:50 pm - 02:40 pm");
                        time4.setText("");
                        name1.setText("");
                        name2.setText("ANALOG ELECTRONICS LAB");
                        name3.setText("PHYSICS OF SEMICONDUCTOR DEVICES");
                        details1.setText("");
                        details2.setText("ECEUGPC04");
                        details3.setText("ECEUGPC03");
                        linearFourth.setVisibility(View.GONE);
                        linearFirst.setVisibility(View.GONE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (3): {
                        //THURSDAY ROUTINE
                        time1.setText("10:50 am - 11:40 am");
                        time2.setText("11:40 am - 01:20 pm");
                        time3.setText("01:50 pm - 04:20 pm");
                        time4.setText("04:20 pm- 05:10 pm");
                        name1.setText("ANALOG ELECTRONICS");
                        name2.setText("DADA STRUCTURE AND ALGORITHMS ANALYSIS");
                        name3.setText("DIGITAL LOGIC");
                        name4.setText("REMEDIAL CLASS");
                        details1.setText("ECEUGPC01");
                        details2.setText("CSEUGOE01");
                        details3.setText("CSEUGPC02");
                        details4.setText("");
                        linearFourth.setVisibility(View.VISIBLE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        linearFirst.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (4): {
                        //FRIDAY ROUTINE
                        time1.setText("10:50 am - 11:40 am");
                        time2.setText("11:40 am - 12:30 pm");
                        time3.setText("01:50 pm - 01:50 - 04:20 pm");
                        name1.setText("SIGNALS AND NETWORKS");
                        name2.setText("DATA STRUCTURE AND ALGORITHMS ANALYSIS");
                        name3.setText("MICROPROCESSOR AND MICROMETER LAB");
                        details1.setText("ECEUGPC02");
                        details2.setText("CSEUGOU01");
                        details3.setText("ECEUGPC14");
                        linearFourth.setVisibility(View.GONE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
                        linearFirst.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (5): {
                        //SATURDAY ROUTINE
                        time1.setText("");
                        time2.setText("");
                        time3.setText("");
                        name1.setText("ABE!! PADHAI CHODO ,WEEKEND HAI MAJE KARO.....");
                        name2.setText("DATA STRUCTURE AND ALGORITHMS ANALYSIS");
                        name3.setText("MICROPROCESSOR AND MICROMETER LAB");
                        details1.setText("");
                        details2.setText("CSEUGOU01");
                        details3.setText("ECEUGPC14");
                        linearFourth.setVisibility(View.GONE);
                        linearThird.setVisibility(View.GONE);
                        linearSecond.setVisibility(View.GONE);
                        linearFirst.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (6): {
                        //SUNDAY ROUTINE
                        time1.setText("");
                        time2.setText("");
                        time3.setText("");
                        name1.setText("KAL SE PADHAI KARENGE");
                        name2.setText("DATA STRUCTURE AND ALGORITHMS ANALYSIS");
                        name3.setText("MICROPROCESSOR AND MICROMETER LAB");
                        details1.setText("WO KAL KABHI NAHI AYEGA.....");
                        details2.setText("CSEUGOU01");
                        details3.setText("ECEUGPC14");
                        linearFourth.setVisibility(View.GONE);
                        linearThird.setVisibility(View.GONE);
                        linearSecond.setVisibility(View.GONE);
                        linearFirst.setVisibility(View.VISIBLE);
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