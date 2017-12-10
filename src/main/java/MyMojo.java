import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "sayhi" , defaultPhase = LifecyclePhase.GENERATE_SOURCES, threadSafe = true)
public class MyMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        getLog().info("------------<<<<<<<<<<<<<<<<<<<<<<<<<Hello, world.");
    }
}