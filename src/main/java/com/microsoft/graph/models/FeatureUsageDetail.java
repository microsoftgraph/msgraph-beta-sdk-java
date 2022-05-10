package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FeatureUsageDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The featureName property */
    private String _featureName;
    /** The lastConfiguredDateTime property */
    private OffsetDateTime _lastConfiguredDateTime;
    /** The lastUsedDateTime property */
    private OffsetDateTime _lastUsedDateTime;
    /** The licenseAssigned property */
    private AzureADLicenseType _licenseAssigned;
    /** The licenseRequired property */
    private AzureADLicenseType _licenseRequired;
    /**
     * Instantiates a new featureUsageDetail and sets the default values.
     * @return a void
     */
    public FeatureUsageDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a featureUsageDetail
     */
    @javax.annotation.Nonnull
    public static FeatureUsageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureUsageDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the featureName property value. The featureName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeatureName() {
        return this._featureName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FeatureUsageDetail currentObject = this;
        return new HashMap<>(5) {{
            this.put("featureName", (n) -> { currentObject.setFeatureName(n.getStringValue()); });
            this.put("lastConfiguredDateTime", (n) -> { currentObject.setLastConfiguredDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastUsedDateTime", (n) -> { currentObject.setLastUsedDateTime(n.getOffsetDateTimeValue()); });
            this.put("licenseAssigned", (n) -> { currentObject.setLicenseAssigned(n.getEnumValue(AzureADLicenseType.class)); });
            this.put("licenseRequired", (n) -> { currentObject.setLicenseRequired(n.getEnumValue(AzureADLicenseType.class)); });
        }};
    }
    /**
     * Gets the lastConfiguredDateTime property value. The lastConfiguredDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConfiguredDateTime() {
        return this._lastConfiguredDateTime;
    }
    /**
     * Gets the lastUsedDateTime property value. The lastUsedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUsedDateTime() {
        return this._lastUsedDateTime;
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
     * Gets the licenseRequired property value. The licenseRequired property
     * @return a azureADLicenseType
     */
    @javax.annotation.Nullable
    public AzureADLicenseType getLicenseRequired() {
        return this._licenseRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("featureName", this.getFeatureName());
        writer.writeOffsetDateTimeValue("lastConfiguredDateTime", this.getLastConfiguredDateTime());
        writer.writeOffsetDateTimeValue("lastUsedDateTime", this.getLastUsedDateTime());
        writer.writeEnumValue("licenseAssigned", this.getLicenseAssigned());
        writer.writeEnumValue("licenseRequired", this.getLicenseRequired());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the featureName property value. The featureName property
     * @param value Value to set for the featureName property.
     * @return a void
     */
    public void setFeatureName(@javax.annotation.Nullable final String value) {
        this._featureName = value;
    }
    /**
     * Sets the lastConfiguredDateTime property value. The lastConfiguredDateTime property
     * @param value Value to set for the lastConfiguredDateTime property.
     * @return a void
     */
    public void setLastConfiguredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConfiguredDateTime = value;
    }
    /**
     * Sets the lastUsedDateTime property value. The lastUsedDateTime property
     * @param value Value to set for the lastUsedDateTime property.
     * @return a void
     */
    public void setLastUsedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUsedDateTime = value;
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
     * Sets the licenseRequired property value. The licenseRequired property
     * @param value Value to set for the licenseRequired property.
     * @return a void
     */
    public void setLicenseRequired(@javax.annotation.Nullable final AzureADLicenseType value) {
        this._licenseRequired = value;
    }
}
