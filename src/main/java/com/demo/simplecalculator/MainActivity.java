package com.demo.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, sub, quan, shar, resultBtn;
    EditText editText1, editText2;
    TextView resultText;

    double number1, number2, numResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        quan = findViewById(R.id.quan);
        shar = findViewById(R.id.shar);
        editText1 = findViewById(R.id.edittext1);
        editText2 = findViewById(R.id.edittext2);
        resultBtn = findViewById(R.id.resultBtn);
        resultText = findViewById(R.id.resulttext);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String E1 = editText1.getText().toString();
                        String E2 = editText2.getText().toString();

                        if (!E1.isEmpty() || !E2.isEmpty()){
                            number1 = Double.parseDouble(E1);
                            number2 = Double.parseDouble(E2);
                            numResult = number1 + number2;
                            resultText.setText(""+numResult);
                        }else {

                            editText1.setError("Error");
                            editText2.setError("Error");

                        }



                    }
                });


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String E1 = editText1.getText().toString();
                        String E2 = editText2.getText().toString();

                        if (!E1.isEmpty() || !E2.isEmpty()){
                            number1 = Double.parseDouble(E1);
                            number2 = Double.parseDouble(E2);
                            numResult = number1 - number2;
                            resultText.setText(""+numResult);
                        }else {

                            editText1.setError("Error");
                            editText2.setError("Error");

                        }



                    }
                });


            }
        });
        quan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String E1 = editText1.getText().toString();
                        String E2 = editText2.getText().toString();

                        if (!E1.isEmpty() || !E2.isEmpty()){
                            number1 = Double.parseDouble(E1);
                            number2 = Double.parseDouble(E2);
                            numResult = number1 * number2;
                            resultText.setText(""+numResult);
                        }else {

                            editText1.setError("Error");
                            editText2.setError("Error");

                        }



                    }
                });


            }
        });
        shar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                resultBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String E1 = editText1.getText().toString();
                        String E2 = editText2.getText().toString();

                        if (!E1.isEmpty() || !E2.isEmpty()){
                            number1 = Double.parseDouble(E1);
                            number2 = Double.parseDouble(E2);
                            numResult = number1 / number2;
                            resultText.setText(""+numResult);
                        }else {

                            editText1.setError("Error");
                            editText2.setError("Error");

                        }



                    }
                });


            }
        });



    }
}
