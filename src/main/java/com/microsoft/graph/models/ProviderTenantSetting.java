package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProviderTenantSetting extends Entity implements Parsable {
    /**
     * The azureTenantId property
     */
    private String azureTenantId;
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The provider property
     */
    private String provider;
    /**
     * The vendor property
     */
    private String vendor;
    /**
     * Instantiates a new ProviderTenantSetting and sets the default values.
     */
    public ProviderTenantSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProviderTenantSetting
     */
    @jakarta.annotation.Nonnull
    public static ProviderTenantSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProviderTenantSetting();
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.azureTenantId;
    }
    /**
     * Gets the enabled property value. The enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("vendor", (n) -> { this.setVendor(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the vendor property value. The vendor property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVendor() {
        return this.vendor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("vendor", this.getVendor());
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.azureTenantId = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     */
    public void setVendor(@jakarta.annotation.Nullable final String value) {
        this.vendor = value;
    }
}
