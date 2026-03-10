public class TiposDatos {
    public static void main(String[] args) {
        byte nivelBateria=50;
        byte temperatura=20;
        System.out.println("Nivel de Bateria: "+nivelBateria);
        System.out.println("Temperatura: "+temperatura);
        byte maxByte=Byte.MAX_VALUE;
        byte minByte=Byte.MIN_VALUE;
        System.out.println("Valor máximo de byte: "+maxByte);
        System.out.println("Valor mínimo de byte: "+minByte);
        short maxShort=Short.MAX_VALUE;
        short minShort=Short.MIN_VALUE;
        System.out.println("Valor máximo de short: "+maxShort);
        System.out.println("Valor mínimo de short: "+minShort);
        char valorNumerico=65;
        char letra=valorNumerico;
        System.out.println("Valor númerico: "+valorNumerico);
        System.out.println("Letra: "+letra);

        boolean esMayorDeEdad=true;
        boolean esMenorDeEdad=false;
        boolean esIgual=(6==6);  //true
        boolean esDiferente=(6!=6); //false
        boolean esMayor=(6>5); //true

        System.out.println("Es mayor de edad: "+esMayorDeEdad);    
        System.out.println("Es menor de edad: "+esMenorDeEdad);    
        System.out.println("Es igual: "+esIgual);
        System.out.println("Es diferente: "+esDiferente);
        System.out.println("Es mayor: "+esMayor);

        int edad=25;
        boolean esAdulto= (edad>=18);//true
        System.out.println("Es adulto: "+esAdulto);

        //Conversion implicita ----------------------------
        int numeroEntero=100;
        long numeroDecimal=numeroEntero;
        float numeroDecimal2=numeroEntero;
        System.out.println("Numero entero: "+numeroEntero);
        System.out.println("Numero decimal: "+numeroDecimal);
        System.out.println("Numero decimal 2: "+numeroDecimal2);

        //Conversion explicita ----------------------------
        double numeroDecimal3=123.45;
        int numeroEntero2=(int)numeroDecimal3;
        System.out.println("Numero decimal 3: "+numeroDecimal3);
        System.out.println("Numero entero 2: "+numeroEntero2);

        char letraZ='Z';
        int valorNumerico2=(int)letraZ;
        System.out.println("Valor numérico de la letra Z: "+valorNumerico2);
        char letraA='A';
        int valorNumericoA=(int)letraA;
        System.out.println("Valor numérico de la letra A: "+valorNumericoA); //imprime el codigo ASIIC

        String numeroTexto="123";
        String bolean="true";
        byte numeroConvertido=Byte.parseByte(numeroTexto);
        System.out.println("Numero convertido: "+numeroConvertido);
        double numeroDecimalConvertido=Double.parseDouble(numeroTexto);
        System.out.println("Numero decimal convertido: "+numeroDecimalConvertido);

        boolean esVerdadero=Boolean.parseBoolean(bolean);
        System.out.println("Es verdadero: "+esVerdadero);

        char letraUnicode='\u0041';
        System.out.println("Letra Unicode: "+letraUnicode);

    }
}
