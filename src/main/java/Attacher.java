import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class Attacher {
    public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException, AgentLoadException, AgentInitializationException {

        VirtualMachine vm = VirtualMachine.attach("13984"); // 目标 JVM pid
        vm.loadAgent("C:\\Users\\haoni.FAREAST\\IdeaProjects\\dynamicbytecode\\target\\dynamicbytecode-1.0-SNAPSHOT-jar-with-dependencies.jar");
    }
}