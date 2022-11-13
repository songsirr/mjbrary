package com.mj.song.designpattern.structuralpatterns.proxypattern;

public class ProxySubject implements Subject {

    private RealSubject realSubject;

    @Override
    public String methodThatNoNeedHugeResource() {
        if (realSubject != null){
            realSubject.methodThatNoNeedHugeResource();
        }
        return "proxy subject";
    }

    @Override
    public String methodThatNeedHugeResource() {
        realSubject = new RealSubject();
        return realSubject.methodThatNeedHugeResource();
    }
}
