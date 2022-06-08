package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getAzureADLicenseUsage method. */
public class AzureADLicenseUsage extends Entity implements Parsable {
    /** The licenseInfoDetails property */
    private java.util.List<LicenseInfoDetail> _licenseInfoDetails;
    /** The snapshotDateTime property */
    private OffsetDateTime _snapshotDateTime;
    /**
     * Instantiates a new azureADLicenseUsage and sets the default values.
     * @return a void
     */
    public AzureADLicenseUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a azureADLicenseUsage
     */
    @javax.annotation.Nonnull
    public static AzureADLicenseUsage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADLicenseUsage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AzureADLicenseUsage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("licenseInfoDetails", (n) -> { currentObject.setLicenseInfoDetails(n.getCollectionOfObjectValues(LicenseInfoDetail::createFromDiscriminatorValue)); });
            this.put("snapshotDateTime", (n) -> { currentObject.setSnapshotDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the licenseInfoDetails property value. The licenseInfoDetails property
     * @return a licenseInfoDetail
     */
    @javax.annotation.Nullable
    public java.util.List<LicenseInfoDetail> getLicenseInfoDetails() {
        return this._licenseInfoDetails;
    }
    /**
     * Gets the snapshotDateTime property value. The snapshotDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSnapshotDateTime() {
        return this._snapshotDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("licenseInfoDetails", this.getLicenseInfoDetails());
        writer.writeOffsetDateTimeValue("snapshotDateTime", this.getSnapshotDateTime());
    }
    /**
     * Sets the licenseInfoDetails property value. The licenseInfoDetails property
     * @param value Value to set for the licenseInfoDetails property.
     * @return a void
     */
    public void setLicenseInfoDetails(@javax.annotation.Nullable final java.util.List<LicenseInfoDetail> value) {
        this._licenseInfoDetails = value;
    }
    /**
     * Sets the snapshotDateTime property value. The snapshotDateTime property
     * @param value Value to set for the snapshotDateTime property.
     * @return a void
     */
    public void setSnapshotDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._snapshotDateTime = value;
    }
}
