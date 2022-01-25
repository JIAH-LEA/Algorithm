package Programmers;

public class Stack {
    node top;

    public Stack() {
        top = null;

    }

        public static void main (String args[]) throws Exception {
            Stack stck = new Stack();
            stck.push(10);
            stck.push(20);
            System.out.println(stck.pop());
            stck.push(30);
            System.out.println(stck.pop());
            System.out.println(stck.pop());
        }

    public void push(int d) {
        if (this.top == null)
            top = new node(d);
        else {
            node tmp = new node(d);
            this.top.next = tmp;
            tmp.prev = this.top;
            this.top = tmp;
        }
    }

    public int pop() {
        int d = 0;
        if (this.top != null) {
            d = this.top.data;
            node tmp = this.top.prev;
            if (tmp == null) {
                this.top = null;
            } else {
                this.top = null;
                this.top = tmp;
            }
        }
        return d;
    }
    }

