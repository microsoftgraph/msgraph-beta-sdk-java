package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsFeatureUpdateProfile extends Entity implements Parsable {
    /** The list of group assignments of the profile. */
    private java.util.List<WindowsFeatureUpdateProfileAssignment> _assignments;
    /** The date time that the profile was created. */
    private OffsetDateTime _createdDateTime;
    /** Friendly display name of the quality update profile deployable content */
    private String _deployableContentDisplayName;
    /** The description of the profile which is specified by the user. */
    private String _description;
    /** The display name of the profile. */
    private String _displayName;
    /** The last supported date for a feature update */
    private OffsetDateTime _endOfSupportDate;
    /** The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on. */
    private String _featureUpdateVersion;
    /** The date time that the profile was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of Scope Tags for this Feature Update entity. */
    private java.util.List<String> _roleScopeTagIds;
    /** The windows update rollout settings, including offer start date time, offer end date time, and days between each set of offers. */
    private WindowsUpdateRolloutSettings _rolloutSettings;
    /**
     * Instantiates a new windowsFeatureUpdateProfile and sets the default values.
     * @return a void
     */
    public WindowsFeatureUpdateProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsFeatureUpdateProfile
     */
    @javax.annotation.Nonnull
    public static WindowsFeatureUpdateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFeatureUpdateProfile();
    }
    /**
     * Gets the assignments property value. The list of group assignments of the profile.
     * @return a windowsFeatureUpdateProfileAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsFeatureUpdateProfileAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The date time that the profile was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeployableContentDisplayName() {
        return this._deployableContentDisplayName;
    }
    /**
     * Gets the description property value. The description of the profile which is specified by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the endOfSupportDate property value. The last supported date for a feature update
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndOfSupportDate() {
        return this._endOfSupportDate;
    }
    /**
     * Gets the featureUpdateVersion property value. The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFeatureUpdateVersion() {
        return this._featureUpdateVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsFeatureUpdateProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(WindowsFeatureUpdateProfileAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deployableContentDisplayName", (n) -> { currentObject.setDeployableContentDisplayName(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("endOfSupportDate", (n) -> { currentObject.setEndOfSupportDate(n.getOffsetDateTimeValue()); });
            this.put("featureUpdateVersion", (n) -> { currentObject.setFeatureUpdateVersion(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("rolloutSettings", (n) -> { currentObject.setRolloutSettings(n.getObjectValue(WindowsUpdateRolloutSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Feature Update entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the rolloutSettings property value. The windows update rollout settings, including offer start date time, offer end date time, and days between each set of offers.
     * @return a windowsUpdateRolloutSettings
     */
    @javax.annotation.Nullable
    public WindowsUpdateRolloutSettings getRolloutSettings() {
        return this._rolloutSettings;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deployableContentDisplayName", this.getDeployableContentDisplayName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endOfSupportDate", this.getEndOfSupportDate());
        writer.writeStringValue("featureUpdateVersion", this.getFeatureUpdateVersion());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeObjectValue("rolloutSettings", this.getRolloutSettings());
    }
    /**
     * Sets the assignments property value. The list of group assignments of the profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<WindowsFeatureUpdateProfileAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date time that the profile was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @param value Value to set for the deployableContentDisplayName property.
     * @return a void
     */
    public void setDeployableContentDisplayName(@javax.annotation.Nullable final String value) {
        this._deployableContentDisplayName = value;
    }
    /**
     * Sets the description property value. The description of the profile which is specified by the user.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the profile.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the endOfSupportDate property value. The last supported date for a feature update
     * @param value Value to set for the endOfSupportDate property.
     * @return a void
     */
    public void setEndOfSupportDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endOfSupportDate = value;
    }
    /**
     * Sets the featureUpdateVersion property value. The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.
     * @param value Value to set for the featureUpdateVersion property.
     * @return a void
     */
    public void setFeatureUpdateVersion(@javax.annotation.Nullable final String value) {
        this._featureUpdateVersion = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Feature Update entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the rolloutSettings property value. The windows update rollout settings, including offer start date time, offer end date time, and days between each set of offers.
     * @param value Value to set for the rolloutSettings property.
     * @return a void
     */
    public void setRolloutSettings(@javax.annotation.Nullable final WindowsUpdateRolloutSettings value) {
        this._rolloutSettings = value;
    }
}
