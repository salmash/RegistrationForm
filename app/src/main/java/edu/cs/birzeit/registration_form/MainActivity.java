package edu.cs.birzeit.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtName ;
    private EditText edtEmail ;
    private EditText edtPassword ;
    private EditText edtPhone ;
    Spinner spinner;
    Switch simpleSwitch ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtPhone = findViewById(R.id.edtPhone);

        spinner = findViewById(R.id.spinner);
        populateSpinner() ;

        simpleSwitch =findViewById(R.id.btnSwitch);



    }

    private void populateSpinner() {
        ArrayList<String> spinnerData = new ArrayList <>();
        spinnerData.add("Male");
        spinnerData.add("Female");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,spinnerData);

        spinner.setAdapter(adapter);
    }

    public void btnSave_OnClick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        String name = edtName.getText().toString() ;
        String email = edtEmail.getText().toString() ;
        String password = edtPassword.getText().toString() ;
        String phone = edtPhone.getText().toString() ;

        String gender = spinner.getSelectedItem().toString();
        String isStudent = "";

        if(simpleSwitch.isChecked())
            isStudent="I'm a Student";
        else
            isStudent="I'm NOT a Student";


        String data = "Name : " + name + "\n" +
                      "Email : " + email + "\n" +
                      "Password : " + password + "\n" +
                      "Phone : " + phone + "\n" +
                      "Gender : " + gender + "\n" +
                      "Student : " + isStudent + "\n";

        intent.putExtra("DATA",data);
        startActivity(intent);




    }
}