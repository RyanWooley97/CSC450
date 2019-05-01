package com.hfad.inventoryappfinalproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class customerInfo extends AppCompatActivity {

    private ListView listView;
    private SQLiteOpenHelper openHelper;
    public SQLiteDatabase db;
    public ArrayList<String> listItem;
    public ArrayAdapter<String> adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerinfo);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView = (ListView) findViewById(R.id.firstLineup);
        listView.setAdapter(adapter);
        listItem = new ArrayList<>();

        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();
    }

    final DatabaseHelper dbhelper = new DatabaseHelper(this);

    public void onTestClickEmployees(View view){
        SQLiteDatabase db = dbhelper.getReadableDatabase();

    }

    public void moveToCustomer(View view){
        Intent intent = new Intent(customerInfo.this, HomePageActivity.class); //can later change this to the homescreen activity
        //intent.putExtras(mBundle);
        startActivity(intent);
    }

    public void moveToCart(View view) {
        Intent intent = new Intent(customerInfo.this, CartActivity.class); //can later change this to the homescreen activity
        //intent.putExtras(mBundle);
        startActivity(intent);
    }


    public void onClickLogout (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void showEmployees(View view){
        adapter.clear();
        int i;
        String query = "SELECT * FROM EMPLOYEES";

        Cursor cursor = db.rawQuery(query, null);

        String array[] = new String[cursor.getCount()];
        i = 0;

        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            array[i] = cursor.getString(1)+"\n "+ cursor.getString(2);
            i++;
            cursor.moveToNext();
        }

        adapter.addAll(array);
    }

    public void showCustomers(View view){
        adapter.clear();
        int i;
        String query = "SELECT * FROM CUSTOMERS";

        Cursor cursor = db.rawQuery(query, null);

        String array[] = new String[cursor.getCount()];
        i = 0;

        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            array[i] = cursor.getString(1)+"\n "+ cursor.getString(2);
            i++;
            cursor.moveToNext();
        }

        adapter.addAll(array);
    }

    public void showOrders(View view){
        adapter.clear();
        int i;
        String query = "SELECT * FROM ORDERS";

        Cursor cursor = db.rawQuery(query, null);

        String array[] = new String[cursor.getCount()];
        i = 0;

        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            array[i] = "Order number: "+ cursor.getString(0)+"\n Part Number: "+ cursor.getString(1)+" \nDate Arrived: "+ cursor.getString(2);
            i++;
            cursor.moveToNext();
        }

        adapter.addAll(array);
    }

    public void showOrderDetails(View view){
        adapter.clear();
        int i;
        String query = "SELECT * FROM ODETAILS";

        Cursor cursor = db.rawQuery(query, null);

        String array[] = new String[cursor.getCount()];
        i = 0;

        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            array[i] = "Order number: "+ cursor.getString(0)+"\n Part Number: "+ cursor.getString(1)+" \nQTY: "+ cursor.getString(2)+ " \nDate Ordered: "+ cursor.getString(3);
            i++;
            cursor.moveToNext();
        }

        adapter.addAll(array);
    }


    public void showParts(View view){
        adapter.clear();
        int i;
        String query = "SELECT * FROM PARTS";

        Cursor cursor = db.rawQuery(query, null);

        String array[] = new String[cursor.getCount()];

        i = 0;

        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            array[i] = "Part number: "+ cursor.getString(0)+"\n Name: "+ cursor.getString(1)+"\n QOH: "+ cursor.getString(2)+" \nPrice: "+ cursor.getString(3);
            i++;
            cursor.moveToNext();
        }

        adapter.addAll(array);
    }

}
