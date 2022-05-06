package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum MicrosoftStoreForBusinessPortalSelectionOptions implements ValuedEnum {
    None("none"),
    CompanyPortal("companyPortal"),
    PrivateStore("privateStore");
    public final String value;
    MicrosoftStoreForBusinessPortalSelectionOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftStoreForBusinessPortalSelectionOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "companyPortal": return CompanyPortal;
            case "privateStore": return PrivateStore;
            default: return null;
        }
    }
}
