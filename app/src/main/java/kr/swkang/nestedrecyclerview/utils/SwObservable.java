package kr.swkang.nestedrecyclerview.utils;

import android.support.annotation.NonNull;

import kr.swkang.nestedrecyclerview.utils.mvp.BasePresenter;
import rx.Observable;
import rx.Subscriber;

/**
 * @author KangSung-Woo
 * @since 2016/08/02
 */
public class SwObservable<T> {
  private BasePresenter presenter;
  private Observable    observable;

  public SwObservable(@NonNull BasePresenter p, @NonNull Observable o) {
    this.presenter = p;
    this.observable = o;
  }

  public final void subscribe(@NonNull Subscriber<? super T> subscriber) {
    if (presenter == null) {
      throw new NullPointerException("BasePresenter object is null.");
    }
    presenter.addSubscriber(subscriber);

    if (observable == null) {
      throw new NullPointerException("Observable object is null.");
    }
    observable.subscribe(subscriber);
  }

}
