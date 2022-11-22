package com.microsoft.graph.models;

import com.microsoft.graph.models.ImportedDeviceIdentityResult;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The importedDeviceIdentity resource represents a unique hardware identity of a device that has been pre-staged for pre-enrollment configuration. */
public class ImportedDeviceIdentity extends Entity implements Parsable {
    /** Created Date Time of the device */
    private OffsetDateTime _createdDateTime;
    /** The description of the device */
    private String _description;
    /** The enrollmentState property */
    private EnrollmentState _enrollmentState;
    /** Imported Device Identifier */
    private String _importedDeviceIdentifier;
    /** The importedDeviceIdentityType property */
    private ImportedDeviceIdentityType _importedDeviceIdentityType;
    /** Last Contacted Date Time of the device */
    private OffsetDateTime _lastContactedDateTime;
    /** Last Modified DateTime of the description */
    private OffsetDateTime _lastModifiedDateTime;
    /** The platform property */
    private Platform _platform;
    /**
     * Instantiates a new importedDeviceIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImportedDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedDeviceIdentity
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
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a enrollmentState
     */
    @javax.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this._enrollmentState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
        return this._importedDeviceIdentifier;
    }
    /**
     * Gets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @return a importedDeviceIdentityType
     */
    @javax.annotation.Nullable
    public ImportedDeviceIdentityType getImportedDeviceIdentityType() {
        return this._importedDeviceIdentityType;
    }
    /**
     * Gets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this._lastContactedDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a platform
     */
    @javax.annotation.Nullable
    public Platform getPlatform() {
        return this._platform;
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
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the device
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentState(@javax.annotation.Nullable final EnrollmentState value) {
        this._enrollmentState = value;
    }
    /**
     * Sets the importedDeviceIdentifier property value. Imported Device Identifier
     * @param value Value to set for the importedDeviceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this._importedDeviceIdentifier = value;
    }
    /**
     * Sets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @param value Value to set for the importedDeviceIdentityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportedDeviceIdentityType(@javax.annotation.Nullable final ImportedDeviceIdentityType value) {
        this._importedDeviceIdentityType = value;
    }
    /**
     * Sets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @param value Value to set for the lastContactedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastContactedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastContactedDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final Platform value) {
        this._platform = value;
    }
}
