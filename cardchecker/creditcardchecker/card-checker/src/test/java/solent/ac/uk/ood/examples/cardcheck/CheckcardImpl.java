/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solent.ac.uk.ood.examples.cardcheck;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author sheenanayee
 */
public class Checkcard {
    
    public static Logger logger = LogManger.getLogger(Checkcard.class);
    
    public static CardvalidationResult chekValdity(final String Input){
        if(cardInput==null){
            logger(checkcard.class+":not enterend");
            return new CardvalidationResults(false,"card can not be null");
        }
    }
    
    <// this will show the remove and the non numbers from the code>
    
    String cardNumber = cardInput.Replace("//,""");
    
    if (cardInput.length()<12|| cardInput length()>18){
        logger.warn(Checkcard.class+": the card lengthfor"+ Checkcard);
        return new CardValidatorResults(false"card length of the range");
    }
    
    if(!CheckcardLuhn(cardnumber));{
        logger.warn(cc == CardCompany.Unknow){
        logger.warn(Checkcard.class+"cc , yes"+ cardnumber+",c"+cc);
        return CardValidation;
    }
        
      
        
        
        
        
    }
    
    

    
    
      

    
    
    
}
