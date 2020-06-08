package com.liaoxuefeng.day14;

/**
 * @Auther: 李将
 * @Date: 2020/6/8 18:32
 * @Descprition:
 */
public class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public static Pair<T> create(T first, T last) {
        return new Pair<T>(first, last);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }
}
