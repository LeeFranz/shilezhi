package leo.aidltest.domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/10/13.
 */

public class Book implements Parcelable {
    private int price;
    private String name;

    protected Book(Parcel in) {
        price = in.readInt();
        name = in.readString();
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public Book() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(price);
        dest.writeString(name);
    }

    /**
     * 参数是一个Parcel,用它来存储与传输数据
     *
     * @param dest
     */
    public void readFromParcel(Parcel dest) {
        //注意，此处的读值顺序应当是和writeToParcel()方法中一致的
        price = dest.readInt();
        name = dest.readString();
    }
}
