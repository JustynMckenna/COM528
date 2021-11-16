/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sheenanayee
 */
public class transcation {
    private String name;
    private String endate;
    private String cardnumber;
    private String cvv;
    private int issuesnumber;
    
    
    
    
    
    
public String getname(){
    return name;
}
public void setname(String name){
    this.name=name;
    
}
public String endate(){
    return endate;
}

public void setendate(String endate){
    this.endate=endate;
}

public String getcardnumber(){
    return cardnumber;
}

public void setcardnumber(String cardnumber){
    this.cardnumber=cardnumber;
}

public String getcvv(){
    return cvv;
}

public void setcvv(String cvv){
    this.cvv=cvv;
}

public int getissuesnumber(){
    return issuesnumber;
}

public void setissuesnumber(int issusesnumber){
    this.issuesnumber=issuesnumber;
}



}