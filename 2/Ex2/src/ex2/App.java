package ex2;



public class App {
    public static void main(String[] args) throws Exception {
        Nota objetNota= new Nota();
        objetNota.matricula=123;
        objetNota.nome="André";
        objetNota.nota1=60.0;
        objetNota.nota2=70.0;
        objetNota.nota_trabalho=80.0;
        double media=objetNota.mediaTotal();
        double media_final=objetNota.mediaFi();
        System.out.println("Numero de matricula: "+objetNota.matricula+"Nome:"+objetNota.nome+"Sua media É"+media);
        System.out.println("Se o o resultado for 0 o aluno foi aprovado:"+media_final);
        
    }
}
