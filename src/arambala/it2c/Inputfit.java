/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arambala.it2c;
import java.util.Scanner;
/**
 *
 * @author SCC
 */
public class Inputfit {
    
    public void fitness(){
        Showfit show[] = new Showfit[100];
        Scanner in = new Scanner (System.in);
        
        
        
        System.out.print("Enter number of Applications: ");
        int no = in.nextInt();
        
        for(int i = 0; i<no; i++){
            System.out.printf("Enter details of appliaction:  %d\n",i+1);
            
            int id;
            while(true){
            System.out.print("ID: ");
             id = in.nextInt();
             if(!dupid(show, id, i ))break;{
                System.out.println("!ID already existed!");
                
            }
            }
            
            
            System.out.print("Name: ");
            String name = in.next();
            
            
          
            
            System.out.print("Age: ");
            int  age = in.nextInt();
             
             
            
            
           
          
            System.out.print("BMI: ");
            double bmi = in.nextDouble();
            
           
             
          
            show[i] = new Showfit();
            show[i].enterfit(id, name, age, bmi);
            
        }
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID","Name", "Age","BMI","Fitness","Eligibility", "Status");
        
        for (int i = 0; i<no; i++){
            
           show[i].outfit();
            
        }
        
    }
    
    public boolean dupid(Showfit show[], int id, int current){
       for(int i = 0; i<current; i++){
           if(show[i]!= null && show[i].id == id){
               
               return true;
           }
           
           
       } 
        
        return false;
    }
    
}
