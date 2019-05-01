package com.hfad.inventoryappfinalproject;

public class DatabaseOptions {

    //NAME OF THE DATABASE
    public static final String DB_NAME = "local.db";
    public static final int DB_VERSION = 16;


    //EMPLOYEES TABLE CREATION
    public static final String EMPLOYEES_TABLE = "employees";

    public static final String ID = "id";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    public static final String CREATE_EMPLOYEES_TABLE_ =
            "CREATE TABLE  " + EMPLOYEES_TABLE + "(" +
                    ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    USERNAME + " TEXT NOT NULL," +
                    PASSWORD + " TEXT NOT NULL);";



    //CUSTOMER TABLE CREATION
    public static final String CUSTOMERS_TABLE = "customers";

    public static final String CUSTOMER_ID = "id";
    public static final String CUSTOMER_NAME = "name";
    public static final String CUSTOMER_PHONE = "phonenum";
    public static final String CUSTOMER_ZIP = "zipcode";
    public static final String CUSTOMER_EMAIL = "email";

    public static final String CREATE_CUSTOMER_TABLE_ =
            "CREATE TABLE  " + CUSTOMERS_TABLE + "(" +
                    CUSTOMER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    CUSTOMER_NAME + " TEXT NOT NULL," +
                    CUSTOMER_PHONE + " TEXT NOT NULL, " +
                    CUSTOMER_ZIP + " TEXT NOT NULL," +
                    CUSTOMER_EMAIL + " TEXT NOT NULL);";

    //CUSTOMER INSERTS
    public static final String customer_insert1 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Ryan Wooley','3368482998','27263','rcw1468@uncw.edu')" ;
    public static final String customer_insert2 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Brantlee Mercer','1111111','28403','bmercer@uncw.edu')" ;
    public static final String customer_insert3 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Narayan','1234567','28403','snarayan@uncw.edu')" ;
    public static final String customer_insert4 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Alex Lee','4751522554','32808','alee@gmail.com')" ;
    public static final String customer_insert5 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Yasin','8878788978','33187','yasin@yahoo.com')" ;
    public static final String customer_insert6 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Kira Martin','5793369965','32808','kmartin@uncw.edu')" ;
    public static final String customer_insert7 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Bob Ross','5228090202','33629','bobross@happytrees.com')" ;
    public static final String customer_insert8 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Albert Wilson','2910124545','33187','awilson@nfl.com')" ;
    public static final String customer_insert9 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Travis Scott','1012459999','33629','hunchojack@gmail.com')" ;
    public static final String customer_insert10 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Harry Potter','0001112222','20941','harrypotter@hogwarts.edu')" ;
    public static final String customer_insert11 =
            "INSERT or replace INTO " + CUSTOMERS_TABLE+ "(name, phonenum, zipcode, email) VALUES('Owen Wilson','9991234567','28403','yeahhman@gmail.com')" ;




    //CREATING PARTS TABLE
    public static final String PARTS_TABLE = "parts";

    public static final String PART_NUMBER = "parts_number";
    public static final String PART_NAME = "parts_name";
    public static final String PART_QOH = "parts_quantity";
    public static final String PART_PRICE = "parts_price";


    public static final String CREATE_PARTS_TABLE_ =
            "CREATE TABLE  " + PARTS_TABLE + "(" +
                    PART_NUMBER + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    PART_NAME + " TEXT NOT NULL," +
                    PART_QOH + " TEXT NOT NULL," +
                    PART_PRICE+ " TEXT NOT NULL);";

    //PARTS INSERTS
    public static final String part_insert1 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Nail Sm', '1000', '0.5')" ;
    public static final String part_insert2 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Wrench', '7', '10.99')" ;
    public static final String part_insert3 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Screw 25mm', '25', '0.75')" ;
    public static final String part_insert4 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Hydro. Lift', '5', '5000.75')" ;
    public static final String part_insert5 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Screwdriver', '12', '5.99')" ;
    public static final String part_insert6 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Welding Torch', '13', '350.99')" ;
    public static final String part_insert7 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Flashlight', '9', '15.99')" ;
    public static final String part_insert8 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Nail Lg', '1100', '0.75')" ;
    public static final String part_insert9 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Motor 305', '5', '2500.5')" ;
    public static final String part_insert10 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Motor 450', '2', '3500.5')" ;
    public static final String part_insert11 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Copper Rod', '137', '0.5')" ;
    public static final String part_insert12 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Headlight', '70', '12.99')" ;
    public static final String part_insert13 =
            "INSERT or replace INTO " + PARTS_TABLE+ "(parts_name, parts_quantity, parts_price) VALUES('Nit. Oxide', '10', '150.99')" ;


    //ORDERS TABLE CREATION
    public static final String ORDERS_TABLE = "orders";

    public static final String ORDER_NUM = "order_no";
    public static final String PART_NUM = "part_no";
    public static final String EMPLOYEE_ID= "e_id";
    public static final String CUSTOMER_NUM = "customer_no";

    public static final String CREATE_ORDERS_TABLE_ =
            "CREATE TABLE  " + ORDERS_TABLE + "(" +
                    ORDER_NUM + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    PART_NUM + " TEXT NOT NULL," +
                    EMPLOYEE_ID + " TEXT NOT NULL," +
                    CUSTOMER_NUM + " TEXT NOT NULL);";

    //ORDERS INSERTS
    public static final String order_insert1 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('1', '1', '1', '2')" ;
    public static final String order_insert2 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('2', '4', '1', '7')" ;
    public static final String order_insert3 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('3', '12', '2', '11')" ;
    public static final String order_insert4 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('4', '5', '3', '9')" ;
    public static final String order_insert5 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('5', '7', '3', '1')" ;
    public static final String order_insert6 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('6', '10', '2', '4')" ;
    public static final String order_insert7 =
            "INSERT or replace INTO " + ORDERS_TABLE+ "(order_no, part_no, e_id, customer_no) VALUES('7', '8', '1', '6')" ;




    //CREATING ODETAILS TABLE
    public static final String ODETAILS_TABLE = "odetails";

    public static final String odetNum = "ono";
    public static final String odetPart = "pno";
    public static final String odetqty = "qty";
    public static final String dateordered = "date_ordered";


    public static final String CREATE_ODETAILS_TABLE_ =
            "CREATE TABLE  " + ODETAILS_TABLE + "(" +
                    odetNum + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    odetPart + " TEXT NOT NULL," +
                    odetqty + " TEXT NOT NULL," +
                    dateordered+ " TEXT NOT NULL);";


    //ODETAILS INSERTS
    public static final String odet_insert1 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('1', '1', '240', '2018-01-01')" ;
    public static final String odet_insert2 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('2', '4', '1', '2017-05-12')" ;
    public static final String odet_insert3 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('3', '12', '125', '2018-02-19')" ;
    public static final String odet_insert4 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('4', '5', '6', '2018-09-08')" ;
    public static final String odet_insert5 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('5', '7', '4', '2018-01-16')" ;
    public static final String odet_insert6 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('6', '10', '24', '2018-07-15')" ;
    public static final String odet_insert7 =
            "INSERT or replace INTO " + ODETAILS_TABLE+ "(ono, pno, qty, date_ordered) VALUES('7', '8', '100', '2018-11-04')" ;


    //CREATING ZIPCODES TABLE
    public static final String ZIPCODES_TABLE = "zipcodes";

    public static final String ZIP = "zip";
    public static final String CITY = "city";
    public static final String STATE = "state";


    public static final String CREATE_ZIPCODES_TABLE_ =
            "CREATE TABLE  " + ZIPCODES_TABLE + "(" +
                    ZIP + " INTEGER PRIMARY KEY, " +
                    CITY + " TEXT NOT NULL," +
                    STATE+ " TEXT NOT NULL);";

    public static final String zip_insert1 =
            "INSERT or replace INTO " + ZIPCODES_TABLE+ "(zip, city, state) VALUES('28403', 'Wilmington', 'North Carolina')" ;
    public static final String zip_insert2 =
            "INSERT or replace INTO " + ZIPCODES_TABLE+ "(zip, city, state) VALUES('32808', 'Orlando', 'Florida')" ;
    public static final String zip_insert3 =
            "INSERT or replace INTO " + ZIPCODES_TABLE+ "(zip, city, state) VALUES('33187', 'Miami', 'Florida')" ;
    public static final String zip_insert4 =
            "INSERT or replace INTO " + ZIPCODES_TABLE+ "(zip, city, state) VALUES('33629', 'Tampa Bay', 'Florida')" ;
    public static final String zip_insert5 =
            "INSERT or replace INTO " + ZIPCODES_TABLE+ "(zip, city, state) VALUES('27263', 'High Point', 'North Carolina')" ;


}


