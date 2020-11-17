package configuration.demo;

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
}


