package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    EditText editInput, editResult;
    Button btn7, btn8, btn9, btnDivision, btn4, btn5, btn6, btnMultiplication, btn1, btn2, btn3,btnSubstraction, btn0, btnDot, getBtnEqual, btnAddition, btnAC, btnBackspace, btnDel;
    String currentValue, result;
private boolean dot_inserted, operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editInput=(EditText)findViewById(R.id.edtInput);
        editResult=(EditText)findViewById(R.id.edtResult);

        currentValue = "";
        result = "";

        dot_inserted = false;
        operator_inserted = false;

        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnDivision=(Button) findViewById(R.id.btnDivision);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btnMultiplication=(Button) findViewById(R.id.btnMultiplication);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btnSubstraction=(Button) findViewById(R.id.btnSubstraction);
        btn0=(Button) findViewById(R.id.btn0);
        btnDot=(Button) findViewById(R.id.btnDot);
        getBtnEqual=(Button) findViewById(R.id.btnEqual);
        btnAddition=(Button) findViewById(R.id.btnAddition);
        btnAC=(Button) findViewById(R.id.btnAC);
        btnBackspace=(Button) findViewById(R.id.btnBackspace);



        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn7.setText("7");
                //editInput.setText(editInput.getText().toString()+"7");
                currentValue = currentValue + "7";
                displayOne();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn8.setText("8");
                //editInput.setText(editInput.getText().toString()+"8");
                currentValue = currentValue + "8";
                displayOne();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn9.setText("9");
                //editInput.setText(editInput.getText().toString()+"9");
                currentValue = currentValue + "9";
                displayOne();
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDivide.setText("/");
                //editInput.setText(editInput.getText().toString()+"/");

                //set dot inserted = false
                dot_inserted = false;

                //check if current value is empty
                if (!currentValue.isEmpty()){

                }
                    //check if last digit is dot => remove
                    if (currentValue.substring(currentValue.length()-1, currentValue.length()).equals(".")){
                        backspace();
                    }
                    //check if operator inserted == false => append operator to current string
                    if (operator_inserted == false){
                        currentValue = currentValue + " ÷ ";
                        operator_inserted = true;
                    }
                displayOne();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn4.setText("4");
                //editInput.setText(editInput.getText().toString()+"4");
                currentValue = currentValue + "4";
                displayOne();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn5.setText("5");
                //editInput.setText(editInput.getText().toString()+"5");
                currentValue = currentValue + "5";
                displayOne();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn6.setText("6");
                //editInput.setText(editInput.getText().toString()+"6");
                currentValue = currentValue + "6";
                displayOne();
            }
        });
        /*btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnMultiplication.setText("x");
                //editInput.setText(editInput.getText().toString()+"x");
                currentValue = currentValue + "x";
                displayOne();
            }
        });*/

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDivide.setText("/");
                //editInput.setText(editInput.getText().toString()+"/");

                //set dot inserted = false
                dot_inserted = false;

                //check if current value is empty
                if (!currentValue.isEmpty()){

                }
                //check if last digit is dot => remove
                if (currentValue.substring(currentValue.length()-1, currentValue.length()).equals(".")){
                    backspace();
                }
                //check if operator inserted == false => append operator to current string
                if (operator_inserted == false){
                    currentValue = currentValue + " × ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn1.setText("1");
                //editInput.setText(editInput.getText().toString()+"1");
                currentValue = currentValue + "1";
                displayOne();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn2.setText("2");
                //editInput.setText(editInput.getText().toString()+"2");
                currentValue = currentValue + "2";
                displayOne();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn3.setText("3");
                //editInput.setText(editInput.getText().toString()+"3");
                currentValue = currentValue + "3";
                displayOne();
            }
        });
        /*btnSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnMinus.setText("-");
                //editInput.setText(editInput.getText().toString()+"-");
                currentValue = currentValue + "-";
                displayOne();
            }
        });*/

        btnSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDivide.setText("/");
                //editInput.setText(editInput.getText().toString()+"/");

                //set dot inserted = false
                dot_inserted = false;

                //check if current value is empty
                if (!currentValue.isEmpty()){

                }
                //check if last digit is dot => remove
                if (currentValue.substring(currentValue.length()-1, currentValue.length()).equals(".")){
                    backspace();
                }
                //check if operator inserted == false => append operator to current string
                if (operator_inserted == false){
                    currentValue = currentValue + " - ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn0.setText("0");
                //editInput.setText(editInput.getText().toString()+"0");
                currentValue = currentValue + "0";
                displayOne();
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDot.setText(".");
                //editInput.setText(editInput.getText().toString()+".");
                //currentValue = currentValue + ".";
                //displayOne();

                //check if its empty => append "0." and set dot_inserted variable to true
                if (currentValue.isEmpty()){
                    currentValue = "0.";
                    dot_inserted = true;
                }


                //check if dot_inserted == false => append "."
                if (dot_inserted == false){
                    currentValue = currentValue + ".";
                    dot_inserted = true;
                }
                displayOne();
            }
        });
        getBtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnPercent.setText("=");
                //editInput.setText(editInput.getText().toString()+"%");
                //currentValue = currentValue + "=";
                //displayOne();

                // check if the last digit is not an operator
                if (operator_inserted==true && !currentValue.substring(currentValue.length()-1,currentValue.length()).equals(" ")){

                    String [] tokens = currentValue.split(" ");

                    switch (tokens[1].charAt(0)){

                        case '÷':
                            result = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                        case '×':
                            result = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            result = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case '+':
                            result = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });
        /*btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnPlus.setText("+");
                //editInput.setText(editInput.getText().toString()+"+");
                currentValue = currentValue + "+";
                displayOne();
            }
        });*/

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDivide.setText("/");
                //editInput.setText(editInput.getText().toString()+"/");

                //set dot inserted = false
                dot_inserted = false;

                //check if current value is empty
                if (!currentValue.isEmpty()){

                }
                //check if last digit is dot => remove
                if (currentValue.substring(currentValue.length()-1, currentValue.length()).equals(".")){
                    backspace();
                }
                //check if operator inserted == false => append operator to current string
                if (operator_inserted == false){
                    currentValue = currentValue + " + ";
                    operator_inserted = true;
                }
                displayOne();
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnAC.setText("AC");
                //editInput.setText("");
                clear();
                displayOne();
                displayTwo();
            }
        });
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnEqual.setText("=");
                //editInput.setText(editInput.getText().toString()+"=");
                //currentValue = currentValue + " ";                           //  baki ahe
                backspace();
                displayOne();
            }
        });


    }
    public void displayOne(){                      //*
            editInput.setText(currentValue);
        }
        public void displayTwo(){
            editResult.setText(result);
        }
        public void clear(){
        currentValue = "";
        result = "";
        dot_inserted = false;
        operator_inserted = false;
        }

        public void backspace() {
            //if current value is not empty => remove last character
            if (!currentValue.isEmpty()) {

                //check if the dot is last char in string => set dot_inserted = false
                if (currentValue.substring(currentValue.length() - 1, currentValue.length()).equals(".")) {
                    dot_inserted = false;
                }

                //if the operator is detected => delete three digits or chars from current val string and set operator_inserted = false
                if (currentValue.substring(currentValue.length() - 1, currentValue.length()).equals(" ")) {
                    currentValue = currentValue.substring(0, currentValue.length() - 3);
                    operator_inserted = false;
                } else {
                    currentValue = currentValue.substring(0, currentValue.length() - 1);
                }
            }
        }
}

