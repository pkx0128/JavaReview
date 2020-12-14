package com.pankx.enumeration;

enum Sex2 {
    MIAL,FMAIL
}
public class enumerationDemo2 {
    public static void main(String args[]){
        for(Sex2 s : Sex2.values()){
            System.out.println(s.ordinal()+ "===" +s.toString());
        }
    }

}
