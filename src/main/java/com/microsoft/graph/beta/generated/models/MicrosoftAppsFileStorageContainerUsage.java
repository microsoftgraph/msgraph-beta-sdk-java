package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftAppsFileStorageContainerUsage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftAppsFileStorageContainerUsage} and sets the default values.
     */
    public MicrosoftAppsFileStorageContainerUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftAppsFileStorageContainerUsage}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftAppsFileStorageContainerUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAppsFileStorageContainerUsage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("totalActiveContainerCount", (n) -> { this.setTotalActiveContainerCount(n.getLongValue()); });
        deserializerMap.put("totalActiveStorageUsedInBytes", (n) -> { this.setTotalActiveStorageUsedInBytes(n.getLongValue()); });
        deserializerMap.put("usageByDataLocation", (n) -> { this.setUsageByDataLocation(n.getCollectionOfObjectValues(MicrosoftAppsFileStorageContainerGeoUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the totalActiveContainerCount property value. The total number of active file storage containers across the tenant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalActiveContainerCount() {
        return this.backingStore.get("totalActiveContainerCount");
    }
    /**
     * Gets the totalActiveStorageUsedInBytes property value. The total storage used in bytes across all active file storage containers in the tenant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalActiveStorageUsedInBytes() {
        return this.backingStore.get("totalActiveStorageUsedInBytes");
    }
    /**
     * Gets the usageByDataLocation property value. Storage usage data broken down by geographic location. Expandable using $expand=usageByDataLocation.
     * @return a {@link java.util.List<MicrosoftAppsFileStorageContainerGeoUsage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftAppsFileStorageContainerGeoUsage> getUsageByDataLocation() {
        return this.backingStore.get("usageByDataLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("usageByDataLocation", this.getUsageByDataLocation());
    }
    /**
     * Sets the totalActiveContainerCount property value. The total number of active file storage containers across the tenant.
     * @param value Value to set for the totalActiveContainerCount property.
     */
    public void setTotalActiveContainerCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalActiveContainerCount", value);
    }
    /**
     * Sets the totalActiveStorageUsedInBytes property value. The total storage used in bytes across all active file storage containers in the tenant.
     * @param value Value to set for the totalActiveStorageUsedInBytes property.
     */
    public void setTotalActiveStorageUsedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalActiveStorageUsedInBytes", value);
    }
    /**
     * Sets the usageByDataLocation property value. Storage usage data broken down by geographic location. Expandable using $expand=usageByDataLocation.
     * @param value Value to set for the usageByDataLocation property.
     */
    public void setUsageByDataLocation(@jakarta.annotation.Nullable final java.util.List<MicrosoftAppsFileStorageContainerGeoUsage> value) {
        this.backingStore.set("usageByDataLocation", value);
    }
}
