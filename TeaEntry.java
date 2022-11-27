//Sarah Hoekema
//CS 145
//Interactive Tea Guide

//TeaEntry.java contains the tea name and description for each tea entry
public class TeaEntry {
    //fields
    private String teaName;
    private String teaDescription;

    //constructor
    public TeaEntry(String teaName, String teaDescription){
       this.teaName = teaName;
       this.teaDescription = teaDescription;
    }

    //return a String of the tea name
    public String getTeaName() {
        return teaName;
    }

    //returns a String of the tea description
    public String getTeaDescription(){
        return teaDescription;
    }
}
