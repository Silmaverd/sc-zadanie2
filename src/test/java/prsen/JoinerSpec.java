package prsen;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

public class JoinerSpec {

    @Test
    public void joinsTwoStrings() {
        Joiner joiner = Joiner.on(" ");
        String joinedResult = joiner.join("Jan", "Kowalski");
        Assert.assertEquals("Jan Kowalski", joinedResult);
    }
}
