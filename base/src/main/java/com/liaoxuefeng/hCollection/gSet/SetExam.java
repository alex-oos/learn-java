package com.liaoxuefeng.hCollection.gSet;

import java.util.*;

/**
 * @author: 李将
 * @since: 2020/6/15 下午 11:35
 * @Descprition: 在聊天软件中，发送方发送消息时，遇到网络超时后就会自动重发，因此，接收方可能会收到重复的消息，在显示给用户看的时候，需要首先去重。请练习使用Set去除重复的消息：
 */
public class SetExam {

    public static void function() {
        List<Message> received = List.of(
                new Message(1, "hello"),
                new Message(2, "world"),
                new Message(3, "发工资了么？"),
                new Message(4, "Bye")
        );

        List<Message> dispalyMessage = process(received);
        for (Message message : dispalyMessage) {
            System.out.println("message = " + message.text);
        }

    }


    public static List<Message> process(List<Message> received) {

        // 按sequence去除重复消息

        List<Message> list = new ArrayList<>(received.size());

        SortedSet<Message> set = new TreeSet<>(new Comparator<Message>() {

            @Override
            public int compare(Message m1, Message m2) {

                //第一种方法

                /*if (m1.sequence == m2.sequence)

                    return 0;

                return m1.sequence < m2.sequence ?  -1 : 1;}*/

                //第二种方法

                return Integer.compare(m1.sequence, m2.sequence);
            }

        });

        set.addAll(received);

        list.addAll(set);

        return list;

    }


    public static void main(String[] args) {
        function();
    }
}

class Message {

    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}