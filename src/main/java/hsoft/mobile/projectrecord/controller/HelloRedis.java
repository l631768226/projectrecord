package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.model.User;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import redis.clients.jedis.Commands;
import redis.clients.jedis.Jedis;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HelloRedis {
    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] bs = "".getBytes();
        String a = new String(bs);
        User user = new User();
        user.setUsername(null);
        if("".equals(a.trim())){
            a = "a";
        }
        System.out.println("the result = " + a);

    }
}
