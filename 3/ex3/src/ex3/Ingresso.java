package ex3;

public class Ingresso {
    public int vl_ingresso_normal;
    public int acrescimo=10;
    
    public int ingressoNormal(){
        int x=vl_ingresso_normal;
        return x;
    }
    public int ingressoVip(){
        int y=vl_ingresso_normal+10;
        return y;
    }

    
}
