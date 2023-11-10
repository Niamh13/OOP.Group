/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xpath.belowwaterapp;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *  BelowWaterUI
 *  @author niamh
 *  26/10/23
 */
public class BelowWaterUI {
    private ArrayList <Fish> fishes;
    private ArrayList <Company> companies;
    
    public BelowWaterUI(){
        fishes = new ArrayList<>();
        companies = new ArrayList<>();
    }
    
    public void menu(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select option: \n 1. Add Totals \n 2. Add a Fish \n 3. Add to Company \n 4.  Print"));
        
        switch(ans) {
            case 1: 
                addT();
                break;
            case 2: 
                addF();
                break;
            case 3:
                addC();
                break;
            case 4:
                print();
                break;
        }
        
        private void addT(){
            Fish f = new Fish();
            
            f.setTotalFish(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Total Number of Fish Caught: ")));
            
            fishes.add(f);
        }
        
        private void addF(){
            int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to enter 1.Mackerel \n 2.Whiting \n 3.Pollack \n 4.Codling"));
            
            switch (type) {
                case 1 -> {
                    int totalFish = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Total Number of Fish Caught: "));
                    int caught = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Caught: "));
                    int sold = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Sold: "));
                    Mackerel m = new Mackerel(caught, sold, totalFish);
                    
                    fishes.add(m);
                }
                case 2 -> {
                    int totalFish = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Total Number of Fish Caught: "));
                    int caught = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Caught: "));
                    int sold = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Sold: "));
                    Whiting w = new Whiting(caught, sold, totalFish);
                    
                    fishes.add(w);
                }
                case 3 -> {
                    int totalFish = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Total Number of Fish Caught: "));
                    int caught = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Caught: "));
                    int sold = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Sold: "));
                    Pollack p = new Pollack(caught, sold, totalFish);
                    
                    fishes.add(p);
                }
                case 4 -> {
                    int totalFish = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Total Number of Fish Caught: "));
                    int caught = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Caught: "));
                    int sold = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Fish Sold: "));
                    Codling c = new Codling(caught, sold, totalFish);
                    
                    fishes.add(c);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Invaild option entered");
                }
            }
        }
        
        private void addC(){
            
        }
        
        private void print(){
            for(int i = 0; i < fishes.size(); i++){
                Fish s = fishes.get(i);
                if(s instanceof Mackerel){
                    JOptionPane.showMessageDialog(null, "Percentage of Fish caught are Mackerel is " + e.getPerType() + "\n Percentage of Wasted is " + e.getPerWaste());
                }
            }
        }
    }
}
