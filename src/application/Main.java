package application;
import exceptions.NombreNegatifException;
import metier.*;
public class Main {
    public static void main(String[] args) throws NombreNegatifException {

        EntierNaturel en=new EntierNaturel(12);

        System.out.println(en.getVal());
        en.setVal(-12);
en.decrementer();

    }
}