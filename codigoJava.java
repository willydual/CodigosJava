public class Recursividad {

    public static int timer(int tiempo, int cuenta)
    {
        //Se sale cuando el tiempo es igual a cero
        if (tiempo == 0) {
           return cuenta;
        }
        else //Hecho por William May
        {
            //Si no es cero le suma 10 a la cuenta y al tiempo le resta uno
            cuenta = cuenta + 10;
            tiempo = tiempo - 1;
            return timer(tiempo, cuenta);
        }
    }
    
    static int Mayor(int[] array, int n, int mayor)
    {
        //Este es el algoritmo del mayor de una array
        if (n == array.length)
            return mayor;

        if (array[n] > mayor)
            mayor = array[n];

        return Mayor(array, ++n, mayor);
    }
    public void decirHola()
    {
        System.out.println(subCadena("Hola soy William");
    }
    
    static String subCadena(String cadena, int s, int e)
    {
        String sSubCadena = cadena.substring(s,e);
        return sSubCadena;
    }
    
    public static void main(String[] args) {
        System.out.println(subCadena("lasfloresazules", 3, 9));
    }
    
}
