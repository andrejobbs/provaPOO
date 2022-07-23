package ex3;
public class App {
    public static void main(String[] args) throws Exception {
        Ingresso objetoIngresso=new Ingresso();
        objetoIngresso.vl_ingresso_normal=50;
        objetoIngresso.acrescimo=10;
        int normal=objetoIngresso.ingressoNormal(); 
        int vip=objetoIngresso.ingressoVip(); 
        int compara_valor_normal=normal-vip;
        int compara_valor_vip=vip-normal;
        System.out.println("O ingresso normal tem valor "+normal+" A diferença pro vip é de -"+compara_valor_normal);
        System.out.println("O ingresso vip tem valor:"+vip+" A diferença pro normal é + "+compara_valor_vip);
        
    }
}
