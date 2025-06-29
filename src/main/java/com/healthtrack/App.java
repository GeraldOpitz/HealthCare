package com.healthtrack;

public class App {

    public static void main(String[] args) {
        Usuario user = new Usuario("Gerald", 80);
        user.mostrarInformacion();
        user.actualizarPeso(75);
        user.mostrarInformacion();

    }
}
