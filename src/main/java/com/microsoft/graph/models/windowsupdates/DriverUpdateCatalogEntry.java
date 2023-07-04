package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DriverUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /**
     * The description of the content.
     */
    private String description;
    /**
     * The classification of the driver.
     */
    private String driverClass;
    /**
     * The manufacturer of the driver.
     */
    private String manufacturer;
    /**
     * The provider of the driver.
     */
    private String provider;
    /**
     * The setup information file of the driver.
     */
    private String setupInformationFile;
    /**
     * The unique version of the content.
     */
    private String version;
    /**
     * The date and time when a new version of content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime versionDateTime;
    /**
     * Instantiates a new DriverUpdateCatalogEntry and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriverUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.driverUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DriverUpdateCatalogEntry
     */
    @javax.annotation.Nonnull
    public static DriverUpdateCatalogEntry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriverUpdateCatalogEntry();
    }
    /**
     * Gets the description property value. The description of the content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the driverClass property value. The classification of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriverClass() {
        return this.driverClass;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the provider property value. The provider of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the setupInformationFile property value. The setup information file of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetupInformationFile() {
        return this.setupInformationFile;
    }
    /**
     * Gets the version property value. The unique version of the content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Gets the versionDateTime property value. The date and time when a new version of content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getVersionDateTime() {
        return this.versionDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the driverClass property value. The classification of the driver.
     * @param value Value to set for the driverClass property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriverClass(@javax.annotation.Nullable final String value) {
        this.driverClass = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the driver.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the provider property value. The provider of the driver.
     * @param value Value to set for the provider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvider(@javax.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the setupInformationFile property value. The setup information file of the driver.
     * @param value Value to set for the setupInformationFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetupInformationFile(@javax.annotation.Nullable final String value) {
        this.setupInformationFile = value;
    }
    /**
     * Sets the version property value. The unique version of the content.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
    /**
     * Sets the versionDateTime property value. The date and time when a new version of content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the versionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.versionDateTime = value;
    }
}
