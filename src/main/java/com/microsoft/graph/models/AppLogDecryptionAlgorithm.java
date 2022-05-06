package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the createDownloadUrl method.  */
public enum AppLogDecryptionAlgorithm implements ValuedEnum {
    Aes256("aes256");
    public final String value;
    AppLogDecryptionAlgorithm(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppLogDecryptionAlgorithm forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aes256": return Aes256;
            default: return null;
        }
    }
}
