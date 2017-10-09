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
        
        
        BufferedWriter pessoasql = null;
        BufferedWriter consumosql =  null;
         BufferedReader consumoin = null ;
         BufferedReader pessoain = null;
         String linhalida = null;
       
        FileReader consumo = null;
        try {
            consumo = new FileReader("D:/BasesStataFINAL/consumofim.txt");
        } catch (FileNotFoundException ex) {
           
          
        }
        
        FileReader pessoas = null;
        try {
            pessoas = new FileReader("D:/BasesStataFINAL/pessoafim.txt");
                    } catch (FileNotFoundException ex) {
           
        }
        
        
        
        consumoin = new BufferedReader(consumo);
      
        pessoain = new BufferedReader(pessoas);
        
        
        try {
            pessoasql = new BufferedWriter(new  FileWriter("D:/BasesStataFINAL/pessoa.sql"));
        } catch (IOException ex) {
           
        }
        
        try {
            consumosql = new BufferedWriter(new  FileWriter("D:/BasesStataFINAL/consumo.sql"));
        } catch (IOException ex) {
           
        }
        
        String linhapessoa;
        String linhaconsumo;
        
        linhapessoa = pessoain.readLine();
        
            while ((linhapessoa = pessoain.readLine())!= null)
            {
              
                
               
                     
                pessoasql.write("INSERT INTO pessoa (tipo_reg,cod_uf,num_seq,num_dv,cod_domc,num_ext_renda,fator_expansao1,fator_expansao2,perd_cod_p_visit_realm_em,qtd_morador_domc,qtd_uc,qtd_familia,cod_tipo_domc,qtd_comd_serv_dormit,cod_abast_agua,qtd_banheiros,cod_cond_ocup,imput_qtd_comodos,imput_qtd_banheiros,renda_bruta_monetaria,renda_total,estrada_grande_1,num_uc,num_inf,cod_rel_pess_refe_uc,num_familia,cod_cond_familia,cod_cond_presenca,dat_ano_nasc,idade_anos,cod_sexo,cod_sabe_ler,cod_freq_escola,cod_serie_freq,cod_nivel_instr,cod_concluiu_curso,anos_de_estudo,cod_cor_raca,cod_tem_cartao,cod_ehtitular_conta,num_comprimento,num_altura,num_peso,num_peso_crianca,comprimento_imputado,altura_imputado,peso_imputado,renda_percapita,religiao,plano_saude,cod_cond_vida,val_rec_min_ali,v_DT_8_cr,v_DT_85_cr,v_DT_8_tot,v_DT_85_tot,keydomcl,keypessoa,num_quadro,cod_item,val_despesa,dup_pessoa,cons_cinema,cons_celular,cons_telfixo,cons_shows,cons_dvd,cons_internet,val_cons_cinema,val_cons_celular,val_cons_telfixo,val_cons_shows,val_cons_dvd,val_cons_internet)\n" +
"VALUES ( " + linhapessoa + " ); ") ;
                             pessoasql.newLine();
                   
                
               
                   
                }
                
             pessoasql.close();
             
             linhaconsumo = consumoin.readLine();
            
          while ((linhaconsumo = consumoin.readLine())!= null)
            {
              
                
               
                     
                consumosql.write("INSERT INTO consumo (tipo_reg,cod_uf,num_seq,num_dv,cod_domc,num_uc,num_ext_renda,fator_expansao1,fator_expansao2,num_quadro,cod_item,val_despesa,num_inf,keydomcl,keypessoa)VALUES ( " + linhaconsumo + " ); ") ;
                consumosql.newLine();
                   
                
               
                   
                }
                
            consumosql.close();
                
                
                  
    }
}
            
        
        
        
    
    

