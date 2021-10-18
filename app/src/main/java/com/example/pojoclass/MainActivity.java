package com.example.pojoclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,username,password;
    Button submit,getdata;
    TextView show;

    PojoClass pojoClass = new PojoClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText) findViewById(R.id.edit_name);
        username=(EditText) findViewById(R.id.edit_username);
        password=(EditText) findViewById(R.id.edit_password);
        submit=(Button) findViewById(R.id.btn_submit);
        getdata=(Button) findViewById(R.id.btn_getdata);
        show=(TextView) findViewById(R.id.display);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pojoClass.setName(name.getText().toString());
                pojoClass.setUsername(username.getText().toString());
                pojoClass.setPassword(password.getText().toString());

                Toast.makeText(getApplicationContext(), "Set the Data in PojoClass", Toast.LENGTH_SHORT).show();

            }
        });

        getdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name= pojoClass.getName();
                String UserName = pojoClass.getUsername();
                String Password= pojoClass.getPassword();

                show.setText("name: "+Name+" username:"+UserName+" password:"+Password+" ");

            }
        });
    }
}