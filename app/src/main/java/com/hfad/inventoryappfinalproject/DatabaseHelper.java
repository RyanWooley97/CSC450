package com.hfad.inventoryappfinalproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper{

    public DatabaseHelper(Context context) {
        super(context, DatabaseOptions.DB_NAME, null, DatabaseOptions.DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create and prepopulate tables
        db.execSQL(DatabaseOptions.CREATE_EMPLOYEES_TABLE_);
        db.execSQL(DatabaseOptions.CREATE_CUSTOMER_TABLE_);
        db.execSQL(DatabaseOptions.CREATE_PARTS_TABLE_);
        db.execSQL(DatabaseOptions.CREATE_ORDERS_TABLE_);
        db.execSQL(DatabaseOptions.CREATE_ODETAILS_TABLE_);
        db.execSQL(DatabaseOptions.CREATE_ZIPCODES_TABLE_);

        //Insert Customer info
        db.execSQL(DatabaseOptions.customer_insert1);
        db.execSQL(DatabaseOptions.customer_insert2);
        db.execSQL(DatabaseOptions.customer_insert3);
        db.execSQL(DatabaseOptions.customer_insert4);
        db.execSQL(DatabaseOptions.customer_insert5);
        db.execSQL(DatabaseOptions.customer_insert6);
        db.execSQL(DatabaseOptions.customer_insert7);
        db.execSQL(DatabaseOptions.customer_insert8);
        db.execSQL(DatabaseOptions.customer_insert9);
        db.execSQL(DatabaseOptions.customer_insert10);
        db.execSQL(DatabaseOptions.customer_insert11);

        //Insert Parts info
        db.execSQL(DatabaseOptions.part_insert1);
        db.execSQL(DatabaseOptions.part_insert2);
        db.execSQL(DatabaseOptions.part_insert3);
        db.execSQL(DatabaseOptions.part_insert4);
        db.execSQL(DatabaseOptions.part_insert5);
        db.execSQL(DatabaseOptions.part_insert6);
        db.execSQL(DatabaseOptions.part_insert7);
        db.execSQL(DatabaseOptions.part_insert8);
        db.execSQL(DatabaseOptions.part_insert9);
        db.execSQL(DatabaseOptions.part_insert10);
        db.execSQL(DatabaseOptions.part_insert11);
        db.execSQL(DatabaseOptions.part_insert12);
        db.execSQL(DatabaseOptions.part_insert13);

        //Insert Orders info
        db.execSQL(DatabaseOptions.order_insert1);
        db.execSQL(DatabaseOptions.order_insert2);
        db.execSQL(DatabaseOptions.order_insert3);
        db.execSQL(DatabaseOptions.order_insert4);
        db.execSQL(DatabaseOptions.order_insert5);
        db.execSQL(DatabaseOptions.order_insert6);
        db.execSQL(DatabaseOptions.order_insert7);

        db.execSQL(DatabaseOptions.odet_insert1);
        db.execSQL(DatabaseOptions.odet_insert2);
        db.execSQL(DatabaseOptions.odet_insert3);
        db.execSQL(DatabaseOptions.odet_insert4);
        db.execSQL(DatabaseOptions.odet_insert5);
        db.execSQL(DatabaseOptions.odet_insert6);
        db.execSQL(DatabaseOptions.odet_insert7);

        db.execSQL(DatabaseOptions.zip_insert1);
        db.execSQL(DatabaseOptions.zip_insert2);
        db.execSQL(DatabaseOptions.zip_insert3);
        db.execSQL(DatabaseOptions.zip_insert4);
        db.execSQL(DatabaseOptions.zip_insert5);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        if (oldVersion < newVersion){
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseOptions.EMPLOYEES_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseOptions.CUSTOMERS_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseOptions.PARTS_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseOptions.ORDERS_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseOptions.ODETAILS_TABLE);
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseOptions.ZIPCODES_TABLE);
        }

        // Create tables again
        onCreate(db);
    }

    public Employees queryUser(String username, String password) {

        SQLiteDatabase db = this.getReadableDatabase();
        Employees employees = null;

        Cursor cursor = db.query(DatabaseOptions.EMPLOYEES_TABLE, new String[]{DatabaseOptions.ID,
                        DatabaseOptions.USERNAME, DatabaseOptions.PASSWORD}, DatabaseOptions.USERNAME + "=? and " + DatabaseOptions.PASSWORD + "=?",
                new String[]{username, password}, null, null, null, "1");
        if (cursor != null)
            cursor.moveToFirst();
        if (cursor != null && cursor.getCount() > 0) {
            employees = new Employees(cursor.getString(1), cursor.getString(2));
        }
        // return user
        return employees;
    }

    public Customers queryCustomer(String username, String phone, String zipcode, String email) {

        SQLiteDatabase db = this.getReadableDatabase();
        Customers customers= null;

        Cursor cursor = db.query(DatabaseOptions.CUSTOMERS_TABLE, new String[]{DatabaseOptions.CUSTOMER_ID,
                        DatabaseOptions.CUSTOMER_NAME, DatabaseOptions.CUSTOMER_PHONE, DatabaseOptions.CUSTOMER_ZIP, DatabaseOptions.CUSTOMER_EMAIL},
                DatabaseOptions.CUSTOMER_NAME + "=? and " + DatabaseOptions.CUSTOMER_PHONE + "=? and " + DatabaseOptions.CUSTOMER_ZIP + "=? and " +
                        DatabaseOptions.CUSTOMER_EMAIL + "=?",
                new String[]{username, phone, zipcode, email}, null, null, null, "1");
//        if (cursor != null)
//            cursor.moveToFirst();
        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            customers = new Customers(cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        }
        // return user
        return customers;
    }

    public Parts queryParts(String partId, String partName, String qoh, String partPrice) {

        SQLiteDatabase db = this.getReadableDatabase();
        Parts part = null;

        Cursor cursor = db.query(DatabaseOptions.PARTS_TABLE, new String[]{DatabaseOptions.PART_NUMBER,
                        DatabaseOptions.PART_NAME, DatabaseOptions.PART_QOH}, DatabaseOptions.PART_NUMBER + "=? and "
                        + DatabaseOptions.PART_NAME + "=? and "+ DatabaseOptions.PART_PRICE+"=?",
                new String[]{partId, partName, qoh, partPrice}, null, null, null, "1");
        if (cursor != null)
            cursor.moveToFirst();
        if (cursor != null && cursor.getCount() > 0) {
            part = new Parts(cursor.getString(1), cursor.getString(2),cursor.getString(3), cursor.getString(4));
        }
        // return user
        return part;
    }
    public void addPart(Parts part) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DatabaseOptions.PART_NUMBER, part.getPartNum());
        values.put(DatabaseOptions.PART_NAME, part.getPartName());
        values.put(DatabaseOptions.PART_QOH, part.getQOH());
        values.put(DatabaseOptions.PART_PRICE, part.getPartPrice());

        // Inserting Row
        db.insert(DatabaseOptions.PARTS_TABLE, null, values);
        db.close(); // Closing database connection

    }

    public void addUser(Employees employees) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DatabaseOptions.USERNAME, employees.getUsername());
        values.put(DatabaseOptions.PASSWORD, employees.getPassword());


        // Inserting Row
        db.insert(DatabaseOptions.EMPLOYEES_TABLE, null, values);
        db.close(); // Closing database connection

    }

    public void addCustomer(Customers customers) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DatabaseOptions.CUSTOMER_NAME, customers.getUsername());
        values.put(DatabaseOptions.CUSTOMER_PHONE, customers.getPhoneNum());
        values.put(DatabaseOptions.CUSTOMER_ZIP, customers.getZipcode());
        values.put(DatabaseOptions.CUSTOMER_EMAIL, customers.getEmail());

        // Inserting Row
        db.insert(DatabaseOptions.CUSTOMERS_TABLE, null, values);
        db.close(); // Closing database connection

    }

    public  void getAllUsers(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM customers", null);
        while(c.moveToNext()) {
            Log.d("DatabaseHelper", c.getString(1));
        }
    }

}
