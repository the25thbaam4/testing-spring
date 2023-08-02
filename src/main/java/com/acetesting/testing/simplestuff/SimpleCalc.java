package com.acetesting.testing.simplestuff;

public class SimpleCalc {

    private int x,y;

    public SimpleCalc(){

    }
    public int add(int x, int y){
        return x + y;
    }

    public int sub(int x, int y){
        return x - y;
    }

    public Object checkNull(Object obj){
        if (obj != null){
            return obj;
        }
        return null;
    }


}
