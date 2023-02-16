/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadania;

/**
 *
 * @author acer
 */
class NumberUtil {
     private NumberUtil() {
    }
    
    public static boolean isInt(String text){
        try{
            Integer.parseInt(text);
            return true;
        }catch(NumberFormatException exception){
            return false;
        }
    }
}
