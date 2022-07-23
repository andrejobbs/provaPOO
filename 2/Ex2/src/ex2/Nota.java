package ex2;

public class Nota {
    public double media_aluno;
    public int matricula;
    public String nome;
    public double nota1,nota2,nota_trabalho;

    public double mediaTotal(){
       media_aluno=((nota1+nota2)*2.5+nota_trabalho*2)/7;
       return media_aluno;


    }
    public double mediaFi(){
        if (media_aluno>=60.0){
            return 0;

        }
    
    }
}
