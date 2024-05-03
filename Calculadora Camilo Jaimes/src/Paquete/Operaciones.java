package Paquete;

/**
 *
 * @author CAMILO JAIMES
 */
public class Operaciones {
    
    private String digito;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;

    public Operaciones() {
        digito = "";
        resultado = 0;
        suma = false;       
        resta = false;      
        multiplicacion = false;
        division = false;
    }

    public Operaciones(String digito, double resultado, boolean suma, boolean resta, boolean multiplicacion, boolean division) {
        this.digito = digito;
        this.resultado = resultado;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resulatdo) {
        this.resultado = resulatdo;
    }

    public boolean isSuma() {
        return suma;
    }

    public void setSuma(boolean suma) {
        this.suma = suma;
    }

    public boolean isResta() {
        return resta;
    }

    public void setResta(boolean resta) {
        this.resta = resta;
    }

    public boolean isMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(boolean multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public boolean isDivision() {
        return division;
    }

    public void setDivision(boolean division) {
        this.division = division;
    }
    
    public void agregarNum(int numero){
        setDigito(digito+numero);
    }
    
    public void suma(String num){
        if (num.startsWith("-")) {
        this.resultado = -Double.parseDouble(num.substring(1));
        suma = true;
    } else {
        this.resultado = Double.parseDouble(num);
        suma = true;
    }
    setDigito("");
    }
    
    public void resta(String num) {
    if (num.startsWith("-")) {
        this.resultado = -Double.parseDouble(num.substring(1));
        resta = true;
    } else {
        this.resultado = Double.parseDouble(num);
        resta = true;
    }
    setDigito("");
}

    public void multiplicacion(String num){
        if (num.startsWith("-")) {
        this.resultado = -Double.parseDouble(num.substring(1));
        multiplicacion = true;
    } else {
        this.resultado = Double.parseDouble(num);
        multiplicacion = true;
    }
    setDigito("");
    }
    
    public void division(String num){
        if (num.startsWith("-")) {
        this.resultado = -Double.parseDouble(num.substring(1));
        division = true;
    } else {
        this.resultado = Double.parseDouble(num);
        division = true;
    }
    setDigito("");
    }
    
    public double igual(String numero){
    if(suma == true){
        resultado = resultado + Double.parseDouble(numero);
    }
    
    if(resta == true){
        resultado = resultado - Double.parseDouble(numero);
    }
    
    if(multiplicacion == true){
        resultado = resultado * Double.parseDouble(numero);
    }
    
    if(division == true){
        if(Double.parseDouble(numero) == 0){
            System.out.println("Error: No se puede dividir por cero.");
            return resultado; 
        } else {
            resultado = resultado / Double.parseDouble(numero);
        }
    }
    
    suma = false;
    resta = false;
    multiplicacion = false;
    division = false;
    
    return resultado;
}


}
