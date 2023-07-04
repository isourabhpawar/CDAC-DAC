public class Main {
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);
        System.out.println("ins: " + cq.insert(10));
        System.out.println("ins: " + cq.insert(20));
        System.out.println("ins: " + cq.insert(30));
        System.out.println("ins: " + cq.insert(40));
        System.out.println("ins: " + cq.insert(50));
        System.out.println("ins: " + cq.insert(60));

        System.out.println("del: " + cq.delete());
        System.out.println("ins: " + cq.insert(60));

        /*Queue q = new Queue(5);

        System.out.println("ins: " + q.insert(10));
        System.out.println("ins: " + q.insert(20));
        System.out.println("ins: " + q.insert(30));

        System.out.println("del: " + q.delete());
        System.out.println("del: " + q.delete());
        System.out.println("del: " + q.delete());
        System.out.println("del: " + q.delete());

        System.out.println("ins: " + q.insert(40));
        System.out.println("ins: " + q.insert(50));
        System.out.println("ins: " + q.insert(10));
        System.out.println("del: " + q.delete());
        System.out.println("del: " + q.delete());
        System.out.println("del: " + q.delete());

        System.out.println("isEmpty: " + q.isEmpty() + " isFull: " + q.isFull());*/
    }
}
