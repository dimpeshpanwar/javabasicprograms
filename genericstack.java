public GenericStack(int capacity) {
    data = new Object[capacity];
}
public void push(T element) {
    if (top == data.length - 1) {
        throw new IllegalStateException("Stack overflow");
    }
    data[++top] = element;
}
@SuppressWarnings("unchecked")
public T pop() {
    if (top < 0) throw new EmptyStackException();
    T element = (T) data[top];
    data[top--] = null;
    return element;
}
public boolean isEmpty() {
    return top < 0;
}
public T peek() {
    if (top < 0) throw new EmptyStackException();
    return (T) data[top];
}
