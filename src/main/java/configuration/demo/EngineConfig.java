package configuration.demo;

import java.util.Optional;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("my.engine")
public class EngineConfig {
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public CrankShaft getCrankShaft() {
        return crankShaft;
    }

    public void setCrankShaft(CrankShaft crankShaft) {
        this.crankShaft = crankShaft;
    }

    @NotBlank
    private String manufacturer = "Ford";
    @Min(1L)
    private int cylinders;
    private CrankShaft crankShaft = new CrankShaft();

    @ConfigurationProperties("crank-shaft")
    public static class CrankShaft {
        public Optional<Double> getRodLength() {
            return rodLength;
        }

        public void setRodLength(Optional<Double> rodLength) {
            this.rodLength = rodLength;
        }

        private Optional<Double> rodLength = Optional.empty();
    }
}


