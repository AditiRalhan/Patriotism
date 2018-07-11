package com.example.admin.patriots;

public class NationalistData {
    String NationalistName;
    String LinkToPhoto;
    int BirthYear,DeathYear;
    String LinkToData;
    //Default Constructor
    NationalistData()
    {

    }
    //Parameterised Constructor
    NationalistData(String NationalistName,String LinkToPhoto,int BirthYear,int DeathYear,String LinkToData)
    {
        this.NationalistName=NationalistName;
        this.LinkToPhoto=LinkToPhoto;
        this.BirthYear=BirthYear;
        this.DeathYear=DeathYear;
        this.LinkToData=LinkToData;
    }

    NationalistData(String name,String linkToPhoto,String linkToData)
    {
        this.NationalistName=name;
        this.LinkToPhoto=linkToPhoto;
        this.LinkToData=linkToData;
    }


}