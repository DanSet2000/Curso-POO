package Main;


public class App {

    public static void main(String[] args) {
        
    
        try{
            int resultado = 3/0;
        }  
        catch (Exception e){
            System.out.println("No se puede dividir para cero");
        }
        
        
        int edades[] = {12, 15, 30, 25};
        
        try{
            System.out.println("La edad de la posicion 4 es: " + edades[4]);
        }catch (Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }
        
                
                
    }
}
