package com.hfad.inventoryappfinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity{

    private Button signin;
    private Button signup;

    private EditText editCustomerName;
    private EditText editCustomerPhone;
    private EditText editCustomerZip;
    private EditText editCustomerEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_homepageactivity);

        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);

        editCustomerName = findViewById(R.id.customerName);
        editCustomerEmail = findViewById(R.id.customerEmail);
        editCustomerPhone = findViewById(R.id.customerPhone);
        editCustomerZip = findViewById(R.id.customerZip);

        final DatabaseHelper dbHelper = new DatabaseHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!emptyValidation()) {
                    dbHelper.addCustomer(new Customers(editCustomerName.getText().toString(), editCustomerPhone.getText().toString(), editCustomerZip.getText().toString(), editCustomerEmail.getText().toString()));
                    Toast.makeText(HomePageActivity.this, "Success! Customer has been added.", Toast.LENGTH_SHORT).show();
                    editCustomerName.setText("");
                    editCustomerPhone.setText("");
                    editCustomerZip.setText("");
                    editCustomerEmail.setText("");
                }else{
                    Toast.makeText(HomePageActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!emptyValidation()) {

                    dbHelper.getAllUsers();
                    Customers customers = dbHelper.queryCustomer(editCustomerName.getText().toString(), editCustomerPhone.getText().toString(), editCustomerZip.getText().toString(), editCustomerEmail.getText().toString());

                    if (customers != null) {
                        Bundle mBundle = new Bundle();
                        mBundle.putString("customers", customers.getUsername());
                        Intent intent = new Intent(HomePageActivity.this, customerInfo.class); //can later change this to the homescreen activity
                        intent.putExtras(mBundle);
                        startActivity(intent);

                        Toast.makeText(HomePageActivity.this, "Welcome " + customers.getUsername() + " , you have successfully signed in!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(HomePageActivity.this, "User not found", Toast.LENGTH_SHORT).show();
//
                    }
                }else{
                    Toast.makeText(HomePageActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void onSubmitClick(View view) {
        Intent intent = new Intent(this, customerInfo.class);
        startActivity(intent);
    }

    private boolean emptyValidation() {
        if (TextUtils.isEmpty(editCustomerName.getText().toString()) || TextUtils.isEmpty(editCustomerPhone.getText().toString()) || TextUtils.isEmpty(editCustomerZip.getText().toString()) || TextUtils.isEmpty(editCustomerEmail.getText().toString())) {
            return true;
        } else {
            return false;
        }
    }


        public void onClickLogout (View view){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    //need to write button methods to create new customers and sign in existing customers
    //very similar to login verification in MainActivity class

}
