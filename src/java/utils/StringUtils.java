/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

/**
 *
 * code taken from sample product viewer
 */
public class StringUtils {
    
    public static boolean isStringEmpty(String input){
        if (input == null){
            return true;
        }
        else if (input.length()==0){
            return true;
        }
        else return false;
    }
    
}
