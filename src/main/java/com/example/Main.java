package com.example;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro();
        l1.mostrarDetalles();
        
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling1");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();
    


//CUENTA BANCARIA
CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
cuenta.depositar(200);
System.out.println(" Saldo Actual " + cuenta.getSaldo());
cuenta.retirar(1000);

 Estudiante e = new Estudiante("Pedro ",  21,2.5);
 e.mostrarInfo();







    }

}