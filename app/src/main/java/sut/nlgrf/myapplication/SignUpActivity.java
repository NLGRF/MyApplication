package sut.nlgrf.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private EditText nameEditText, addressEditText, phoneEditText, userEditText, passwordEditText;
    private String nameString, addressString, phoneString, userString, passwordString, genderString,
            imageString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        addressEditText = (EditText) findViewById(R.id.editText2);
        phoneEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);


    }   //Main Method

}   //Main Class
