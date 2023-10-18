package com.liaoxuefeng.gGeneric;

/**
 * @autoer Alex
 * @since: 2020/6/8 18:32
 * @Descprition: ，泛型类型<T>不能用于静态方法
 */
class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public Pair<T> create(T first, T last) {
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
