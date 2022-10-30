package com.example.recyclerview1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {
    public String name;
    public String price;
    public int logo;

    public Book(String name, String price, int logo) {
        this.name = name;
        this.price = price;
        this.logo = logo;
    }

    protected Book(Parcel in) {
        name = in.readString();
        price = in.readString();
        logo = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(price);
        parcel.writeInt(logo);
    }
}
