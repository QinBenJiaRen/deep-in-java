package com.haiyang.www.GoF.ObserverPattern;

import java.util.Observable;

public interface IObserver {

    void update(Observable observable, Object o);
}
