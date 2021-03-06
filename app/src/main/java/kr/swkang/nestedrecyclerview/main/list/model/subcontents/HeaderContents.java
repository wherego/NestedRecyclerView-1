package kr.swkang.nestedrecyclerview.main.list.model.subcontents;

import android.os.Parcel;

import java.util.ArrayList;

import kr.swkang.nestedrecyclerview.main.list.model.Contents;
import kr.swkang.nestedrecyclerview.main.list.model.ContentsType;

/**
 * @author KangSung-Woo
 * @since 2016/07/20
 */
public class HeaderContents
    extends Contents {
  public static final int                     VIEWTYPE_VALUE = 0;
  public static final Creator<HeaderContents> CREATOR        = new Creator<HeaderContents>() {
    @Override
    public HeaderContents createFromParcel(Parcel source) {
      return new HeaderContents(source);
    }

    @Override
    public HeaderContents[] newArray(int size) {
      return new HeaderContents[size];
    }
  };
  private ArrayList<HeaderContentsItem> itemList;

  public HeaderContents() {
    super(ContentsType.HEADER);
    this.itemList = new ArrayList<>();

    itemList.add(new HeaderContentsItem(0, "http://burkdog.cafe24.com/wp/wp-content/uploads/2015/11/IMG_1291.jpg", ""));
    itemList.add(new HeaderContentsItem(1, "http://burkdog.cafe24.com/wp/wp-content/uploads/2015/11/PharPhotoApocalyse.jpg", ""));
    itemList.add(new HeaderContentsItem(2, "http://burkdog.cafe24.com/wp/wp-content/uploads/2015/11/IMG_1299.jpg", ""));
    itemList.add(new HeaderContentsItem(3, "http://burkdog.cafe24.com/wp/wp-content/uploads/2015/11/IMG_1302.jpg", ""));
    itemList.add(new HeaderContentsItem(4, "http://burkdog.cafe24.com/wp/wp-content/uploads/2015/11/IMG_1333.jpg", ""));
    itemList.add(new HeaderContentsItem(5, "http://burkdog.cafe24.com/wp/wp-content/uploads/2015/11/IMG_1340.jpg", ""));
  }

  protected HeaderContents(Parcel in) {
    super(in);
    this.itemList = in.createTypedArrayList(HeaderContentsItem.CREATOR);
  }

  public ArrayList<HeaderContentsItem> getItemList() {
    return itemList;
  }

  public void setItemList(ArrayList<HeaderContentsItem> itemList) {
    this.itemList = itemList;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeTypedList(this.itemList);
  }
}
