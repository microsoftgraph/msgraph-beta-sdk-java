package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The importedDeviceIdentity resource represents a unique hardware identity of a device that has been pre-staged for pre-enrollment configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImportedDeviceIdentity extends Entity implements Parsable {
    /**
     * Instantiates a new ImportedDeviceIdentity and sets the default values.
     */
    public ImportedDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportedDeviceIdentity
     */
    @jakarta.annotation.Nonnull
    public static ImportedDeviceIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a EnrollmentState
     */
    @jakarta.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.BackingStore.get("enrollmentState");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImportedDeviceIdentifier() {
        return this.BackingStore.get("importedDeviceIdentifier");
    }
    /**
     * Gets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @return a ImportedDeviceIdentityType
     */
    @jakarta.annotation.Nullable
    public ImportedDeviceIdentityType getImportedDeviceIdentityType() {
        return this.BackingStore.get("importedDeviceIdentityType");
    }
    /**
     * Gets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this.BackingStore.get("lastContactedDateTime");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the platform property value. The platform property
     * @return a Platform
     */
    @jakarta.annotation.Nullable
    public Platform getPlatform() {
        return this.BackingStore.get("platform");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of the device
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     */
    public void setEnrollmentState(@jakarta.annotation.Nullable final EnrollmentState value) {
        this.BackingStore.set("enrollmentState", value);
    }
    /**
     * Sets the importedDeviceIdentifier property value. Imported Device Identifier
     * @param value Value to set for the importedDeviceIdentifier property.
     */
    public void setImportedDeviceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("importedDeviceIdentifier", value);
    }
    /**
     * Sets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @param value Value to set for the importedDeviceIdentityType property.
     */
    public void setImportedDeviceIdentityType(@jakarta.annotation.Nullable final ImportedDeviceIdentityType value) {
        this.BackingStore.set("importedDeviceIdentityType", value);
    }
    /**
     * Sets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @param value Value to set for the lastContactedDateTime property.
     */
    public void setLastContactedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastContactedDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final Platform value) {
        this.BackingStore.set("platform", value);
    }
}
