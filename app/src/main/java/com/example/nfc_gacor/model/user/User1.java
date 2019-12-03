
package com.example.nfc_gacor.model.user;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User1 implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("saldo")
    @Expose
    private String saldo;
    public final static Creator<User1> CREATOR = new Creator<User1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public User1 createFromParcel(Parcel in) {
            return new User1(in);
        }

        public User1 [] newArray(int size) {
            return (new User1[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6608724781677226951L;

    protected User1(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.saldo = ((String) in.readValue((String.class.getClassLoader())));
    }

    public User1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(saldo);
    }

    public int describeContents() {
        return  0;
    }

}
