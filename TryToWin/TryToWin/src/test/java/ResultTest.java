import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class ResultTest implements TestWatcher {

    Log log = new Log();
    @Override
    public void testSuccessful(ExtensionContext context)
    {
        String methodName = context.getDisplayName();
        log.infor(methodName+"Passed");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause)
    {
        String methodName = context.getDisplayName();
        String testFailCause = cause.getMessage();
        log.infor(methodName+"Failed because:" + testFailCause);
    }
}
