package za.co.bmw;

import org.junit.Assert;
import org.junit.Test;
import za.co.bmw.exception.StackException;

public class StackImplTest {

    @Test
    public void push() {
        StackImpl<Integer> s = new StackImpl<>(3);
        s.push(42);
        Assert.assertEquals(1, s.count());
        s.push(66);
        Assert.assertEquals(2, s.count());
        s.push(99);
        Assert.assertEquals(3, s.count());
    }

    @Test
    public void popTestWithInt() {
        StackImpl<Integer> s = new StackImpl<>(3);
        s.push(42);
        s.push(66);
        s.push(99);
        Assert.assertEquals(java.util.Optional.of(99).get(), s.pop());
        Assert.assertEquals(java.util.Optional.of(66).get(), s.pop());
        Assert.assertEquals(java.util.Optional.of(42).get(), s.pop());
        Assert.assertTrue(s.empty());
    }

    @Test
    public void popTestWithString() {
        StackImpl<String> s = new StackImpl<>(3);
        s.push("Mrunmaya");
        s.push("John");
        s.push("Peter");
        Assert.assertEquals("Peter", s.pop());
        Assert.assertEquals("John", s.pop());
        Assert.assertEquals("Mrunmaya", s.pop());
        Assert.assertTrue(s.empty());
    }

    @Test(expected = StackException.class)
    public void popTestWithEmptyStack() {
        StackImpl<Integer> s = new StackImpl<>(3);
        s.push(11);
        s.push(22);
        s.push(33);
        Assert.assertEquals(java.util.Optional.of(33).get(), s.pop());
        Assert.assertEquals(java.util.Optional.of(22).get(), s.pop());
        Assert.assertEquals(java.util.Optional.of(11).get(), s.pop());
        Assert.assertTrue(s.empty());
        s.pop();
    }

    @Test
    public void empty() {
        StackImpl<Integer> s = new StackImpl<>(1);

        Assert.assertTrue(s.empty());
        Assert.assertEquals(0, s.count());

        s.push(42);

        Assert.assertFalse(s.empty());
        Assert.assertEquals(1, s.count());
    }

    @Test
    public void count() {
        StackImpl<Integer> s = new StackImpl<>(1);
        Assert.assertEquals(0, s.count());
        s.push(42);
        Assert.assertEquals(1, s.count());
    }
}