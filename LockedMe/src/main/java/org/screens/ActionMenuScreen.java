package org.screens;

public class ActionMenuScreen implements Screen {

    @Override
    public void display() {
        System.out.println("1. Add a file");
        System.out.println("2. Delete a file");
        System.out.println("3. Search a file");
        System.out.println("4. Go back");
    }

    @Override
    public void processInput(int option) {

    }
}