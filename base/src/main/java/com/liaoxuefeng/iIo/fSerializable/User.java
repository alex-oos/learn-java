package com.liaoxuefeng.iIo.fSerializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author LiJiang
 * @since 2021/6/25 16:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = UUID.randomUUID().getMostSignificantBits();

    private String name;

    private int age;

}
