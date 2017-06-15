package com.meowroll.android.exunittestcase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText text_inputNumber;
    private Button btnFtoC;
    private Button btnCtoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_inputNumber=(EditText) findViewById(R.id.editText2);
        btnFtoC =(Button)findViewById(R.id.buttonFtoC);
        btnCtoF =(Button)findViewById(R.id.buttonCtoF);
    }



    public void lannchSecond(View view) {

        int intID = view.getId();
        Button button = (Button) findViewById(intID);
        String message = button.getText().toString();
        double xValue =  Double.parseDouble(text_inputNumber.getText().toString());
        double yValue= 0;
        String result = "";
        switch (message)
        {
            case "F to C":
                yValue= ConvertUtil.convertFromFahrenheitToCelsius(xValue);
                result = String.format("華氏 %f 度 等於 攝氏 %f 度 ", xValue,yValue);

                break;
            case "C to F":
                yValue= ConvertUtil.convertFromCelsiusToFahrenheit(xValue);
                result = String.format("攝氏 %f 度 等於 華氏 %f 度 ", xValue,yValue);
                break;
            default:

                break;
        }
        Intent intent = new Intent(this,SecondActivity.class);


        intent.putExtra("result",result);

        startActivity(intent);

    }
}
