package prova;

public class Bomba {
    public int novo_combustivel;
    public int novo_valor;
    public int entrada;
    public int tp_combustivel;
    public int vl_combustivel;
    public int qtd_combustivel;
    public int op_1;
    public int op_2;

    public int abastecerPorValor(){
        int valor_subtraido=(entrada/vl_combustivel);
        return valor_subtraido;
    }
    public int abastecerPorLitro(){
        int valor_subtraido_litro=(qtd_combustivel/vl_combustivel);
        return valor_subtraido_litro;

    }
    public int alteraValor(){
        if (op_1==1){
            vl_combustivel=novo_valor;
            return vl_combustivel;
        }
        
    }
    public int alteraCombustivel(){
        if (op_2==2){
            tp_combustivel=novo_combustivel;
            return tp_combustivel;                
        } 
    
        
    }
    }

    
}
