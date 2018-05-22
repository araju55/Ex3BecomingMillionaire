/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 17011947
 */
public class Ex3BecomingMillionaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double initialValue = 10000;
        int years = 0;
        while (initialValue <1000000){
        initialValue = initialValue * 1.05;
        years = (years + 1);
      }
        System.out.println(years);  
    }
    

