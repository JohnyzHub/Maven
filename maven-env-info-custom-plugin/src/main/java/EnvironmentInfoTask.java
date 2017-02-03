import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by shaikjb on 2/2/2017.
 */

/**
 * @goal env-info
 */
public class EnvironmentInfoTask extends AbstractMojo {

    /**
     * @parameter
     *  default-value="log.txt"
     *  expression="${CustomPluginLog}"
     */
    private String fileName;

    /**
     * @parameter
     *  default-value="c:\\spe"
     *  expression="${environment.base_dir}"
     */
    private File baseDirectory;

    /**
     * @parameter
     *  default-value="true"
     *  expression="${environment.loggingRequired}"
     */
    private boolean loggingRequired;

    public void execute() throws MojoExecutionException, MojoFailureException {

        StringBuilder fileContents = new StringBuilder();

        if (baseDirectory.exists()) {
            baseDirectory.mkdirs();
            log("Created base directory '" + baseDirectory.getAbsolutePath() + "'");
        }

        Map<String, String> environment = System.getenv();
        Iterator<Map.Entry<String, String>> entries = environment.entrySet().iterator();

        fileContents.append("Environment Information:" + newLine());
        fileContents.append("-----------------------------------------------------------" + newLine());

        while (entries.hasNext()) {

            Map.Entry<String, String> entry = entries.next();
            fileContents.append(entry.getKey() + "------------->;" + entry.getValue() + newLine());
        }

        fileContents.append("-----------------------------------------------------------" + newLine());
        writeToFile(fileContents);
        log("File contents written");
    }

    private void log(String message) {

        if (loggingRequired) {
            System.out.println(message);
        }
    }

    private static String newLine() {
        return System.getProperty("line.separator");
    }

    private void writeToFile(StringBuilder fileContents) {

        FileWriter fWriter = null;
        BufferedWriter bWriter = null;

        try {
            fWriter = new FileWriter(baseDirectory + File.separator + fileName);
            bWriter = new BufferedWriter(fWriter);
            bWriter.write(fileContents.toString());
        } catch (Exception e) {
            log("Error in writing the contents to file ->;" + e.getMessage());
        } finally {
            try {
                if (bWriter != null) {
                    bWriter.close();
                }
                if (fWriter != null) {
                    fWriter.close();
                }
            } catch (Exception e) {
                log("Error in closing the resources ->;" + e.getMessage());
            }
        }
    }
}
