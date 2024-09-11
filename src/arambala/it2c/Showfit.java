/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arambala.it2c;

/**
 *
 * @author SCC
 */
public class Showfit {
    String name, goal;
    int id, age;
    double bmi;
    public void enterfit(int id, String name, int age, double bmi){
        this.name = name;
        this.id = id;
        this.age = age;
        this.bmi = bmi;
    
        
    }
    
    public void outfit(){
        
        String goal;
        if(this.bmi>=18.5 && this.bmi<=26.9){
            
             goal = "Weight Loss";
        }
        else if(this.bmi>=27.0 && this.bmi<= 30.0){
             goal = "Muscle Gain";
        }
        
        else {
             goal = "General Fitness";
        }
        
        String status = (this.age>= 18 && this.age<=65)? "": "Age to high";
       
        
        
        
        System.out.printf("%-10d %-10s %-10d %-10.2f %-10s %-10s\n", this.id, this.name, this.age, this.bmi, goal, status);
        
    }
    
}
