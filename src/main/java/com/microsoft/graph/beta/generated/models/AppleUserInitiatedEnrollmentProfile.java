package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The enrollmentProfile resource represents a collection of configurations which must be provided pre-enrollment to enable enrolling certain devices whose identities have been pre-staged. Pre-staged device identities are assigned to this type of profile to apply the profile's configurations at enrollment of the corresponding device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppleUserInitiatedEnrollmentProfile extends Entity implements Parsable {
    /**
     * Instantiates a new AppleUserInitiatedEnrollmentProfile and sets the default values.
     */
    public AppleUserInitiatedEnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleUserInitiatedEnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static AppleUserInitiatedEnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleUserInitiatedEnrollmentProfile();
    }
    /**
     * Gets the assignments property value. The list of assignments for this profile.
     * @return a java.util.List<AppleEnrollmentProfileAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppleEnrollmentProfileAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the availableEnrollmentTypeOptions property value. List of available enrollment type options
     * @return a java.util.List<AppleOwnerTypeEnrollmentType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppleOwnerTypeEnrollmentType> getAvailableEnrollmentTypeOptions() {
        return this.backingStore.get("availableEnrollmentTypeOptions");
    }
    /**
     * Gets the createdDateTime property value. Profile creation time
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the defaultEnrollmentType property value. The defaultEnrollmentType property
     * @return a AppleUserInitiatedEnrollmentType
     */
    @jakarta.annotation.Nullable
    public AppleUserInitiatedEnrollmentType getDefaultEnrollmentType() {
        return this.backingStore.get("defaultEnrollmentType");
    }
    /**
     * Gets the description property value. Description of the profile
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the profile
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
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(AppleEnrollmentProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("availableEnrollmentTypeOptions", (n) -> { this.setAvailableEnrollmentTypeOptions(n.getCollectionOfObjectValues(AppleOwnerTypeEnrollmentType::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("defaultEnrollmentType", (n) -> { this.setDefaultEnrollmentType(n.getEnumValue(AppleUserInitiatedEnrollmentType::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(DevicePlatformType::forValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Profile last modified time
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the platform property value. Supported platform types.
     * @return a DevicePlatformType
     */
    @jakarta.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the priority property value. Priority, 0 is highest
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("availableEnrollmentTypeOptions", this.getAvailableEnrollmentTypeOptions());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("defaultEnrollmentType", this.getDefaultEnrollmentType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the assignments property value. The list of assignments for this profile.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<AppleEnrollmentProfileAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the availableEnrollmentTypeOptions property value. List of available enrollment type options
     * @param value Value to set for the availableEnrollmentTypeOptions property.
     */
    public void setAvailableEnrollmentTypeOptions(@jakarta.annotation.Nullable final java.util.List<AppleOwnerTypeEnrollmentType> value) {
        this.backingStore.set("availableEnrollmentTypeOptions", value);
    }
    /**
     * Sets the createdDateTime property value. Profile creation time
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the defaultEnrollmentType property value. The defaultEnrollmentType property
     * @param value Value to set for the defaultEnrollmentType property.
     */
    public void setDefaultEnrollmentType(@jakarta.annotation.Nullable final AppleUserInitiatedEnrollmentType value) {
        this.backingStore.set("defaultEnrollmentType", value);
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Profile last modified time
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final DevicePlatformType value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the priority property value. Priority, 0 is highest
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
}
