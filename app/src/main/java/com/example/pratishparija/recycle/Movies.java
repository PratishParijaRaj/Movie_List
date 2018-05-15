package com.example.pratishparija.recycle;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {
    private String Title;
    private String Category;
    private String Descrioption;
    private int Rating;

    public Movies() {
    }

    public Movies(String title, String category, String descrioption, int rating) {
        this.Title = title;
        Category = category;
        Descrioption = descrioption;
        Rating = rating;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescrioption() {
        return Descrioption;
    }

    public int getRating() {
        return Rating;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescrioption(String descrioption) {
        Descrioption = descrioption;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Title);
        dest.writeString(this.Category);
        dest.writeString(this.Descrioption);
        dest.writeInt(this.Rating);
    }

    protected Movies(Parcel in) {
        this.Title = in.readString();
        this.Category = in.readString();
        this.Descrioption = in.readString();
        this.Rating = in.readInt();
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
