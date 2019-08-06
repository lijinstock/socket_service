/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/8/6 18:59
 */

package com.li.socket;

public class PersonServiceImpl implements PersonService {

    @Override
    public String sayHello(String name) {
        return name + "hello!Welcome!";
    }
}
