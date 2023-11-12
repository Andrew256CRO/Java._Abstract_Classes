public class TestPrb3 {
    TestPrb3(){
        System.out.println("Constructor TestPrb3.");
    }
    public static void main(String[] args) {
        Derivata d=new Derivata();
        d.print();
    }
}

//Output:
        /*Constructor Parinte.
        Apelare metoda abstracta 'print' din clasa Parinte
        Valoare numar:0
        Constructor Derivata.
        Apelare metoda abstracta 'print' din clasa Parinte
        Valoare numar:10*/
