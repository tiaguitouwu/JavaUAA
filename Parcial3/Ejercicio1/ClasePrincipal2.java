package Parcial3.Ejercicio1;

public class ClasePrincipal2 {

    public ClasePrincipal2(){};
    //Método no estatico
    public void imprimir(int j, String[] vectorPalindromas){
        if(j > 0 ){
            System.out.println("Existen "+j+" palabras palindromas");
            for(int i = 0; i < j;i++){
                System.out.println((i+1)+"°-"+vectorPalindromas[i]);
            }
        }else{
            System.out.println("No existe palabras palindromas");
        }
    }

    public String invertirPalabra(String palabra){
        palabra = palabra.toLowerCase().trim();
        String palabraInvertida = "";
        char caracter;
        
        for (int i = palabra.length() - 1; i >= 0; i--) {
            caracter = palabra.charAt(i);
            palabraInvertida += caracter;
        }

        return palabraInvertida;
    }

}
