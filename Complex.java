import java.util.*;

class Complex {
    
        int real,imaginary; 
        Complex ()
        {

        }
        Complex(int tempReal, int tempImaginary)
        {
            real = tempReal;
            imaginary = tempImaginary;
        }

        Complex addComp(Complex C1, Complex C2) 
        {
            Complex temp = new Complex();
            temp.real = C1.real + C2.real;
            temp.imaginary = C1.imaginary + C2.imaginary;

            return temp;
        }

        Complex sutractComp(Complex C1, Complex C2)
        {
            Complex temp = new Complex();
            temp.real = C1.real - C2.real;
            temp.imaginary = C1.imaginary - C2.imaginary;

            return temp;
        }

        
        {
            System.out.println("");
        }

    }

