/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xpath.belowwaterapp;

/**
 *  Fish
 *  @author niamh
 *  26/10/23
 */
public class Fish {
    int totalFish;
    private int population;

    public Fish() {
        totalFish = 0;
        population = 0;
    }

    public Fish(int totalFish) {
        this.totalFish = totalFish;
    }

    public int getTotalFish() {
        return totalFish;
    }

    public void setTotalFish(int totalFish) {
        this.totalFish = totalFish;
    }
    
    

    public int getPopulation() {
        return population;
    }
    
    public void compute(){
        if(population==0){
            population = 38870050;
        }
        else{
            population = population;
        }
        population = population - totalFish;
    }
    
    
    
}
