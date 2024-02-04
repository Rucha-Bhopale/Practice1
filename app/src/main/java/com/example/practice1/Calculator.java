package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    EditText editInput;
    Button btn7, btn8, btn9, btnDivide, btn4, btn5, btn6, btnMultiplication, btn1, btn2, btn3,btnMinus, btn0, btnDot, btnPercent, btnPlus, btnAC, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editInput=(EditText)findViewById(R.id.edtInput);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnDivide=(Button) findViewById(R.id.btnDivide);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btnMultiplication=(Button) findViewById(R.id.btnMultiplication);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btnMinus=(Button) findViewById(R.id.btnMinus);
        btn0=(Button) findViewById(R.id.btn0);
        btnDot=(Button) findViewById(R.id.btnDot);
        btnPercent=(Button) findViewById(R.id.btnPercent);
        btnPlus=(Button) findViewById(R.id.btnPlus);
        btnAC=(Button) findViewById(R.id.btnAC);
        btnEqual=(Button) findViewById(R.id.btnEqual);


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7.setText("7");
                editInput.setText(btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setText("8");
                editInput.setText(btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setText("9");
                editInput.setText(btn9.getText().toString());
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnDivide.setText("/");
                editInput.setText(btnDivide.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setText("4");
                editInput.setText(btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setText("5");
                editInput.setText(btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText("6");
                editInput.setText(btn6.getText().toString());
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMultiplication.setText("x");
                editInput.setText(btnMultiplication.getText().toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("1");
                editInput.setText(btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("2");
                editInput.setText(btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText("3");
                editInput.setText(btn3.getText().toString());
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMinus.setText("-");
                editInput.setText(btnMinus.getText().toString());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText("0");
                editInput.setText(btn0.getText().toString());
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnDot.setText(".");
                editInput.setText(btnDot.getText().toString());
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPercent.setText("%");
                editInput.setText(btnPercent.getText().toString());
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPlus.setText("+");
                editInput.setText(btnPlus.getText().toString());
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnAC.setText("AC");
                editInput.setText(btnAC.getText().toString());
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnEqual.setText("=");
                editInput.setText(btnEqual.getText().toString());
            }
        });

    }
}

