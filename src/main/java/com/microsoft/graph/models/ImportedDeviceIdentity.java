package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImportedDeviceIdentity extends Entity implements Parsable {
    /**
     * Created Date Time of the device
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of the device
     */
    private String description;
    /**
     * The enrollmentState property
     */
    private EnrollmentState enrollmentState;
    /**
     * Imported Device Identifier
     */
    private String importedDeviceIdentifier;
    /**
     * The importedDeviceIdentityType property
     */
    private ImportedDeviceIdentityType importedDeviceIdentityType;
    /**
     * Last Contacted Date Time of the device
     */
    private OffsetDateTime lastContactedDateTime;
    /**
     * Last Modified DateTime of the description
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The platform property
     */
    private Platform platform;
    /**
     * Instantiates a new ImportedDeviceIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImportedDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportedDeviceIdentity
     */
    @javax.annotation.Nonnull
    public static ImportedDeviceIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.importedDeviceIdentityResult": return new ImportedDeviceIdentityResult();
            }
        }
        return new ImportedDeviceIdentity();
    }
    /**
     * Gets the createdDateTime property value. Created Date Time of the device
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a EnrollmentState
     */
    @javax.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.enrollmentState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enrollmentState", (n) -> { this.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
        deserializerMap.put("importedDeviceIdentifier", (n) -> { this.setImportedDeviceIdentifier(n.getStringValue()); });
        deserializerMap.put("importedDeviceIdentityType", (n) -> { this.setImportedDeviceIdentityType(n.getEnumValue(ImportedDeviceIdentityType.class)); });
        deserializerMap.put("lastContactedDateTime", (n) -> { this.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(Platform.class)); });
        return deserializerMap;
    }
    /**
     * Gets the importedDeviceIdentifier property value. Imported Device Identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImportedDeviceIdentifier() {
        return this.importedDeviceIdentifier;
    }
    /**
     * Gets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @return a ImportedDeviceIdentityType
     */
    @javax.annotation.Nullable
    public ImportedDeviceIdentityType getImportedDeviceIdentityType() {
        return this.importedDeviceIdentityType;
    }
    /**
     * Gets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this.lastContactedDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a Platform
     */
    @javax.annotation.Nullable
    public Platform getPlatform() {
        return this.platform;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("enrollmentState", this.getEnrollmentState());
        writer.writeStringValue("importedDeviceIdentifier", this.getImportedDeviceIdentifier());
        writer.writeEnumValue("importedDeviceIdentityType", this.getImportedDeviceIdentityType());
        writer.writeOffsetDateTimeValue("lastContactedDateTime", this.getLastContactedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("platform", this.getPlatform());
    }
    /**
     * Sets the createdDateTime property value. Created Date Time of the device
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the device
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentState(@javax.annotation.Nullable final EnrollmentState value) {
        this.enrollmentState = value;
    }
    /**
     * Sets the importedDeviceIdentifier property value. Imported Device Identifier
     * @param value Value to set for the importedDeviceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this.importedDeviceIdentifier = value;
    }
    /**
     * Sets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @param value Value to set for the importedDeviceIdentityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedDeviceIdentityType(@javax.annotation.Nullable final ImportedDeviceIdentityType value) {
        this.importedDeviceIdentityType = value;
    }
    /**
     * Sets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @param value Value to set for the lastContactedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastContactedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastContactedDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final Platform value) {
        this.platform = value;
    }
}
