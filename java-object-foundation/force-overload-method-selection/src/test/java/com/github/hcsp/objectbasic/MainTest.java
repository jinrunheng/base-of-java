package com.github.hcsp.objectbasic;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @CaptureSystemOutput
    public void correctMethodInvocation(CaptureSystemOutput.OutputCapture outputCapture) {
        outputCapture.expect(Matchers.containsString("I'm Number!"));
        Main.main(null);
    }
}
