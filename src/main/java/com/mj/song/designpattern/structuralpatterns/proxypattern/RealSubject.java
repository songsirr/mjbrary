package com.mj.song.designpattern.structuralpatterns.proxypattern;

public class RealSubject implements Subject {

    @Override
    public String methodThatNoNeedHugeResource() {
        return "real subject";
    }

    @Override
    public String methodThatNeedHugeResource() {
        return "real subject";
    }
}
