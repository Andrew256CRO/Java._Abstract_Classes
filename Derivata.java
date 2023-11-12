public class Derivata extends Parinte{
    int numar=10;
    Derivata(){
        System.out.println("Constructor Derivata.");
    }
    void print(){
        System.out.println("Apelare metoda abstracta 'print' din clasa Parinte");
        System.out.println("Valoare numar:"+ this.numar);
    }
}
