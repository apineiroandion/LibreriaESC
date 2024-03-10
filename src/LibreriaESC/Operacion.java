package LibreriaESC;

public class Operacion {
    public static final int SUMA = 0;
    public static final int RESTA = 1;
    public static final int MULTIPLICACION = 2;
    public static final int DIVISION = 3;

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
            default:
                return null;
        }
    }
}
