package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS software update state summary for a device and user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSSoftwareUpdateStateSummary extends Entity implements Parsable {
    /**
     * Instantiates a new MacOSSoftwareUpdateStateSummary and sets the default values.
     */
    public MacOSSoftwareUpdateStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSSoftwareUpdateStateSummary
     */
    @jakarta.annotation.Nonnull
    public static MacOSSoftwareUpdateStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateStateSummary();
    }
    /**
     * Gets the displayName property value. Human readable name of the software update
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MacOSSoftwareUpdateState::forValue)); });
        deserializerMap.put("updateCategory", (n) -> { this.setUpdateCategory(n.getEnumValue(MacOSSoftwareUpdateCategory::forValue)); });
        deserializerMap.put("updateVersion", (n) -> { this.setUpdateVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last date time the report for this device and product key was updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the productKey property value. Product key of the software update.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductKey() {
        return this.backingStore.get("productKey");
    }
    /**
     * Gets the state property value. MacOS Software Update State
     * @return a MacOSSoftwareUpdateState
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the updateCategory property value. MacOS Software Update Category
     * @return a MacOSSoftwareUpdateCategory
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateCategory getUpdateCategory() {
        return this.backingStore.get("updateCategory");
    }
    /**
     * Gets the updateVersion property value. Version of the software update
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUpdateVersion() {
        return this.backingStore.get("updateVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeEnumValue("state", this.getState());
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
        writer.writeStringValue("updateVersion", this.getUpdateVersion());
    }
    /**
     * Sets the displayName property value. Human readable name of the software update
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device and product key was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the productKey property value. Product key of the software update.
     * @param value Value to set for the productKey property.
     */
    public void setProductKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productKey", value);
    }
    /**
     * Sets the state property value. MacOS Software Update State
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MacOSSoftwareUpdateState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the updateCategory property value. MacOS Software Update Category
     * @param value Value to set for the updateCategory property.
     */
    public void setUpdateCategory(@jakarta.annotation.Nullable final MacOSSoftwareUpdateCategory value) {
        this.backingStore.set("updateCategory", value);
    }
    /**
     * Sets the updateVersion property value. Version of the software update
     * @param value Value to set for the updateVersion property.
     */
    public void setUpdateVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("updateVersion", value);
    }
}
