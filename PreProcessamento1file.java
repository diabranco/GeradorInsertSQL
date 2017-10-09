/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preprocessamento1file;

/**
 *
 * @author Ticiana
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreProcessamento1file {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader file = null ;
        BufferedReader copiafile = null ;
        
        String linhasaida = "0";
        String linhafile = "0";
        String linhafilecopia = "0";
        
         String cons_celular = "0";
                    String val_cons_celular = "0";
                    String cons_telfixo = "0";
                    String val_cons_telfixo = "0";
                    String cons_shows = "0";
                    String val_cons_shows = "0";
                    String cons_dvd = "0";
                    String val_cons_dvd = "0";
                    String cons_internet = "0";
                    String val_cons_internet = "0";
                    String cons_cinema = "0";
                    String val_cons_cinema = "0";
        
        
        boolean write = false;
        BufferedWriter processado = null;
        
        
        
        String con_domclId = null;
        String con_pessoaId = null;
        
        String[] splitlinhafile = null;
        String[] splitlinhafilecopia = null;
       
        FileReader filer = null;
        FileReader copiafiler = null;
        
        try {
            filer = new FileReader("D:/BasesStataFINAL/socorro.txt");
            copiafiler = new FileReader("D:/BasesStataFINAL/socorro.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PreProcessamento1file.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        
        
        BufferedReader readfile = new BufferedReader(filer);
        BufferedReader copiareadfile = new BufferedReader(copiafiler);
      
        
        
        
        try {
            processado = new BufferedWriter(new  FileWriter("D:/BasesStataFINAL/processadoumfile.csv"));
        } catch (IOException ex) {
            Logger.getLogger(PreProcessamento1file.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dummies = "cons_celular. val_cons_celular ,cons_telfixo, val_cons_telfixo,cons_shows, val_cons_shows,cons_dvd, val_cons_dvd,cons_internet, val_cons_internet, cons_cinema, val_cons_cinema";
        int i = 0;
        
        
            while ((linhafile = readfile.readLine())!= null)
            {
                splitlinhafile = linhafile.split(",");
                String pessoaId = null;
                
                pessoaId = splitlinhafile[67] ;
                //pessoaId = pessoaId.substring(3);
                //double Idp = Double.parseDouble(pessoaId);
                
                String  domclId = null;
                domclId = splitlinhafile[66];
                
               //double Iddc = Double.parseD(domclId);
                //domclId = domclId.substring(3);
                
                while ((linhafilecopia = copiareadfile.readLine())!= null)
                {
                 splitlinhafilecopia = null;
                 splitlinhafilecopia = linhafilecopia.split(",");
                 con_pessoaId = null;
                 con_domclId = null;
                 con_pessoaId = splitlinhafilecopia[67];
                 //con_pessoaId = con_pessoaId.substring(2);
                 //float concpId = Float.parseFloat(con_pessoaId);
                 con_domclId = splitlinhafilecopia[66];
                 //con_domclId = con_domclId.substring(2);
                
                 
                //float condmId = Float.parseFloat(con_domclId);
                 
               
                   
                 
                // if (pessoaId.equals(con_pessoaId))
                if (con_pessoaId.equalsIgnoreCase(pessoaId))
                 {
                
                
                    if ((("6".equals(splitlinhafilecopia[58])) &&  ("801".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1591".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1301".equals(splitlinhafilecopia[59])))|
                       (("28".equals(splitlinhafilecopia[58])) &&  ("2401".equals(splitlinhafilecopia[59])))|
                       (("28".equals(splitlinhafilecopia[58])) &&  ("2402".equals(splitlinhafilecopia[59]))))
                       {cons_celular = "1"; val_cons_celular = splitlinhafilecopia[60];}
                    
                    if ((("6".equals(splitlinhafilecopia[58])) &&  ("801".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("5801".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1591".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1401".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("401".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("501".equals(splitlinhafilecopia[59]))))
                       {cons_telfixo = "1"; val_cons_telfixo = splitlinhafilecopia[60];}
                         
                    if (("28".equals(splitlinhafilecopia[58])) &&  ("1591".equals(splitlinhafilecopia[59])))
                    {
                    cons_shows = "1"; val_cons_shows = splitlinhafilecopia[60];
                    }
                    
                    if ((("13".equals(splitlinhafilecopia[58])) &&  ("1701".equals(splitlinhafilecopia[59])))|
                       (("15".equals(splitlinhafilecopia[58])) &&  ("2701".equals(splitlinhafilecopia[59])))|
                       (("28".equals(splitlinhafilecopia[58])) &&  ("5701".equals(splitlinhafilecopia[59])))|
                       (("28".equals(splitlinhafilecopia[58])) &&  ("2601".equals(splitlinhafilecopia[59])))|
                       (("28".equals(splitlinhafilecopia[58])) &&  ("5801".equals(splitlinhafilecopia[59]))))                      
                       {cons_dvd = "1"; val_cons_dvd = splitlinhafilecopia[60]; }
                    
                     if ((("6".equals(splitlinhafilecopia[58])) && ("502".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("503".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("504".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("505".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("506".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("801".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("5801".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("5901".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1301".equals(splitlinhafilecopia[59])))|
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1401".equals(splitlinhafilecopia[59]))))                      
                       {cons_internet = "1"; val_cons_internet = splitlinhafilecopia[60];  }
                     
                     if (("28".equals(splitlinhafilecopia[58])) && ("591".equals(splitlinhafilecopia[59])))
                     {cons_cinema = "1"; val_cons_cinema = splitlinhafilecopia[60];  }
                     
                     
                    
                     
                linhasaida = linhafile + ","  + cons_celular + "," + val_cons_celular + "," + cons_telfixo+ "," + val_cons_telfixo +
                     "," + cons_shows + "," + val_cons_shows + "," +  cons_dvd + "," + val_cons_dvd + "," + cons_internet + "," + val_cons_internet
                             + "," + cons_cinema + "," + val_cons_cinema;
                    
                write = true;
                     
                }else
                {
                write = false;
                }
                
                if (domclId.equalsIgnoreCase(con_domclId))
                 
                 {
                     
                
                    if ((("6".equals(splitlinhafilecopia[58])) &&  ("801".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1591".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1301".equals(splitlinhafilecopia[59])))||
                       (("28".equals(splitlinhafilecopia[58])) &&  ("2401".equals(splitlinhafilecopia[59])))||
                       (("28".equals(splitlinhafilecopia[58])) &&  ("2402".equals(splitlinhafilecopia[59]))))
                       {cons_celular = "1"; val_cons_celular = splitlinhafilecopia[60];}
                    
                    if ((("6".equals(splitlinhafilecopia[58])) &&  ("801".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("5801".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1591".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1401".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("401".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("501".equals(splitlinhafilecopia[59]))))
                       {cons_telfixo = "1"; val_cons_telfixo = splitlinhafilecopia[60];}
                         
                    if (("28".equals(splitlinhafilecopia[58])) &&  ("1591".equals(splitlinhafilecopia[59])))
                    {
                    cons_shows = "1"; val_cons_shows = splitlinhafilecopia[60];
                    }
                    
                    if ((("13".equals(splitlinhafilecopia[58])) &&  ("1701".equals(splitlinhafilecopia[59])))||
                       (("15".equals(splitlinhafilecopia[58])) &&  ("2701".equals(splitlinhafilecopia[59])))||
                       (("28".equals(splitlinhafilecopia[58])) &&  ("5701".equals(splitlinhafilecopia[59])))||
                       (("28".equals(splitlinhafilecopia[58])) &&  ("2601".equals(splitlinhafilecopia[59])))||
                       (("28".equals(splitlinhafilecopia[58])) &&  ("5801".equals(splitlinhafilecopia[59]))))                      
                       {cons_dvd = "1"; val_cons_dvd = splitlinhafilecopia[60]; }
                    
                     if ((("6".equals(splitlinhafilecopia[58])) && ("502".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("503".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("504".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("505".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("506".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("801".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("5801".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("5901".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1301".equals(splitlinhafilecopia[59])))||
                       (("6".equals(splitlinhafilecopia[58])) &&  ("1401".equals(splitlinhafilecopia[59]))))                      
                       {cons_internet = "1"; val_cons_internet = splitlinhafilecopia[60];  }
                     
                     if (("28".equals(splitlinhafilecopia[58])) && ("591".equals(splitlinhafilecopia[59])))
                     {cons_cinema = "1"; val_cons_cinema = splitlinhafilecopia[60];  }
                     
                     linhasaida = linhafile + ","  + cons_celular + "," + val_cons_celular + "," + cons_telfixo+ "," + val_cons_telfixo +
                     "," + cons_shows + "," + val_cons_shows + "," +  cons_dvd + "," + val_cons_dvd + "," + cons_internet + "," + val_cons_internet
                             + "," + cons_cinema + "," + val_cons_cinema;
                    
                 write = true;
                 }else
                {
                write = false;
                }
                
               
                   
                }
                
                if(write){processado.write(linhasaida);
                processado.newLine();}
                
                
                  
            }
            
            processado.close();
            
              }
                
           
            
            }
        
            
        
        
        
    
    

