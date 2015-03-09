/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Nicolas
 */
public class Javaeight {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        // Old looping
        for (String player : players) {
             System.out.print(player + "; ");
        }

        // Using lambda expression and functional operations
	players.forEach((player) -> System.out.print(player + "; "));

        // Using double colon operator in Java 8
        players.forEach(System.out::println);
        
        // Sorting with lambda
        Arrays.sort(atp, (String a, String b) -> a.compareTo(b));
        
	//Use predicate with { }
        Predicate<Integer> p = (b) -> {
          return  b > 3;
        };        
        
	//Use predicate inlinde with lambda
        Predicate<Integer> p2 = (a) -> a > 5;
        
        System.out.println(p.test(4));
        System.out.println(p2.test(4));
        
        Runnable runner;
        runner = () -> System.out.println("test");
        runner.run();
    }
    
    
}
