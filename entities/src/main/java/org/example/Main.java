package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        c.name = "Ian Souza";
        c.cpf = "00011122234";
        c.age = 19;

        System.out.println(c.name + "\n" + c.cpf + "\n" + c.age + " anos");
    }
}