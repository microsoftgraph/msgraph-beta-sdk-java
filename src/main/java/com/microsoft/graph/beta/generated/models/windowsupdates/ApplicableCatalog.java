package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicableCatalog extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApplicableCatalog} and sets the default values.
     */
    public ApplicableCatalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicableCatalog}
     */
    @jakarta.annotation.Nonnull
    public static ApplicableCatalog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicableCatalog();
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
     * Gets the deviceCount property value. The number of devices for which the catalog entry is applicable. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * Gets the devices property value. The devices for which the catalog entry is applicable.
     * @return a {@link java.util.List<ApplicableDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicableDevice> getDevices() {
        return this.backingStore.get("devices");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("catalogEntry", (n) -> { this.setCatalogEntry(n.getObjectValue(CatalogEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("devices", (n) -> { this.setDevices(n.getCollectionOfObjectValues(ApplicableDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("hasRecommendedDevice", (n) -> { this.setHasRecommendedDevice(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasRecommendedDevice property value. Indicates whether the catalog entry is recommended for at least one applicable device. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRecommendedDevice() {
        return this.backingStore.get("hasRecommendedDevice");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("catalogEntry", this.getCatalogEntry());
        writer.writeCollectionOfObjectValues("devices", this.getDevices());
    }
    /**
     * Sets the catalogEntry property value. The associated Windows update catalog entry.
     * @param value Value to set for the catalogEntry property.
     */
    public void setCatalogEntry(@jakarta.annotation.Nullable final CatalogEntry value) {
        this.backingStore.set("catalogEntry", value);
    }
    /**
     * Sets the deviceCount property value. The number of devices for which the catalog entry is applicable. Read-only.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the devices property value. The devices for which the catalog entry is applicable.
     * @param value Value to set for the devices property.
     */
    public void setDevices(@jakarta.annotation.Nullable final java.util.List<ApplicableDevice> value) {
        this.backingStore.set("devices", value);
    }
    /**
     * Sets the hasRecommendedDevice property value. Indicates whether the catalog entry is recommended for at least one applicable device. Read-only.
     * @param value Value to set for the hasRecommendedDevice property.
     */
    public void setHasRecommendedDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasRecommendedDevice", value);
    }
}
