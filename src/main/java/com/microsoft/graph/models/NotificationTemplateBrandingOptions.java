package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum NotificationTemplateBrandingOptions implements ValuedEnum {
    None("none"),
    IncludeCompanyLogo("includeCompanyLogo"),
    IncludeCompanyName("includeCompanyName"),
    IncludeContactInformation("includeContactInformation"),
    IncludeCompanyPortalLink("includeCompanyPortalLink");
    public final String value;
    NotificationTemplateBrandingOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NotificationTemplateBrandingOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "includeCompanyLogo": return IncludeCompanyLogo;
            case "includeCompanyName": return IncludeCompanyName;
            case "includeContactInformation": return IncludeContactInformation;
            case "includeCompanyPortalLink": return IncludeCompanyPortalLink;
            default: return null;
        }
    }
}
