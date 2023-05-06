import java.util.LinkedList;

public class TodoList {
    private LinkedList<String> items;

    public TodoList() {
        this.items = new LinkedList<String>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(String item) {
        items.addLast(item);
    }

    public String dequeue() {
        return items.removeFirst();
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.enqueue("Bangun tidur");
        todoList.enqueue("Mandi pagi");
        todoList.enqueue("Sarapan pagi");
        todoList.enqueue("Bekerja");
        todoList.enqueue("Istirahat siang");
        todoList.enqueue("Bekerja lagi");
        todoList.enqueue("Makan malam");
        todoList.enqueue("Belajar atau bersantai");
        todoList.enqueue("Tidur");

        while (!todoList.isEmpty()) {
            System.out.println(todoList.dequeue());
        }
    }
}
