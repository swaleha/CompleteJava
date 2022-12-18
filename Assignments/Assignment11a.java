/*
 * Print sum, difference and product of two complex numbers
 */

import java.util.*;
public class Assignment11a {
    public static void main(String[] args) {
        Complex c = new Complex(9, 5);
        Complex d = new Complex(9, 4);
        //c.add(4, 5);

        Complex e = Complex.add(c, d);
        e.printComplex();

        Complex f = Complex.diff(c, d);
        f.printComplex();

        Complex g = Complex.prod(c, d);
        g.printComplex();

    }
}

class Complex{
    int real;
    int imag;

    public Complex(int r, int i){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }

    public static Complex prod(Complex a, Complex b){
        return new Complex(((a.real*b.real) - (a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex(){
        if(real == 0 & imag != 0){
            System.out.println(imag + "i");
        } else if(imag == 0 & real !=0){
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}

