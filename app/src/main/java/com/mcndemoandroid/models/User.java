package com.mcndemoandroid.models;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//import android.widget.EditText;
//
//public class User implements Parcelable {
//    private String firstName;
//    private String lastName;
//    private String email_id;
//    private String number;
//
//    public User(String firstName, String lastName, String email_id, String number) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email_id = email_id;
//        this.number = number;
//    }
//
//    public User(Parcel in) {
//        firstName = in.readString();
//        lastName = in.readString();
//        email_id=in.readString();
//        number=in.readString();
//    }
//
//    public static final Creator<User> CREATOR = new Creator<User>() {
//        @Override
//        public User createFromParcel(Parcel in) {
//            return new User(in);
//        }
//
//        @Override
//        public User[] newArray(int size) {
//            return new User[size];
//        }
//    };
//
//    public User(String s, String ashish, String tiwari) {
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public String getEmail_id(){
//        return email_id;
//    }
//    public void setEmail_id(String email_id){
//        this.email_id=email_id;
//    }
//    public String getNumber(){
//        return number;
//    }
//    public void setNumber(String number){
//        this.number=number;
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(firstName);
//        dest.writeString(lastName);
//        dest.writeString(email_id);
//        dest.writeString(number);
//
//    }
//}
