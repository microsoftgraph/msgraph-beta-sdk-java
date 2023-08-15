package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The importedAppleDeviceIdentity resource represents the imported device identity of an Apple device .
 */
public class ImportedAppleDeviceIdentity extends Entity implements Parsable {
    /**
     * Created Date Time of the device
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of the device
     */
    private String description;
    /**
     * The discoverySource property
     */
    private DiscoverySource discoverySource;
    /**
     * The enrollmentState property
     */
    private EnrollmentState enrollmentState;
    /**
     * Indicates if the device is deleted from Apple Business Manager
     */
    private Boolean isDeleted;
    /**
     * Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837
     */
    private Boolean isSupervised;
    /**
     * Last Contacted Date Time of the device
     */
    private OffsetDateTime lastContactedDateTime;
    /**
     * The platform property
     */
    private Platform platform;
    /**
     * The time enrollment profile was assigned to the device
     */
    private OffsetDateTime requestedEnrollmentProfileAssignmentDateTime;
    /**
     * Enrollment profile Id admin intends to apply to the device during next enrollment
     */
    private String requestedEnrollmentProfileId;
    /**
     * Device serial number
     */
    private String serialNumber;
    /**
     * Instantiates a new importedAppleDeviceIdentity and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ImportedAppleDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedAppleDeviceIdentity
     */
    @jakarta.annotation.Nonnull
    public static ImportedAppleDeviceIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.importedAppleDeviceIdentityResult": return new ImportedAppleDeviceIdentityResult();
            }
        }
        return new ImportedAppleDeviceIdentity();
    }
    /**
     * Gets the createdDateTime property value. Created Date Time of the device
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the device
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the discoverySource property value. The discoverySource property
     * @return a discoverySource
     */
    @jakarta.annotation.Nullable
    public DiscoverySource getDiscoverySource() {
        return this.discoverySource;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a enrollmentState
     */
    @jakarta.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.enrollmentState;
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
        deserializerMap.put("discoverySource", (n) -> { this.setDiscoverySource(n.getEnumValue(DiscoverySource.class)); });
        deserializerMap.put("enrollmentState", (n) -> { this.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("isSupervised", (n) -> { this.setIsSupervised(n.getBooleanValue()); });
        deserializerMap.put("lastContactedDateTime", (n) -> { this.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(Platform.class)); });
        deserializerMap.put("requestedEnrollmentProfileAssignmentDateTime", (n) -> { this.setRequestedEnrollmentProfileAssignmentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestedEnrollmentProfileId", (n) -> { this.setRequestedEnrollmentProfileId(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDeleted property value. Indicates if the device is deleted from Apple Business Manager
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    /**
     * Gets the isSupervised property value. Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSupervised() {
        return this.isSupervised;
    }
    /**
     * Gets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this.lastContactedDateTime;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a platform
     */
    @jakarta.annotation.Nullable
    public Platform getPlatform() {
        return this.platform;
    }
    /**
     * Gets the requestedEnrollmentProfileAssignmentDateTime property value. The time enrollment profile was assigned to the device
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedEnrollmentProfileAssignmentDateTime() {
        return this.requestedEnrollmentProfileAssignmentDateTime;
    }
    /**
     * Gets the requestedEnrollmentProfileId property value. Enrollment profile Id admin intends to apply to the device during next enrollment
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRequestedEnrollmentProfileId() {
        return this.requestedEnrollmentProfileId;
    }
    /**
     * Gets the serialNumber property value. Device serial number
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("discoverySource", this.getDiscoverySource());
        writer.writeEnumValue("enrollmentState", this.getEnrollmentState());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeBooleanValue("isSupervised", this.getIsSupervised());
        writer.writeOffsetDateTimeValue("lastContactedDateTime", this.getLastContactedDateTime());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeOffsetDateTimeValue("requestedEnrollmentProfileAssignmentDateTime", this.getRequestedEnrollmentProfileAssignmentDateTime());
        writer.writeStringValue("requestedEnrollmentProfileId", this.getRequestedEnrollmentProfileId());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
    }
    /**
     * Sets the createdDateTime property value. Created Date Time of the device
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the device
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the discoverySource property value. The discoverySource property
     * @param value Value to set for the discoverySource property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDiscoverySource(@jakarta.annotation.Nullable final DiscoverySource value) {
        this.discoverySource = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnrollmentState(@jakarta.annotation.Nullable final EnrollmentState value) {
        this.enrollmentState = value;
    }
    /**
     * Sets the isDeleted property value. Indicates if the device is deleted from Apple Business Manager
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.isDeleted = value;
    }
    /**
     * Sets the isSupervised property value. Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsSupervised(@jakarta.annotation.Nullable final Boolean value) {
        this.isSupervised = value;
    }
    /**
     * Sets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @param value Value to set for the lastContactedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastContactedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastContactedDateTime = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPlatform(@jakarta.annotation.Nullable final Platform value) {
        this.platform = value;
    }
    /**
     * Sets the requestedEnrollmentProfileAssignmentDateTime property value. The time enrollment profile was assigned to the device
     * @param value Value to set for the requestedEnrollmentProfileAssignmentDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRequestedEnrollmentProfileAssignmentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.requestedEnrollmentProfileAssignmentDateTime = value;
    }
    /**
     * Sets the requestedEnrollmentProfileId property value. Enrollment profile Id admin intends to apply to the device during next enrollment
     * @param value Value to set for the requestedEnrollmentProfileId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRequestedEnrollmentProfileId(@jakarta.annotation.Nullable final String value) {
        this.requestedEnrollmentProfileId = value;
    }
    /**
     * Sets the serialNumber property value. Device serial number
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
}
