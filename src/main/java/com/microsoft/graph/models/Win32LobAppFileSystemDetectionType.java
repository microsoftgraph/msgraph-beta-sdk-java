package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum Win32LobAppFileSystemDetectionType implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Whether the specified file or folder exists. */
    Exists("exists"),
    /** Last modified date. */
    ModifiedDate("modifiedDate"),
    /** Created date. */
    CreatedDate("createdDate"),
    /** Version value type. */
    Version("version"),
    /** Size detection type. */
    SizeInMB("sizeInMB"),
    /** The specified file or folder does not exist. */
    DoesNotExist("doesNotExist");
    public final String value;
    Win32LobAppFileSystemDetectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Win32LobAppFileSystemDetectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "exists": return Exists;
            case "modifiedDate": return ModifiedDate;
            case "createdDate": return CreatedDate;
            case "version": return Version;
            case "sizeInMB": return SizeInMB;
            case "doesNotExist": return DoesNotExist;
            default: return null;
        }
    }
}
