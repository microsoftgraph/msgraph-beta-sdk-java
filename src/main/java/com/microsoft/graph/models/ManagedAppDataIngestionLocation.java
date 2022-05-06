package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ManagedAppDataIngestionLocation implements ValuedEnum {
    OneDriveForBusiness("oneDriveForBusiness"),
    SharePoint("sharePoint"),
    Camera("camera");
    public final String value;
    ManagedAppDataIngestionLocation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppDataIngestionLocation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneDriveForBusiness": return OneDriveForBusiness;
            case "sharePoint": return SharePoint;
            case "camera": return Camera;
            default: return null;
        }
    }
}
