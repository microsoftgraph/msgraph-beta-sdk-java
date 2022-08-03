package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ReferenceAttachmentProvider implements ValuedEnum {
    Other("other"),
    OneDriveBusiness("oneDriveBusiness"),
    OneDriveConsumer("oneDriveConsumer"),
    Dropbox("dropbox");
    public final String value;
    ReferenceAttachmentProvider(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ReferenceAttachmentProvider forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "other": return Other;
            case "oneDriveBusiness": return OneDriveBusiness;
            case "oneDriveConsumer": return OneDriveConsumer;
            case "dropbox": return Dropbox;
            default: return null;
        }
    }
}
