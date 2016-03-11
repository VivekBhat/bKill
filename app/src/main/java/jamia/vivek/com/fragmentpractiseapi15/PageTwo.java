package jamia.vivek.com.fragmentpractiseapi15;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;
import java.util.Random;

public class PageTwo extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        int totalBill = 1;
        EditText etNoOfUnits, etCalculate, etEstimatedBill;
        Button bCcalculate;

        etNoOfUnits = (EditText) findViewById(R.id.etNoOfUnits);
        etCalculate = (EditText) findViewById(R.id.etCalculate);
        etEstimatedBill = (EditText) findViewById(R.id.etEstimatedBill);

        int sumOfUnits = 0;

        int[] list = new int[30];

        Random randomObj = new Random();

        for (int i = 0; i < 30; i++) {
            list[i] = randomObj.nextInt(40);
            i++;
        }


/*
First 100 units: Rs 2.96/unit

Next 200 units (from 101 to 300): Rs 5.56/unit

Next 200 units (from 301 to 500): Rs 9.16/unit


Any units after that (above 500): Rs 10.61/unit
 */



        for (int i = 0; i < 30; i++) {

            sumOfUnits += list[i];
        }

        etNoOfUnits.setText(sumOfUnits + " kWh ");


        if (sumOfUnits<100){
            totalBill = (int) (sumOfUnits* 2.96);
            etCalculate.setText("Rs " + totalBill );
        }

    }
}