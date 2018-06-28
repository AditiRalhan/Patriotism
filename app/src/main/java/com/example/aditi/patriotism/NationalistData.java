package com.example.aditi.patriotism;

/**
 * Created by ADITI on 6/28/2018.
 */

public class NationalistData
{
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


}
