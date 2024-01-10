/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;


public class Name {
    private String fName;
    private String mName;
    private String lName;
    private String title;
    private String suffix;
    
    public Name(){
    }
    public Name(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public Name(String fName, String mName, String lName, String title, String suffix){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.title = title;
        this.suffix = suffix;
    }  

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public void displayName(){
        System.out.println("First name: " + getfName()+ "\nMiddle name: " + getmName()+ "\nLast Name: " + getlName() + "\nSuffix: " + getSuffix() + "\nTitle: "+ getTitle());
    }
    
     public String toString(){
        return getTitle() + " " + getfName()+  " " + getmName()+ " " + getlName()+ " " +getSuffix();
    }
}
