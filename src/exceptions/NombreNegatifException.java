package exceptions;

public class NombreNegatifException extends Exception {

private int val;
    public NombreNegatifException(String msg,int val) {
        super(msg);
        this.val=val;
    }

    public int getVal() {
        return val;
    }
}
