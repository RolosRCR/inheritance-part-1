package uaslp.ingenieria.labs;

import java.util.Date;

// private(dentro de la clase),
// package-private (dentro del paquete),
// protected (dentro del paquete y clases hijas en cualquier paquete),
// public (todos lados)

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Ivan");
        person.setBirthDate(new Date());


        Employee employee = new Employee();

        employee.setStartDay(new Date());
        employee.setRol("Programmer");
        employee.setEmployeeId("123445");
        employee.setName("Ivan");
        employee.setBirthDate(new Date());


        Teacher teacher = new Teacher();

        teacher.setSpeciality("algo");


        // Reutilizar código
        // --> Tamaño del código menor
        // -> ¿ Por qué el código más pequeño es bueno?
        //  --> Nos ahorra tiempo +1
        //  --> Por que tiempo es dinero
        // --> ¿es bueno?
        // ----> Es bueno no escribir código de más, código innecesario
        //// PEEEEERO NUNCA debemos sacrificar la legibilidad del código
        // Código necesario

        /// KISS -> Keep it Simple Stupid
        // YAGNI -> You are not goonna use it --> No lo vas a usar

        // Top-down-> De lo que ve el usuario -> al código que soporta eso desde abajo
        // Bottom up --> Creamos métodos que serán usados por más código y más código hasta que al final llega a el usuario final

        // --> Crear métodos con funcionalidad "por si se usa"

        // Usuario: Una persona, Un sistema, Un programador (DLL C++ , shared objects)

        // Back end
        //UI -> User interface


        // --> Porque se puede dar el mantenimiento más fácil
        // --> Mantenible
        // -> ¿Por qué es más mantenible?
        // ----> Modifico un lugar y corrijo muchos escenarios

        // Desarrollo del software siempre es ITERATIVO
        // Principios -> SOLID
        // GRASP -> Principios de asignación de responsabilidades
        // Refactorizarlo
        // -> Debemos tener mecanismos que nos permitan ASEGURAR que no estamos rompiendo nada
        // -> Código que prueba código -> Testing
        // -> Unit tests


        // XXXX --> Copiar y pegar -> Anti patrón -> XXXX

        /// Funciones

        // Más fácil
        // Más entendible


        // Abstracción , Herencia, Polimorfismo, Encapsulamiento

        // extends -> herencia
        // extends -> extiende -> "es un"

        // Employee -> Es una subclase de Person
        // Person -> Es una super clase de Employee

        // Herencia = Especialización



    }
}
