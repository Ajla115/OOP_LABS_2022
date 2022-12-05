package com.AdditionalTasks;

public class Counter {
    private int count = 0;

    public void incMutator(){
        this.mutator(1);
    }
    public void decMutator(){
        this.mutator(-1);
    }

    public void mutator(int count){
        if(this.count + count > 0){
            this.count += count;
        }
        else {
            this.count = 0;
        }
    }

    public int getCount(){
        return this.count;
    }

    public void printCount(){
        System.out.println(this.count);
    }
}
