package com.interfaces;
public class Main {
    public static void main(String[] args) throws Exception {
        ICocheCRUD coche = new CocheCRUDImpl();

        coche.save();
        coche.findAll();
        coche.delete();
    }
}
