package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleUserInitiatedEnrollmentProfile extends Entity implements Parsable {
    /** The list of assignments for this profile. */
    private java.util.List<AppleEnrollmentProfileAssignment> _assignments;
    /** List of available enrollment type options */
    private java.util.List<AppleOwnerTypeEnrollmentType> _availableEnrollmentTypeOptions;
    /** Profile creation time */
    private OffsetDateTime _createdDateTime;
    /** The default profile enrollment type. Possible values are: unknown, device, user. */
    private AppleUserInitiatedEnrollmentType _defaultEnrollmentType;
    /** Description of the profile */
    private String _description;
    /** Name of the profile */
    private String _displayName;
    /** Profile last modified time */
    private OffsetDateTime _lastModifiedDateTime;
    /** The platform of the Device. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown, androidAOSP. */
    private DevicePlatformType _platform;
    /** Priority, 0 is highest */
    private Integer _priority;
    /**
     * Instantiates a new appleUserInitiatedEnrollmentProfile and sets the default values.
     * @return a void
     */
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
        return this._assignments;
    }
    /**
     * Gets the availableEnrollmentTypeOptions property value. List of available enrollment type options
     * @return a appleOwnerTypeEnrollmentType
     */
    @javax.annotation.Nullable
    public java.util.List<AppleOwnerTypeEnrollmentType> getAvailableEnrollmentTypeOptions() {
        return this._availableEnrollmentTypeOptions;
    }
    /**
     * Gets the createdDateTime property value. Profile creation time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the defaultEnrollmentType property value. The default profile enrollment type. Possible values are: unknown, device, user.
     * @return a appleUserInitiatedEnrollmentType
     */
    @javax.annotation.Nullable
    public AppleUserInitiatedEnrollmentType getDefaultEnrollmentType() {
        return this._defaultEnrollmentType;
    }
    /**
     * Gets the description property value. Description of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Name of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleUserInitiatedEnrollmentProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(AppleEnrollmentProfileAssignment::createFromDiscriminatorValue)); });
            this.put("availableEnrollmentTypeOptions", (n) -> { currentObject.setAvailableEnrollmentTypeOptions(n.getCollectionOfObjectValues(AppleOwnerTypeEnrollmentType::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("defaultEnrollmentType", (n) -> { currentObject.setDefaultEnrollmentType(n.getEnumValue(AppleUserInitiatedEnrollmentType.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. Profile last modified time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the platform property value. The platform of the Device. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown, androidAOSP.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this._platform;
    }
    /**
     * Gets the priority property value. Priority, 0 is highest
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAssignments(@javax.annotation.Nullable final java.util.List<AppleEnrollmentProfileAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the availableEnrollmentTypeOptions property value. List of available enrollment type options
     * @param value Value to set for the availableEnrollmentTypeOptions property.
     * @return a void
     */
    public void setAvailableEnrollmentTypeOptions(@javax.annotation.Nullable final java.util.List<AppleOwnerTypeEnrollmentType> value) {
        this._availableEnrollmentTypeOptions = value;
    }
    /**
     * Sets the createdDateTime property value. Profile creation time
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the defaultEnrollmentType property value. The default profile enrollment type. Possible values are: unknown, device, user.
     * @param value Value to set for the defaultEnrollmentType property.
     * @return a void
     */
    public void setDefaultEnrollmentType(@javax.annotation.Nullable final AppleUserInitiatedEnrollmentType value) {
        this._defaultEnrollmentType = value;
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Profile last modified time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the platform property value. The platform of the Device. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown, androidAOSP.
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._platform = value;
    }
    /**
     * Sets the priority property value. Priority, 0 is highest
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
}
