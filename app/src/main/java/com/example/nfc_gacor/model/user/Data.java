
package com.example.nfc_gacor.model.user;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable, Parcelable
{

    @SerializedName("user1")
    @Expose
    private List<User1> user1 = null;
    public final static Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3681384601308285646L;

    protected Data(Parcel in) {
        in.readList(this.user1, (com.example.nfc_gacor.model.user.Data.class.getClassLoader()));
    }

    public Data() {
    }

    public List<User1> getUser1() {
        return user1;
    }

    public void setUser1(List<User1> user1) {
        this.user1 = user1;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(user1);
    }

    public int describeContents() {
        return  0;
    }

}
