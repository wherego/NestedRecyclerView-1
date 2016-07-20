package kr.swkang.nestedrecyclerview.main.list.data;

import kr.swkang.nestedrecyclerview.main.list.data.subcontents.BodyContents;
import kr.swkang.nestedrecyclerview.main.list.data.subcontents.HeaderContents;

/**
 * @author KangSung-Woo
 * @since 2016/07/20
 */
public enum ContentsType {
  HEADER(HeaderContents.VIEWTYPE_VALUE),
  BODY(BodyContents.VIEWTYPE_VALUE);

  private int v;

  ContentsType(int v) {
    this.v = v;
  }

  public int getValue() {
    return v;
  }

  public static ContentsType parseFromValue(int v) {
    switch (v) {
      case HeaderContents.VIEWTYPE_VALUE:
        return HEADER;
      default:
        return BODY;
    }
  }

}