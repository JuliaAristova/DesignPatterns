package org.behavioral.strategyPattern;

public interface Strategy {
    int doOperation(int n1, int n2);
}

class OperationAdd implements Strategy {

    @Override
    public int doOperation(int n1, int n2) {
        return n1 + n2;
    }
}

class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int n1, int n2) {
        return n1 - n2;
    }
}

class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int n1, int n2) {
        return n1 * n2;
    }
}