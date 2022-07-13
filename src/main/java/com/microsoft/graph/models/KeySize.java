package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum KeySize implements ValuedEnum {
    /** 1024 Bits. */
    Size1024("size1024"),
    /** 2048 Bits. */
    Size2048("size2048"),
    /** 4096 Bits. */
    Size4096("size4096");
    public final String value;
    KeySize(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static KeySize forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "size1024": return Size1024;
            case "size2048": return Size2048;
            case "size4096": return Size4096;
            default: return null;
        }
    }
}
