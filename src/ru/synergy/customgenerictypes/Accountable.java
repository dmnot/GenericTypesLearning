package ru.synergy.customgenerictypes;

public interface Accountable<T> {
    T getId();
    void setId();
    void setSum(int sum);
    int getSum();

}
