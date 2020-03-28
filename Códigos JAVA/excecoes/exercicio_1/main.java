
public class main {

    public static void main(String[] args) {
       System.out.println("Inicio da main");
       metodo1();
       System.out.println("Fim da main");
    }
    
    static void metodo1(){
        System.out.println("Inicio do metodo 1");
        try{
           metodo2();
        }
        catch(ArrayIndexOutOfBoundsException erro){
           System.out.println("Fim do metodo 2");
        }

        System.out.println("Fim do metodo 1");
    }
    
    static void metodo2(){
        System.out.println("Inicio do metodo 2");
        
        int[] array = new int [10];

            
            for(int i = 0; i<=15; i++){
            array[i]  = i;
            System.out.println(i);
        }
        
        System.out.println("Fim do metodo 2");
    }
    
}
