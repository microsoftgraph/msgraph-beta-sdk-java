package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantAccess implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CrossTenantAccess} and sets the default values.
     */
    public CrossTenantAccess() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CrossTenantAccess}
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccess();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the deviceCount property value. The number of devices that accessed the external tenant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceTenantId", (n) -> { this.setResourceTenantId(n.getStringValue()); });
        deserializerMap.put("resourceTenantName", (n) -> { this.setResourceTenantName(n.getStringValue()); });
        deserializerMap.put("resourceTenantPrimaryDomain", (n) -> { this.setResourceTenantPrimaryDomain(n.getStringValue()); });
        deserializerMap.put("usageStatus", (n) -> { this.setUsageStatus(n.getEnumValue(UsageStatus::forValue)); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastAccessDateTime property value. The timestamp of the most recent access to the external tenant.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessDateTime() {
        return this.backingStore.get("lastAccessDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the resourceTenantId property value. The tenant ID of the external tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantId() {
        return this.backingStore.get("resourceTenantId");
    }
    /**
     * Gets the resourceTenantName property value. The name of the external tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantName() {
        return this.backingStore.get("resourceTenantName");
    }
    /**
     * Gets the resourceTenantPrimaryDomain property value. The domain of the external tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantPrimaryDomain() {
        return this.backingStore.get("resourceTenantPrimaryDomain");
    }
    /**
     * Gets the usageStatus property value. The usageStatus property
     * @return a {@link UsageStatus}
     */
    @jakarta.annotation.Nullable
    public UsageStatus getUsageStatus() {
        return this.backingStore.get("usageStatus");
    }
    /**
     * Gets the userCount property value. The number of users that accessed the external tenant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUserCount() {
        return this.backingStore.get("userCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceTenantId", this.getResourceTenantId());
        writer.writeStringValue("resourceTenantName", this.getResourceTenantName());
        writer.writeStringValue("resourceTenantPrimaryDomain", this.getResourceTenantPrimaryDomain());
        writer.writeEnumValue("usageStatus", this.getUsageStatus());
        writer.writeLongValue("userCount", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the deviceCount property value. The number of devices that accessed the external tenant.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the lastAccessDateTime property value. The timestamp of the most recent access to the external tenant.
     * @param value Value to set for the lastAccessDateTime property.
     */
    public void setLastAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAccessDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resourceTenantId property value. The tenant ID of the external tenant.
     * @param value Value to set for the resourceTenantId property.
     */
    public void setResourceTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceTenantId", value);
    }
    /**
     * Sets the resourceTenantName property value. The name of the external tenant.
     * @param value Value to set for the resourceTenantName property.
     */
    public void setResourceTenantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceTenantName", value);
    }
    /**
     * Sets the resourceTenantPrimaryDomain property value. The domain of the external tenant.
     * @param value Value to set for the resourceTenantPrimaryDomain property.
     */
    public void setResourceTenantPrimaryDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceTenantPrimaryDomain", value);
    }
    /**
     * Sets the usageStatus property value. The usageStatus property
     * @param value Value to set for the usageStatus property.
     */
    public void setUsageStatus(@jakarta.annotation.Nullable final UsageStatus value) {
        this.backingStore.set("usageStatus", value);
    }
    /**
     * Sets the userCount property value. The number of users that accessed the external tenant.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("userCount", value);
    }
}
