package configuration.demo;

import javax.inject.Inject;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "configuration-demo", description = "...", mixinStandardHelpOptions = true)
public class ConfigurationDemoCommand implements Runnable {

    @Inject
    EngineConfig config;

    public void run() {
        System.out.println("Config = " + config);
    }

    public static void main(String[] args) {
        PicocliRunner.run(ConfigurationDemoCommand.class, args);
    }
}
