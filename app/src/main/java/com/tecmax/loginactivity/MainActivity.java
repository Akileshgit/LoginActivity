package com.tecmax.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText pass;
    private TextView info;
    private Button login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        pass=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.btlog);
        info=(TextView)findViewById(R.id.txt);
        info.setText("No Of Incorrect Attempt= 5" );

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),pass.getText().toString());
            }
        });
    }
    private void validate(String userName,String userPassword){
        if (("kumar" == userPassword))
            if ("akilesh" == userName) {
                Intent intent = new Intent(MainActivity.this, ScndActivity.class);
                startActivity(intent);

            } else {
                counter--;
                info.setText("No Of Incorrect Attempt:" + String.valueOf(counter));

                if (counter == 0) ;
                login.setEnabled(false);
            }

    }
}
