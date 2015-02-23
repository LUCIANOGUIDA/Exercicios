/**
 * 
 */
package poo;

public class Aluno extends Pessoa{
    
    public String faculdade;
    public int codigo;

    public Aluno(String faculdade, int codigo){
    
        this.faculdade = faculdade;
        this.codigo = codigo;
    
    }
        public Aluno(){
        
            
        }
            public String getFaculdade(){
            
                return faculdade;
            }
            public void setFaculdade(){
            
                this.faculdade = faculdade;
            }
            public int getCodigo(){
            
                return codigo;
            }
                public void setCodigo(){
                
                    this.codigo = codigo;
                }
        
        
          public String toString(){
            
            return  "****************************\n"+
                "* Nome:"+getNome()       
             +"\n* Idade:"+getIdade()
             +"\n* Sexo:"+getSexo()
             +"\n* Faculdade: "+getFaculdade()
             +"\n* Codigo do Aluno: "+getCodigo()
             +"\n*****************************\n"; 
        
        }

   

}
