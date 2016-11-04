package amgen.com.jenkinstest.model;

import org.junit.Assert;
import org.junit.Test;

import amgen.com.jenkinstest.BuildConfig;
import amgen.com.jenkinstest.MainActivity;


/**
 * Created by 538280 on 10/26/2016.
 */

public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();
        u.setName("foo");
        Assert.assertEquals("foo", u.getName());
    }


    @Test
    public void UserNameTest1() {
        User u = new User();
        u.setName("Srini");
        Assert.assertEquals("Thaha", u.getName());
    }

}