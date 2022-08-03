package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of office Client configuration. */
    private java.util.List<OfficeClientConfiguration> _clientConfigurations;
    /** The OdataType property */
    private String _odataType;
    /** List of office Client check-in status. */
    private java.util.List<OfficeClientCheckinStatus> _tenantCheckinStatuses;
    /** Entity that describes tenant check-in statues */
    private OfficeUserCheckinSummary _tenantUserCheckinSummary;
    /**
     * Instantiates a new OfficeConfiguration and sets the default values.
     * @return a void
     */
    public OfficeConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.officeConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfficeConfiguration
     */
    @javax.annotation.Nonnull
    public static OfficeConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeConfiguration();
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
     * Gets the clientConfigurations property value. List of office Client configuration.
     * @return a officeClientConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeClientConfiguration> getClientConfigurations() {
        return this._clientConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeConfiguration currentObject = this;
        return new HashMap<>(4) {{
            this.put("clientConfigurations", (n) -> { currentObject.setClientConfigurations(n.getCollectionOfObjectValues(OfficeClientConfiguration::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("tenantCheckinStatuses", (n) -> { currentObject.setTenantCheckinStatuses(n.getCollectionOfObjectValues(OfficeClientCheckinStatus::createFromDiscriminatorValue)); });
            this.put("tenantUserCheckinSummary", (n) -> { currentObject.setTenantUserCheckinSummary(n.getObjectValue(OfficeUserCheckinSummary::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the tenantCheckinStatuses property value. List of office Client check-in status.
     * @return a officeClientCheckinStatus
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeClientCheckinStatus> getTenantCheckinStatuses() {
        return this._tenantCheckinStatuses;
    }
    /**
     * Gets the tenantUserCheckinSummary property value. Entity that describes tenant check-in statues
     * @return a officeUserCheckinSummary
     */
    @javax.annotation.Nullable
    public OfficeUserCheckinSummary getTenantUserCheckinSummary() {
        return this._tenantUserCheckinSummary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("clientConfigurations", this.getClientConfigurations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("tenantCheckinStatuses", this.getTenantCheckinStatuses());
        writer.writeObjectValue("tenantUserCheckinSummary", this.getTenantUserCheckinSummary());
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
     * Sets the clientConfigurations property value. List of office Client configuration.
     * @param value Value to set for the clientConfigurations property.
     * @return a void
     */
    public void setClientConfigurations(@javax.annotation.Nullable final java.util.List<OfficeClientConfiguration> value) {
        this._clientConfigurations = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tenantCheckinStatuses property value. List of office Client check-in status.
     * @param value Value to set for the tenantCheckinStatuses property.
     * @return a void
     */
    public void setTenantCheckinStatuses(@javax.annotation.Nullable final java.util.List<OfficeClientCheckinStatus> value) {
        this._tenantCheckinStatuses = value;
    }
    /**
     * Sets the tenantUserCheckinSummary property value. Entity that describes tenant check-in statues
     * @param value Value to set for the tenantUserCheckinSummary property.
     * @return a void
     */
    public void setTenantUserCheckinSummary(@javax.annotation.Nullable final OfficeUserCheckinSummary value) {
        this._tenantUserCheckinSummary = value;
    }
}
