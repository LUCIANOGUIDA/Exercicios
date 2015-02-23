package Robô;

public class RoboSimples0 {

    private String nomeDoRobo;
    private int posicaoYAtual,posicaoXAtual;
    private char direcaoAtual;

    /**
     * Construtor passando todos os parametros.
     * @param nomeDoRobo
     * @param posicaoYAtual
     * @param posicaoXAtual
     * @param direcaoAtual 
     */
      RoboSimples0(String nome,int posicaoY, int posicaoX, char direcaoA) {
         
         nomeDoRobo = nome;
         posicaoXAtual = posicaoX;
         posicaoYAtual = posicaoY;
         direcaoAtual = direcaoA;
         
    }
     /**
      * Construtor pasando apenas o nome como parametro
      * @param nomeDoRobo 
      */
     RoboSimples0(String nomeRobo) {
         
         this(nomeRobo,0,0,'N');
         
         
    }
     /**
      * Construtor vazio
      */
     RoboSimples0() {
         
         this("",0,0,'N');
         
    }/**
     * Metodo que faz com que o robor dê um passo;
     */
    public void move(){
        
        move(1);
        
    }/**
     * Metodo construtor para mover o robor com a quintidade de passos
     * informada
     * @param passos 
     */
    public void move(int passos){
        
        if(direcaoAtual == 'N') posicaoYAtual = posicaoYAtual+passos;
        if(direcaoAtual == 'S') posicaoYAtual = posicaoYAtual-passos;
        if(direcaoAtual == 'E') posicaoXAtual = posicaoXAtual+passos;
        if(direcaoAtual == 'O') posicaoXAtual = posicaoXAtual-passos;
                
    
    }/**
     * Metodo construtor para mudar direção do robô
     */
    public void mudaDirecao(char novaDirecao){
    
        direcaoAtual = novaDirecao;
    }
    /**
     * 
     * @return uma String com os valores dos campos formatados 
     * 
     */
    public String toString(){
    
         String posicao = "Nome do Robô:"+nomeDoRobo+"\n";
         posicao = posicao +"Posição do Robô: ("+posicaoXAtual+","+
                                                 posicaoYAtual+")\n";
         posicao = posicao+"Direção do Robô: "+direcaoAtual;
         return posicao;
    }
}
