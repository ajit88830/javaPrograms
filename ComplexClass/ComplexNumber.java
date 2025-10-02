package ComplexClass;

public class ComplexNumber {
    private int real;
    private int img;

    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }
    public ComplexNumber(int real) {
        this(real,0);
    
    }
    public ComplexNumber multiply(ComplexNumber other) {
        int newReal = this.real * other.real - this.img * other.img;
        int newImg = this.real * other.img + this.img * other.real;
        return new ComplexNumber(newReal,newImg);
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        if(img==0)
            return ""+this.real;
        
        else if(this.img<0){
            return "" + this.real + " "+ this.img+ "i"  ;
        }
        
        return "" + this.real + " + "+this.img+ "i" ;
    }

}
