package com.example.databindingbasic1;

public class Model {
    String text;

    public Model(String text){
        this.text= text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
