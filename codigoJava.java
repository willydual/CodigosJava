public class Recursividad {

    public static int timer(int tiempo, int cuenta)
    {
        if (tiempo == 0) {
           return cuenta;
        }
        else //Hecho por William May
        {
            cuenta = cuenta + 10;
            tiempo = tiempo - 1;
            return timer(tiempo, cuenta);
        }
    }
    
    static int Mayor(int[] array, int n, int mayor)
    {
        if (n == array.length)
            return mayor;

        if (array[n] > mayor)
            mayor = array[n];

        return Mayor(array, ++n, mayor);
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
