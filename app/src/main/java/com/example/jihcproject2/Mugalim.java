package com.example.jihcproject2;

public class Mugalim {
    int photo;
    String title;
    String sabaq;
    String klas;

    public Mugalim( int photo,String title, String sabaq, String klas){
        this.photo=photo;
        this.title=title;
        this.sabaq=sabaq;
        this.klas=klas;

    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getSabaq() {
        return sabaq;
    }

    public String getKlas() {
        return klas;
    }
}
