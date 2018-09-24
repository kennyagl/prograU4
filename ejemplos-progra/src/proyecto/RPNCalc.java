package proyecto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kenny
 */
public class RPNCalc {

    Stack<Double> pila;
    List<HistorialFuncion> historial;

    public RPNCalc() {
        historial = new ArrayList();
    }

    /**
     * Esta funcion realiza el calculo de una expresion en notacion polaca
     * inversa
     *
     * @param expresion
     * @return
     */
    public Double calcular(String expresion) {
        pila = new Stack();

        StringTokenizer st = new StringTokenizer(expresion, " ", false);
        while (st.hasMoreElements()) {
            String token = st.nextToken();
            if (operando(token)) {
                pila.push(parse(token));
            } else {
                if (pila.size() < 2) {
                    throw new RuntimeException("Error en la expresión");
                }
                Double valor1 = pila.pop();
                Double valor2 = pila.pop();
                Double resultado = operar(valor1, valor2, token);
                pila.push(resultado);
            }
        }
        if (pila.size() == 1) {
            Double resultado = pila.pop();
            guardarEnHistorial(expresion, resultado);
            return resultado;
        } else {
            throw new RuntimeException("Error en la expresión");
        }

    }

    private void guardarEnHistorial(String expresion, Double resultado) {
        HistorialFuncion h = new HistorialFuncion(expresion, resultado);
        historial.add(h);

    }

    public void imprimirHistorial() {
        for (int i = 0; i < historial.size(); i++) {
            HistorialFuncion aux = historial.get(i);
            System.out.println(aux.getExpresion() + " = " + aux.getResultado());
        }
    }

    private Double parse(String token) {
        try {
            return Double.parseDouble(token);

        } catch (NumberFormatException nfe) {
            throw new RuntimeException("el valor: " + token + " no es un número");
        }
    }

    private boolean operando(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private Double operar(Double valor1, Double valor2, String operador) {
        switch (operador) {
            case "PLUS":
                return valor1 + valor2;

            case "LESS":
                return valor2 - valor1;
            case "TIMES":
                return valor1 * valor2;
            case "DIVIDE":
                if (valor2.intValue() == 0) {
                    throw new RuntimeException("Error: división por cero");
                }
                return valor2 / valor1;
            default:
                throw new RuntimeException("Operador no es valido: " + operador);

        }
    }

    private void writeToFile() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("historial-rpn.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < historial.size(); i++) {
                HistorialFuncion aux = historial.get(i);
                printWriter.println(aux.getExpresion() + " = " + aux.getResultado());
            }
            printWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(RPNCalc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        RPNCalc calculadora = new RPNCalc();

        //Double resultado = calculadora.calcular("2 1 3 2 1 PLUS TIMES PLUS DIVIDE 5 TIMES");
        calculadora.calcular("2 1 3 2 1 PLUS TIMES PLUS DIVIDE 5 TIMES");
        calculadora.calcular("3 1 5 TIMES PLUS 3 TIMES 1 2 PLUS 2 TIMES 3 2 2 TIMES LESS 1 PLUS PLUS TIMES 2 DIVIDE ");
        calculadora.calcular("3 2 3 3 4 2 PLUS DIVIDE TIMES PLUS LESS");
        calculadora.calcular("3 2 3 3 4 2 2 100 1 PLUS DIVIDE TIMES PLUS LESS TIMES PLUS LESS");

        calculadora.imprimirHistorial();

        calculadora.writeToFile();
        //System.out.println(resultado);
    }

}
