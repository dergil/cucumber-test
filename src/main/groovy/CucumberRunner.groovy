import io.cucumber.core.cli.Main

import java.nio.file.Files
import java.nio.file.Paths

class CucumberRunner {
    static void main(String[] args) {
        // Create the target directory if it doesn't exist
        Files.createDirectories(Paths.get("target/cucumber-reports"))

        def options = [
                'src/test/resources', // Directory where feature files are located
                '--glue', 'src/test/groovy', // Package where step definitions are located
                '--plugin', "json:target/cucumber-reports/report.json" // JSON report output path
        ]

        Main.run(options as String[])
    }
}

