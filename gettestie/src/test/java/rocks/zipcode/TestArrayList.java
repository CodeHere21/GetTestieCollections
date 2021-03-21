package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

import java.util.ArrayList;

public class TestArrayList{
    @Test
    public void TestArrayList1(){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Hello World");
        Assert.assertEquals(false,arrayList.isEmpty());
    }
    @Test
    public void TestArrayList2(){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Hello World");
        arrayList.remove(0);
        Assert.assertEquals(true,arrayList.isEmpty());
    }
    @Test
    public void TestArrayList3(){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Hello World");
        Assert.assertEquals(true, arrayList.contains("Hello World"));
    }

}
