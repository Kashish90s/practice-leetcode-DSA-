package org.example;

public class Stack {

    private int array[];
    private int capacity;
    private int top;

    Stack(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }


    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return array[top--];
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }
}
