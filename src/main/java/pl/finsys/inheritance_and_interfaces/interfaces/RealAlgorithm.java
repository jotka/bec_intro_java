package pl.finsys.inheritance_and_interfaces.interfaces;

public class RealAlgorithm implements ComplexAlgorithm {

    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 * number2;
    }

}