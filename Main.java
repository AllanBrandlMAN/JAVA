import java.util.Date;


//Super Classe

class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;


    public Pessoa(String nome, String cpf, Date dataNascimento ){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }

}

//SubClasse Aluno

class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula){
       super(nome, cpf, dataNascimento) ; //chama o construtor da Super Classe
       this.matricula = matricula;
    }

    public void exibirInformacoes(){
       System.out.println("Nome: " + nome); 
       System.out.println("CPF: " + cpf);
       System.out.println("Data de Nascimento: " + dataNascimento);
       System.out.println("Matricula: " + matricula);


    }

}

//Subclasse Professor

class Professor extends Pessoa{
    public double salario;
    public String disciplina;

    public Professor (String nome, String cpf, Date dataNascimento,  double salario, String disciplina){
        super(nome, cpf,dataNascimento );
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome); 
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salario: " + salario);
        System.out.println("Disciplina: " + disciplina);


    }

}

//Classe Principal

public class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno ("Jose Silva","123.456.789-00", new Date(),"2023-001");
        Professor professor = new Professor ("Maria Oliveira", "987.654.321-00", new Date(), 5000.00,"Matematica");
        
        System.out.println("Informacao do Aluno");
        aluno.exibirInformacoes();
        System.out.println("Informacao do Professor");
        professor.exibirInformacoes();



    }

}