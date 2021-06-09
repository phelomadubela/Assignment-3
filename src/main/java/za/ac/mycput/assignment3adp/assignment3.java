package za.ac.mycput.assignment3adp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Phelo
 */
//public class assignment3 extends CreateStakeholderSer {
    
//}
//2a) 
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class assignment3{
    public static void main(String[] args) throws FileNotFoundException {
       
       List<Customer> customers = new ArrayList<Customer>(); 
       List<Supplier> suppliers = new ArrayList<Supplier>(); 
       
       try {
           
           FileInputStream file = new FileInputStream("stakeholder.ser");
           ObjectInputStream reader = new ObjectInputStream(file);
           while (true) {
               try{
                   
                   Object obj = (Object) reader.readObject();
                   
                   if (obj instanceof Customer)
                   {
                       customers.add((Customer) obj);
                   }
                   else{
                       suppliers.add((Supplier) obj);
                   }
               } catch(Exception ex) {
                   System.err.println("**end of reader file**");
                   System.out.println("==================== CUSTOMERS ==========================");
                   break;
               }
           }
       } catch (Exception ex) {
           System.err.println("failed to read " + "stakeholder.ser" + ", " +ex);
           
       } finally {
           System.out.println();
       }
       
       for(int i = 0; i< customers.size(); i++) {
           System.out.println(customers.get(i).toString());
       }
       
       System.out.println();
       System.out.println("number of customers who can rent");
       System.out.println("number of customers who cannot rent");
       System.out.println("============================== SUPPLIERS ================================");
      
       for(int i = 0; i< suppliers.size(); i++){
       System.out.println(suppliers.get(i).toString());
       }
       
       System.out.println();
    }
    //B sort the list
    for (int i=0; i<custumer.size(); i++)
    {
        for (int j=0; j<customer.size(); j++)
        {
            if (cutomer.get(i).getID()>customer.get(j).getID())
            {
                customer c=customer.get(i);
                customer.set(i,customer.get(j));
                customer.set(j,c);
            }
        }
    }
    
    int age[]= new int[customer.size()];
    {
    for (int i=0; i<customer.size(); i++)
        
        Id=localDate.parse(customer.get(i).getDateOfBirth());
    int year=ID.getYear();
    age[i]2021-year;
    }
    
    string X="DD MM YYYY";
    simpleDateFormat sdf= new simpleDateFormat(X,new local("Day", "xx"));
    for (int i=0; i<customer.size(); i++)
    {
    
        customer.get(i).setDateOfBirth(sdf.format(customer.get(i))
}
    
    
    BufferedWriter bw= new BuffereWrite( new fileWrite(file name));
    string 
            str="=============CUSTOMER=========";
    bw.write(str);
    bw.newLine();
    str="ID\tName\tSurname\tdate of birth\tAge";
    bw.write(str);
    bw.newLine();
    str="================================================================"
            
            
            bw.write(str);
            bw.newLine();
            
            for (int i=0; i<customer.size(); i++)
            
            {
                str=customer.get(i).getId()+"\t" + customer.get(i).getName()+
                        getSurname()+ getDOB()+ getAge();
            }
            {
    str="Number of customers who can rent:"+r;
    
    bw.write(str);
    bw.newLine();
    
    str="Number of customers who cannot rent:"+nr;
    bw.write(str);
    bw.newLine();
    bw.close();
            }
            
            {
             for (int i=0; i<Supplier.size(); i++)
    {
        for (int j=0; j<Supplier.size(); j++)
        {
            if (Supplier.get(i).getID()>Supplier.get(j).getID())
            {
                Supplier c=Supplier.get(i);
                Supplier.set(i,Supplier.get(j));
                Supplier.set(j,c);
            }
        }
            }
    
}





