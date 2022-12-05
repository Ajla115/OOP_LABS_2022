package com.AdditionalTasks;

public class ClassForCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.mutator(10);
        counter.printCount();
        counter.mutator(-11);
        counter.printCount();
        counter.incMutator();
        counter.incMutator();
        counter.incMutator();
        counter.printCount();
        counter.decMutator();
        counter.printCount();

    }
}

