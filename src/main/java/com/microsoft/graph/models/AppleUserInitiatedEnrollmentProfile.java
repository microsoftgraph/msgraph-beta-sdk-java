package com.microsoft.graph.models;

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
public class AppleUserInitiatedEnrollmentProfile extends Entity implements Parsable {
    /** The list of assignments for this profile. */
    private java.util.List<AppleEnrollmentProfileAssignment> assignments;
    /** List of available enrollment type options */
    private java.util.List<AppleOwnerTypeEnrollmentType> availableEnrollmentTypeOptions;
    /** Profile creation time */
    private OffsetDateTime createdDateTime;
    /** The defaultEnrollmentType property */
    private AppleUserInitiatedEnrollmentType defaultEnrollmentType;
    /** Description of the profile */
    private String description;
    /** Name of the profile */
    private String displayName;
    /** Profile last modified time */
    private OffsetDateTime lastModifiedDateTime;
    /** Supported platform types. */
    private DevicePlatformType platform;
    /** Priority, 0 is highest */
    private Integer priority;
    /**
     * Instantiates a new appleUserInitiatedEnrollmentProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppleUserInitiatedEnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appleUserInitiatedEnrollmentProfile
     */
    @javax.annotation.Nonnull
    public static AppleUserInitiatedEnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleUserInitiatedEnrollmentProfile();
    }
    /**
     * Gets the assignments property value. The list of assignments for this profile.
     * @return a appleEnrollmentProfileAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppleEnrollmentProfileAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the availableEnrollmentTypeOptions property value. List of available enrollment type options
     * @return a appleOwnerTypeEnrollmentType
     */
    @javax.annotation.Nullable
    public java.util.List<AppleOwnerTypeEnrollmentType> getAvailableEnrollmentTypeOptions() {
        return this.availableEnrollmentTypeOptions;
    }
    /**
     * Gets the createdDateTime property value. Profile creation time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the defaultEnrollmentType property value. The defaultEnrollmentType property
     * @return a appleUserInitiatedEnrollmentType
     */
    @javax.annotation.Nullable
    public AppleUserInitiatedEnrollmentType getDefaultEnrollmentType() {
        return this.defaultEnrollmentType;
    }
    /**
     * Gets the description property value. Description of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Name of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(AppleEnrollmentProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("availableEnrollmentTypeOptions", (n) -> { this.setAvailableEnrollmentTypeOptions(n.getCollectionOfObjectValues(AppleOwnerTypeEnrollmentType::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("defaultEnrollmentType", (n) -> { this.setDefaultEnrollmentType(n.getEnumValue(AppleUserInitiatedEnrollmentType.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Profile last modified time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the platform property value. Supported platform types.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this.platform;
    }
    /**
     * Gets the priority property value. Priority, 0 is highest
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<AppleEnrollmentProfileAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the availableEnrollmentTypeOptions property value. List of available enrollment type options
     * @param value Value to set for the availableEnrollmentTypeOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailableEnrollmentTypeOptions(@javax.annotation.Nullable final java.util.List<AppleOwnerTypeEnrollmentType> value) {
        this.availableEnrollmentTypeOptions = value;
    }
    /**
     * Sets the createdDateTime property value. Profile creation time
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the defaultEnrollmentType property value. The defaultEnrollmentType property
     * @param value Value to set for the defaultEnrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultEnrollmentType(@javax.annotation.Nullable final AppleUserInitiatedEnrollmentType value) {
        this.defaultEnrollmentType = value;
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Profile last modified time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this.platform = value;
    }
    /**
     * Sets the priority property value. Priority, 0 is highest
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
}
