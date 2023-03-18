package primeiro;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        
        /* Isso ocorre porque quando criamos um objeto da classe C, 
         primeiro o construtor da classe pai A é chamado, imprimindo "Classe A". 
         Em seguida, a classe C possui um atributo do tipo B que é instanciado no momento da declaração, 
         imprimindo "Classe B". Como a classe C não tem um construtor próprio, o construtor padrão é 
         implicitamente chamado, e é por isso que a saída contém as mensagens das classes A e B.*/
    }
}

