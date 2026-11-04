package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicableCatalogSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApplicableCatalogSummary} and sets the default values.
     */
    public ApplicableCatalogSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicableCatalogSummary}
     */
    @jakarta.annotation.Nonnull
    public static ApplicableCatalogSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicableCatalogSummary();
    }
    /**
     * Gets the aggregatedDeviceCount property value. The number of devices included in the summary. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAggregatedDeviceCount() {
        return this.backingStore.get("aggregatedDeviceCount");
    }
    /**
     * Gets the aggregatedDevices property value. The devices included in the applicability summary.
     * @return a {@link java.util.List<ApplicableDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicableDevice> getAggregatedDevices() {
        return this.backingStore.get("aggregatedDevices");
    }
    /**
     * Gets the catalogEntry property value. The associated Windows update catalog entry.
     * @return a {@link CatalogEntry}
     */
    @jakarta.annotation.Nullable
    public CatalogEntry getCatalogEntry() {
        return this.backingStore.get("catalogEntry");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aggregatedDeviceCount", (n) -> { this.setAggregatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("aggregatedDevices", (n) -> { this.setAggregatedDevices(n.getCollectionOfObjectValues(ApplicableDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogEntry", (n) -> { this.setCatalogEntry(n.getObjectValue(CatalogEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("hasRecommendedDevice", (n) -> { this.setHasRecommendedDevice(n.getBooleanValue()); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hasRecommendedDevice property value. Indicates whether the catalog entry is recommended for at least one device in the summary. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRecommendedDevice() {
        return this.backingStore.get("hasRecommendedDevice");
    }
    /**
     * Gets the policies property value. The identifiers of Windows Autopatch policies for which the catalog entry is applicable. Read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPolicies() {
        return this.backingStore.get("policies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("aggregatedDevices", this.getAggregatedDevices());
        writer.writeObjectValue("catalogEntry", this.getCatalogEntry());
    }
    /**
     * Sets the aggregatedDeviceCount property value. The number of devices included in the summary. Read-only.
     * @param value Value to set for the aggregatedDeviceCount property.
     */
    public void setAggregatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("aggregatedDeviceCount", value);
    }
    /**
     * Sets the aggregatedDevices property value. The devices included in the applicability summary.
     * @param value Value to set for the aggregatedDevices property.
     */
    public void setAggregatedDevices(@jakarta.annotation.Nullable final java.util.List<ApplicableDevice> value) {
        this.backingStore.set("aggregatedDevices", value);
    }
    /**
     * Sets the catalogEntry property value. The associated Windows update catalog entry.
     * @param value Value to set for the catalogEntry property.
     */
    public void setCatalogEntry(@jakarta.annotation.Nullable final CatalogEntry value) {
        this.backingStore.set("catalogEntry", value);
    }
    /**
     * Sets the hasRecommendedDevice property value. Indicates whether the catalog entry is recommended for at least one device in the summary. Read-only.
     * @param value Value to set for the hasRecommendedDevice property.
     */
    public void setHasRecommendedDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasRecommendedDevice", value);
    }
    /**
     * Sets the policies property value. The identifiers of Windows Autopatch policies for which the catalog entry is applicable. Read-only.
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("policies", value);
    }
}
