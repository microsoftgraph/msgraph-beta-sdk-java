package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriverUpdateReport extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DriverUpdateReport} and sets the default values.
     */
    public DriverUpdateReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriverUpdateReport}
     */
    @jakarta.annotation.Nonnull
    public static DriverUpdateReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriverUpdateReport();
    }
    /**
     * Gets the class property value. The device class targeted by the driver update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClassEscaped() {
        return this.backingStore.get("class");
    }
    /**
     * Gets the deviceStatuses property value. The latest rollout statuses for devices associated with the driver update.
     * @return a {@link java.util.List<DriverUpdateDeviceStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriverUpdateDeviceStatus> getDeviceStatuses() {
        return this.backingStore.get("deviceStatuses");
    }
    /**
     * Gets the displayName property value. The display name of the driver update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("class", (n) -> { this.setClass(n.getStringValue()); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(DriverUpdateDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the driver update. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the releaseDateTime property value. The date and time when the driver update was released. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.backingStore.get("releaseDateTime");
    }
    /**
     * Gets the version property value. The driver version. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
    }
    /**
     * Sets the class property value. The device class targeted by the driver update. Read-only.
     * @param value Value to set for the class property.
     */
    public void setClass(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("class", value);
    }
    /**
     * Sets the deviceStatuses property value. The latest rollout statuses for devices associated with the driver update.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<DriverUpdateDeviceStatus> value) {
        this.backingStore.set("deviceStatuses", value);
    }
    /**
     * Sets the displayName property value. The display name of the driver update. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the driver update. Read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the releaseDateTime property value. The date and time when the driver update was released. Read-only.
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("releaseDateTime", value);
    }
    /**
     * Sets the version property value. The driver version. Read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
