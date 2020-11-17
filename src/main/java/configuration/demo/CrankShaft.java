package configuration.demo;

import java.util.Optional;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("my.engine.crank-shaft")
public class CrankShaft {
    public Optional<Double> getRodLength() {
        return rodLength;
    }

    public void setRodLength(Optional<Double> rodLength) {
        this.rodLength = rodLength;
    }

    private Optional<Double> rodLength = Optional.empty();
}
