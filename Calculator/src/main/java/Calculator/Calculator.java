package Calculator;

import java.sql.Array;
import java.util.Optional;
import java.util.stream.IntStream;

public class Calculator{

    public static final SumInterface sumFunction = (a, b) -> a+b;
    public static final SubstractInterface substractFunction = (a, b) -> a-b;

    public static final MultiplyInterface multiplyFunction = (a, b) -> IntStream.iterate(0, x -> sumFunction.sum(x, a)).limit(Math.abs(b)+1).reduce((num1, num2) -> num2).getAsInt();
    public static final DivideInterface divideFunction = (a,b) -> a==0 ? 0 : b==1 ? a : b==0 ? -1 :IntStream.rangeClosed(0,a).reduce((x,y) -> substractFunction.substract(a,x)>=0 ? sumFunction.sum(x,b) : 0);




    public static void main(String[] args) {
//        System.out.println(sumFunction.sum(1,3));
//        System.out.println(substractFunction.substract(3,3));
//        System.out.println(multiplyFunction.multiply(6,-6));
        System.out.println(divideFunction.divide(10,2));
        System.out.println(IntStream.range(1, 5));
    };


    }

