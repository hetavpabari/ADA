package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView num1;
    private TextView num2;
    private  TextView res;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private int n1,n2;
    private float n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        res=(TextView)findViewById(R.id.ans);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        div=(Button)findViewById(R.id.div);
        mul=(Button)findViewById(R.id.mul);
        equal=(Button)findViewById(R.id.equal);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1+n2;
                res.setText((int) n3+" " );
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1-n2;
                res.setText((int) n3+" " );
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1*n2;
                res.setText((int) n3+" ");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1/n2;
                res.setText((int) n3+" ");
            }
        });
    }
}
