package metier;

import exceptions.NombreNegatifException;

public class EntierNaturel {

    private int val;

    public EntierNaturel(int val) throws NombreNegatifException{
        if(val<0){
            throw new NombreNegatifException("le nombre est negatif");
        }
        this.val=val;
    }


    public int getVal() {
        return val;
    }


    public void setVal(int val) throws NombreNegatifException{
        if(val<0){
            throw new NombreNegatifException("le nombre est negatif");
        }
        this.val = val;
    }

    public void decrementer()throws NombreNegatifException{
if(val<0){
            throw new NombreNegatifException("le nombre est negatif");
        }
        System.out.println(val);
        val--;
    }







}
