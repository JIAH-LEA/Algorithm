package Programmers;

public class node {
    public int data;
    public node next;
    public node prev;

    public node(){
        this.data=0;
        this.prev=null;
        this.next=null;
    }

    public node(int d){
        this.data=d;
        this.prev=null;
        this.next=null;
    }
}
