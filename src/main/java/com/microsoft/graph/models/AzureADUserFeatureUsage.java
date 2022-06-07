package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getAzureADUserFeatureUsage method. */
public class AzureADUserFeatureUsage extends Entity implements Parsable {
    /** The featureUsageDetails property */
    private java.util.List<FeatureUsageDetail> _featureUsageDetails;
    /** The lastUpdatedDateTime property */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The licenseAssigned property */
    private AzureADLicenseType _licenseAssigned;
    /** The licenseRecommended property */
    private AzureADLicenseType _licenseRecommended;
    /** The userDisplayName property */
    private String _userDisplayName;
    /** The userId property */
    private String _userId;
    /** The userPrincipalName property */
    private String _userPrincipalName;
    /**
     * Instantiates a new azureADUserFeatureUsage and sets the default values.
     * @return a void
     */
    public AzureADUserFeatureUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a azureADUserFeatureUsage
     */
    @javax.annotation.Nonnull
    public static AzureADUserFeatureUsage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADUserFeatureUsage();
    }
    /**
     * Gets the featureUsageDetails property value. The featureUsageDetails property
     * @return a featureUsageDetail
     */
    @javax.annotation.Nullable
    public java.util.List<FeatureUsageDetail> getFeatureUsageDetails() {
        return this._featureUsageDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AzureADUserFeatureUsage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("featureUsageDetails", (n) -> { currentObject.setFeatureUsageDetails(n.getCollectionOfObjectValues(FeatureUsageDetail::createFromDiscriminatorValue)); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("licenseAssigned", (n) -> { currentObject.setLicenseAssigned(n.getEnumValue(AzureADLicenseType.class)); });
            this.put("licenseRecommended", (n) -> { currentObject.setLicenseRecommended(n.getEnumValue(AzureADLicenseType.class)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the licenseAssigned property value. The licenseAssigned property
     * @return a azureADLicenseType
     */
    @javax.annotation.Nullable
    public AzureADLicenseType getLicenseAssigned() {
        return this._licenseAssigned;
    }
    /**
     * Gets the licenseRecommended property value. The licenseRecommended property
     * @return a azureADLicenseType
     */
    @javax.annotation.Nullable
    public AzureADLicenseType getLicenseRecommended() {
        return this._licenseRecommended;
    }
    /**
     * Gets the userDisplayName property value. The userDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("featureUsageDetails", this.getFeatureUsageDetails());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeEnumValue("licenseAssigned", this.getLicenseAssigned());
        writer.writeEnumValue("licenseRecommended", this.getLicenseRecommended());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the featureUsageDetails property value. The featureUsageDetails property
     * @param value Value to set for the featureUsageDetails property.
     * @return a void
     */
    public void setFeatureUsageDetails(@javax.annotation.Nullable final java.util.List<FeatureUsageDetail> value) {
        this._featureUsageDetails = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the licenseAssigned property value. The licenseAssigned property
     * @param value Value to set for the licenseAssigned property.
     * @return a void
     */
    public void setLicenseAssigned(@javax.annotation.Nullable final AzureADLicenseType value) {
        this._licenseAssigned = value;
    }
    /**
     * Sets the licenseRecommended property value. The licenseRecommended property
     * @param value Value to set for the licenseRecommended property.
     * @return a void
     */
    public void setLicenseRecommended(@javax.annotation.Nullable final AzureADLicenseType value) {
        this._licenseRecommended = value;
    }
    /**
     * Sets the userDisplayName property value. The userDisplayName property
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
