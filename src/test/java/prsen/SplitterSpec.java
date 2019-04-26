package prsen;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

public class SplitterSpec {

    @Test
    public void splitsAString() {
        Splitter splitter = Splitter.on(" ");
        List<String> splitResult = splitter.splitToList("Jan Kowalski");

        Assert.assertEquals(splitResult, Arrays.asList("Jan", "Kowalski"));
    }

}
