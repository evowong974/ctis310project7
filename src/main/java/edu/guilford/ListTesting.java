package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

    public class ListTesting {

        public static void main(String[] args) {

            // This is the constant number for the number of cars that are going to be generated
            final int NUM_CARS = 10000;
    
            // Make an arraylist of cars
            ArrayList<Cars> carsArray = new ArrayList<Cars>();
    
            // Get the time on how long it takes to add cars to the arraylist by milliseconds
            long startTime = System.nanoTime();
            for (int i = 0; i < NUM_CARS; i++) {
                carsArray.add(new Cars());
            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / (1000000);
            System.out.println("Time to add " + NUM_CARS + " cars to the arraylist: " + duration + " milliseconds");
    
            // Get the time on how long it takes to sort the arraylist by brand by milliseconds
            startTime = System.nanoTime();
            Collections.sort(carsArray);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to sort the arraylist by make: " + duration + " milliseconds");
    
            // Get the time on how long it takes to shuffle the arraylist by milliseconds
            startTime = System.nanoTime();
            Collections.shuffle(carsArray);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to shuffle the arraylist: " + duration + " milliseconds");
    
            // Get the time on how long it takes to get a random car from the arraylist 1,000,000 times
            // by milliseconds
            startTime = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                carsArray.get((int) (Math.random() * NUM_CARS));
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out
                    .println("Time to get a random car from the arraylist 1,000,000 times: " + duration + " milliseconds");
    
            // Ge the time on how long it takes to get each element sequentially from the arraylist
            // by milliseconds
            startTime = System.nanoTime();
            for (int i = 0; i < NUM_CARS; i++) {
                carsArray.get(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to get each element sequentially from the arraylist: " + duration + " milliseconds");
    
            // Create a linkedlist of cars
            LinkedList<Cars> carsLinked = new LinkedList<Cars>();
    
            // Get the time on how long it takes to add cars to the linkedlist by milliseconds
            startTime = System.nanoTime();
            for (int i = 0; i < NUM_CARS; i++) {
                carsLinked.add(new Cars());
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to add " + NUM_CARS + " cars to the linkedlist: " + duration + " milliseconds");
    
            // Get the time on how long it takes to sort the linkedlist by brand in milliseconds
            startTime = System.nanoTime();
            Collections.sort(carsLinked);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to sort the linkedlist by make: " + duration + " milliseconds");
    
            // Get the time on how long it takes to shuffle the linkedlist by milliseconds
            startTime = System.nanoTime();
            Collections.shuffle(carsLinked);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to shuffle the linkedlist: " + duration + " milliseconds");
    
            // Get the time on how long it takes to get a random car from the linkedlist 1,000,000
            // times by milliseconds
            startTime = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                carsLinked.get((int) (Math.random() * NUM_CARS));
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out
                    .println("Time to get a random car from the linkedlist 1,000,000 times: " + duration + " milliseconds");
    
            // Get the time on how long it takes to get each element sequentially from the linkedlist
            // by milliseconds
            startTime = System.nanoTime();
            for (int i = 0; i < NUM_CARS; i++) {
                carsLinked.get(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / (1000000);
            System.out.println("Time to get each element sequentially from the linkedlist: " + duration + " milliseconds");
    
        }
    }
    