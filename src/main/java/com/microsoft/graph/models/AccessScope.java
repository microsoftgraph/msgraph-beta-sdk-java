package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the evaluate method.  */
public enum AccessScope implements ValuedEnum {
    InOrganization("inOrganization"),
    NotInOrganization("notInOrganization");
    public final String value;
    AccessScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inOrganization": return InOrganization;
            case "notInOrganization": return NotInOrganization;
            default: return null;
        }
    }
}
