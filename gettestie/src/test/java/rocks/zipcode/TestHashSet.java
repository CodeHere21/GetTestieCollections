package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

import java.util.HashSet;

public class TestHashSet{
    @Test
    public void TestHashSet1() {
        HashSet<String> h = new HashSet<String>();
        h.add("Hello World");
        Assert.assertEquals(false, h.isEmpty());
    }
    @Test
    public void TestHashSet2(){
        HashSet<String> h=new HashSet<String>();
        h.add("Hello World");
        h.remove("Hello World");
        Assert.assertEquals(true,h.isEmpty());
    }
    @Test
    public void TestHashSet3() {
        HashSet<String> h = new HashSet<String>();
        h.add("Hello World");
        Assert.assertEquals(true, h.contains("Hello World"));
    }

}
