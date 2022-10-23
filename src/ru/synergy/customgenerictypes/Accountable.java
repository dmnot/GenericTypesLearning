package ru.synergy.customgenerictypes;

public interface Accountable<T> {
    T getId();
    T setId();
    void setSum(int sum);
    int getSum();

}
