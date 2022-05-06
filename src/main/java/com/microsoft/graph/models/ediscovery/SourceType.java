package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton.  */
public enum SourceType implements ValuedEnum {
    Mailbox("mailbox"),
    Site("site");
    public final String value;
    SourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mailbox": return Mailbox;
            case "site": return Site;
            default: return null;
        }
    }
}
