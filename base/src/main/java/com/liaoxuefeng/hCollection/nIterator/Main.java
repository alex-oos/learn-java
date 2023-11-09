package com.liaoxuefeng.hCollection.nIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Alex
 * @since 2020/6/18 12:17
 * 
 */
public class Main {

    /*
    * 自己编写了一个集合类，想要使用for each循环，只需满足以下条件：

集合类实现Iterable接口，该接口要求返回一个Iterator对象；
用Iterator对象迭代集合内部数据。
    * */
    public static void main(String[] args) {
        ReverseList<String> rlist = new ReverseList<>();
        rlist.add("Apple");
        rlist.add("Orange");
        rlist.add("Pear");
        for (String s : rlist) {
            System.out.println(s);
        }
    }
}

class ReverseList<T> implements Iterable<T> {

    private final List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }
}
