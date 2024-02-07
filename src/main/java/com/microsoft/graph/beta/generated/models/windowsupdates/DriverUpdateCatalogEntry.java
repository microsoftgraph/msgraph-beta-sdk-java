package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriverUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * Instantiates a new DriverUpdateCatalogEntry and sets the default values.
     */
    public DriverUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.driverUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DriverUpdateCatalogEntry
     */
    @jakarta.annotation.Nonnull
    public static DriverUpdateCatalogEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriverUpdateCatalogEntry();
    }
    /**
     * Gets the description property value. The description of the content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the driverClass property value. The classification of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDriverClass() {
        return this.backingStore.get("driverClass");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("driverClass", (n) -> { this.setDriverClass(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("setupInformationFile", (n) -> { this.setSetupInformationFile(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("versionDateTime", (n) -> { this.setVersionDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the provider property value. The provider of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.backingStore.get("provider");
    }
    /**
     * Gets the setupInformationFile property value. The setup information file of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSetupInformationFile() {
        return this.backingStore.get("setupInformationFile");
    }
    /**
     * Gets the version property value. The unique version of the content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the versionDateTime property value. The date and time when a new version of content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getVersionDateTime() {
        return this.backingStore.get("versionDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("driverClass", this.getDriverClass());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("setupInformationFile", this.getSetupInformationFile());
        writer.writeStringValue("version", this.getVersion());
        writer.writeOffsetDateTimeValue("versionDateTime", this.getVersionDateTime());
    }
    /**
     * Sets the description property value. The description of the content.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the driverClass property value. The classification of the driver.
     * @param value Value to set for the driverClass property.
     */
    public void setDriverClass(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("driverClass", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the driver.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the provider property value. The provider of the driver.
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provider", value);
    }
    /**
     * Sets the setupInformationFile property value. The setup information file of the driver.
     * @param value Value to set for the setupInformationFile property.
     */
    public void setSetupInformationFile(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("setupInformationFile", value);
    }
    /**
     * Sets the version property value. The unique version of the content.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the versionDateTime property value. The date and time when a new version of content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the versionDateTime property.
     */
    public void setVersionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("versionDateTime", value);
    }
}
