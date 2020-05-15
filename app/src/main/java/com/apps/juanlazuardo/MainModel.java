package com.apps.juanlazuardo;

class MainModel {
    Integer langLogo;
    String langTxt;
    public MainModel(Integer langLogo, String langTxt){
        this.langLogo = langLogo;
        this.langTxt = langTxt;
    }

    public Integer getLangLogo(){
        return langLogo;
    }

    public String getLangTxt() {
        return langTxt;
    }

}
