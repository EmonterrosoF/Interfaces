package com.interfaces;

public class CocheCRUDImpl implements ICocheCRUD {

    @Override
    public void save() {
        System.out.println("save");
        
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
        
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
    
}
