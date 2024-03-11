package LibreriaESC;

/**
 * Esta libreria se utiliza para hacer operacines
 */
public class Operacion {
    /**
     * Opcion para elegir Sumar
     */
    public static final int SUMA = 0;
    /**
     * Opcion para elegir Restar
     */
    public static final int RESTA = 1;
    /**
     * Opcion para elegir Multiplicar
     */
    public static final int MULTIPLICACION = 2;
    /**
     * Opcion para elegir Dividir
     */
    public static final int DIVISION = 3;
    /**
     * Opcion para elegir Raiz de caulquier indice
     */
    public static final int RAIZ = 4;

    /**
     *
     * @param num1 primer numero de la operacion
     * @param num2 segundo nuemor de la operacion
     * @param operacion que queremos realizar
     * @return resultado de la operacon, o null en caso de error
     */

    public static Float operar(Float num1, Float num2, int operacion){
        switch(operacion){
            case SUMA:
                return num1 + num2;
            case RESTA:
                return num1 - num2;
            case MULTIPLICACION:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
            case RAIZ:
                return (float) Math.pow(num1, num2);
            default:
                return null;
        }
    }
}
