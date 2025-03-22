// Exemplo do metodo construtor:

 public class ClasseseMetodos {
   public static void main(String[] args) {
    
     public Carro(String, cor, String marca, String modelo, int ano, int numeroPortas, boolean possuiAirbag) {
       this.cor = 
       this.marca =
       this.modelo =
       this.ano =
       this.numeroPortas =
       this.possuiAirbag =
     }
   }
 }
 class Carro {
   String cor;
   String marca;
   String modelo;
   int ano;
   int numeroPortas;
   boolean possuiAirbag;
 }

// Atividade 1)

 public class ClasseseMetodos {
   public static void main(String[] args) {
    
    Cachorro cachorro_1 = new Cachorro("Hulk", 10, "Rottweiler");

     System.out.println("Informações do primeiro cachorro: " + "\n" + "Nome: " + cachorro_1.nome + "\n" + "Idade: " + cachorro_1.idade + "\n" + "Raça: " + cachorro_1.raca + "\n");  
    
    Cachorro cachorro_2 = new Cachorro("Jade", 2, "Shiba Inu");

     System.out.print("Informações do segundo cachorro: " + "\n" + "Nome: " + cachorro_2.nome + "\n" + "Idade: " + cachorro_2.idade + "\n" + "Raça: " + cachorro_2.raca);
   }
 }

 class Cachorro {
   String nome;
   int idade;
   String raca;

   public Cachorro(String nome, int idade, String raca) {
     this.nome = nome;
     this.idade = idade;
     this.raca = raca;
   }
 }

// Atividade 2)

 public class ClasseseMetodos {
   public static void main(String[] args) {

    Cachorro cachorro_1 = new Cachorro("Hulk", 10, "Rottweiler", true);
    
     System.out.println("Informações do primeiro cachorro: " + "\n" + "Nome: " + cachorro_1.nome + "\n" + "Idade: " + cachorro_1.idade + "\n" + "Raça: " + cachorro_1.raca + "\n");

     cachorro_1.latido();
     cachorro_1.silencio();

    Cachorro cachorro_2 = new Cachorro("Jade", 2, "Shiba Inu", false);

     System.out.println("Informações do segundo cachorro: " + "\n" + "Nome: " + cachorro_2.nome + "\n" + "Idade: " + cachorro_2.idade + "\n" + "Raça: " + cachorro_2.raca + "\n");

     cachorro_2.latido();
     cachorro_2.silencio();
   }
 }

 class Cachorro {
   String nome;
   int idade;
   String raca;
   boolean latir;

   public Cachorro(String nome, int idade, String raca, boolean latir) {
     this.nome = nome;
     this.idade = idade;
     this.raca = raca;
     this.latir = false; //cachorro começa em silêncio
   }
   public void latido() {
     this.latir = true;
     System.out.println("O cachorro está latindo." + "\n");
   }
   public void silencio() {
     this.latir = false;
     System.out.println("O cachorro está em silêncio." + "\n");
   }
 }

// Atividade 3)

public class ClasseseMetodos {
    public static void main(String[] args) {
      
      Conta poupanca = new Conta(0, 0 ,30);
      poupanca.sacar();
      poupanca.depositar();
      poupanca.verificarSaldo();
     
    }
  }
  
  class Conta {
    double saldo;
  
    public Conta(double saque, double deposito, double saldo) {
      this.saldo = saldo;
    }
    public void sacar() {
      double saque = 20;
      System.out.println("Você sacou " + saque + " reais.");
      if (saque > saldo) {
        System.out.println("Saldo insuficiente.");
      } else {
        saldo -= saque;
      }
    }
    public void depositar() {
    double deposito = 20;
    System.out.println("Você depositou " + deposito + " reais.");
    saldo += deposito;
    }
    public void verificarSaldo() {
      System.out.println("Seu saldo é de " + saldo + " reais.");
    }
  }