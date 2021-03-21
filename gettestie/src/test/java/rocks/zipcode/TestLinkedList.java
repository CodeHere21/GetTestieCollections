package rocks.zipcode;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList{
    @Test
    public void TestList1() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello world");
        Assert.assertEquals(false,list.isEmpty()); // false
    }
    @Test
    public void TestList2(){
        LinkedList<String> list = new LinkedList<String>();
        list.push("Hello World");
        Assert.assertEquals(false,list.isEmpty());
    }
    @Test
    public void TestList3(){
        LinkedList<String> list = new LinkedList<>();
        list.push("Hello World");
        list.pop();
        Assert.assertEquals(true,list.isEmpty());
    }
    @Test
    public void TestList4(){
        LinkedList<String> list = new LinkedList<>();
        list.push("Hello World");
        list.peek();
        Assert.assertEquals(false,list.isEmpty());
    }
}
