package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link ImportedDeviceIdentity} and sets the default values.
     */
    public ImportedDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImportedDeviceIdentity}
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
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of the device
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a {@link EnrollmentState}
     */
    @jakarta.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.backingStore.get("enrollmentState");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enrollmentState", (n) -> { this.setEnrollmentState(n.getEnumValue(EnrollmentState::forValue)); });
        deserializerMap.put("importedDeviceIdentifier", (n) -> { this.setImportedDeviceIdentifier(n.getStringValue()); });
        deserializerMap.put("importedDeviceIdentityType", (n) -> { this.setImportedDeviceIdentityType(n.getEnumValue(ImportedDeviceIdentityType::forValue)); });
        deserializerMap.put("lastContactedDateTime", (n) -> { this.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(Platform::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the importedDeviceIdentifier property value. Imported Device Identifier
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImportedDeviceIdentifier() {
        return this.backingStore.get("importedDeviceIdentifier");
    }
    /**
     * Gets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @return a {@link ImportedDeviceIdentityType}
     */
    @jakarta.annotation.Nullable
    public ImportedDeviceIdentityType getImportedDeviceIdentityType() {
        return this.backingStore.get("importedDeviceIdentityType");
    }
    /**
     * Gets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this.backingStore.get("lastContactedDateTime");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the platform property value. Supported platform types for policies.
     * @return a {@link Platform}
     */
    @jakarta.annotation.Nullable
    public Platform getPlatform() {
        return this.backingStore.get("platform");
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
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of the device
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     */
    public void setEnrollmentState(@jakarta.annotation.Nullable final EnrollmentState value) {
        this.backingStore.set("enrollmentState", value);
    }
    /**
     * Sets the importedDeviceIdentifier property value. Imported Device Identifier
     * @param value Value to set for the importedDeviceIdentifier property.
     */
    public void setImportedDeviceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("importedDeviceIdentifier", value);
    }
    /**
     * Sets the importedDeviceIdentityType property value. The importedDeviceIdentityType property
     * @param value Value to set for the importedDeviceIdentityType property.
     */
    public void setImportedDeviceIdentityType(@jakarta.annotation.Nullable final ImportedDeviceIdentityType value) {
        this.backingStore.set("importedDeviceIdentityType", value);
    }
    /**
     * Sets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @param value Value to set for the lastContactedDateTime property.
     */
    public void setLastContactedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastContactedDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last Modified DateTime of the description
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the platform property value. Supported platform types for policies.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final Platform value) {
        this.backingStore.set("platform", value);
    }
}
