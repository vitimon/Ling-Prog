package ex13;

public class ConsCell {
    private int head;
    private ConsCell tail;
    public ConsCell(int h, ConsCell t) {
        head = h;
        tail = t;
    }
    public int getHead() {
        return head;
    }
    public ConsCell getTail() {
        return tail;
        }
    public void setTail(ConsCell t) {
        tail = t;
    }
}