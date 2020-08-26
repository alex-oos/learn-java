package com.liaoxuefeng.hCollection.cMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 李将
 * @since: 2020/6/11 11:19
 * @Descprition:
 */
public class Students {

    List<Student> list;
    Map<String, Integer> cache;

    public Students(List<Student> list) {
        this.list = list;
        cache = new HashMap<>();
    }
    /*
     * 根据name 查找到score，找到返回score，未找到返回-1
     * */

    public int getScore(String name) {

        Integer score = this.cache.get(name);
        if (score == null) {
            // 如果在Map中找不到，再在List中找

            score = this.findInList(name);
            if (score != null) {
                // 如果在List中找到，更新到Map中。
                cache.put(name, score);
            }
        }
        return score == null ? -1 : score.intValue();
    }

    public Integer findInList(String name) {
        for (var ss : this.list) {
            if (ss.getName().equals(name)) {
                return ss.getScore();
            }
        }
        return null;
    }
}
