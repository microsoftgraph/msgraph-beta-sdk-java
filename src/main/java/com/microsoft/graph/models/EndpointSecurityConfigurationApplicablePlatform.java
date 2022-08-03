package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum EndpointSecurityConfigurationApplicablePlatform implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** MacOS. */
    MacOS("macOS"),
    /** Windows 10 and later. */
    Windows10AndLater("windows10AndLater"),
    /** Windows 10 and Windows Server. */
    Windows10AndWindowsServer("windows10AndWindowsServer");
    public final String value;
    EndpointSecurityConfigurationApplicablePlatform(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EndpointSecurityConfigurationApplicablePlatform forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "macOS": return MacOS;
            case "windows10AndLater": return Windows10AndLater;
            case "windows10AndWindowsServer": return Windows10AndWindowsServer;
            default: return null;
        }
    }
}
