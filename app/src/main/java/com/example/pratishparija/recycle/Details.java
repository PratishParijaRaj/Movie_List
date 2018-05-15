package com.example.pratishparija.recycle;

public class Details {
    public static final String TABLE_NAME = "user";

    public static final String USER_ID = "id";
    public static final String USER_PASSWORD = "password";
    public static final String USER_Email = "email";
    private int id;
    private String password;
    private String email;
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + USER_PASSWORD + " TEXT,"
                    + USER_Email + " TEXT"
                    + ")";

    public Details(){

    }
    public Details(int id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String note) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String timestamp) {
        this.email = email;
    }

}
