package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum VpnLocalIdentifier implements ValuedEnum {
    /** Device Fully Qualified Domain Name */
    DeviceFQDN("deviceFQDN"),
    /** Empty */
    Empty("empty"),
    /** Client Certificate Subject Name */
    ClientCertificateSubjectName("clientCertificateSubjectName");
    public final String value;
    VpnLocalIdentifier(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnLocalIdentifier forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceFQDN": return DeviceFQDN;
            case "empty": return Empty;
            case "clientCertificateSubjectName": return ClientCertificateSubjectName;
            default: return null;
        }
    }
}
