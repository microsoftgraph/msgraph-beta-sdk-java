package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Feature Update Profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsFeatureUpdateProfile extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsFeatureUpdateProfile and sets the default values.
     */
    public WindowsFeatureUpdateProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsFeatureUpdateProfile
     */
    @jakarta.annotation.Nonnull
    public static WindowsFeatureUpdateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFeatureUpdateProfile();
    }
    /**
     * Gets the assignments property value. The list of group assignments of the profile.
     * @return a java.util.List<WindowsFeatureUpdateProfileAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsFeatureUpdateProfileAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date time that the profile was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeployableContentDisplayName() {
        return this.backingStore.get("deployableContentDisplayName");
    }
    /**
     * Gets the description property value. The description of the profile which is specified by the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endOfSupportDate property value. The last supported date for a feature update
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndOfSupportDate() {
        return this.backingStore.get("endOfSupportDate");
    }
    /**
     * Gets the featureUpdateVersion property value. The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFeatureUpdateVersion() {
        return this.backingStore.get("featureUpdateVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(WindowsFeatureUpdateProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deployableContentDisplayName", (n) -> { this.setDeployableContentDisplayName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endOfSupportDate", (n) -> { this.setEndOfSupportDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("featureUpdateVersion", (n) -> { this.setFeatureUpdateVersion(n.getStringValue()); });
        deserializerMap.put("installLatestWindows10OnWindows11IneligibleDevice", (n) -> { this.setInstallLatestWindows10OnWindows11IneligibleDevice(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rolloutSettings", (n) -> { this.setRolloutSettings(n.getObjectValue(WindowsUpdateRolloutSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installLatestWindows10OnWindows11IneligibleDevice property value. If true, the latest Microsoft Windows 10 update will be installed on devices ineligible for Microsoft Windows 11
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallLatestWindows10OnWindows11IneligibleDevice() {
        return this.backingStore.get("installLatestWindows10OnWindows11IneligibleDevice");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Feature Update entity.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the rolloutSettings property value. The windows update rollout settings, including offer start date time, offer end date time, and days between each set of offers.
     * @return a WindowsUpdateRolloutSettings
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateRolloutSettings getRolloutSettings() {
        return this.backingStore.get("rolloutSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deployableContentDisplayName", this.getDeployableContentDisplayName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("endOfSupportDate", this.getEndOfSupportDate());
        writer.writeStringValue("featureUpdateVersion", this.getFeatureUpdateVersion());
        writer.writeBooleanValue("installLatestWindows10OnWindows11IneligibleDevice", this.getInstallLatestWindows10OnWindows11IneligibleDevice());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeObjectValue("rolloutSettings", this.getRolloutSettings());
    }
    /**
     * Sets the assignments property value. The list of group assignments of the profile.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<WindowsFeatureUpdateProfileAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The date time that the profile was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @param value Value to set for the deployableContentDisplayName property.
     */
    public void setDeployableContentDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deployableContentDisplayName", value);
    }
    /**
     * Sets the description property value. The description of the profile which is specified by the user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endOfSupportDate property value. The last supported date for a feature update
     * @param value Value to set for the endOfSupportDate property.
     */
    public void setEndOfSupportDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endOfSupportDate", value);
    }
    /**
     * Sets the featureUpdateVersion property value. The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.
     * @param value Value to set for the featureUpdateVersion property.
     */
    public void setFeatureUpdateVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("featureUpdateVersion", value);
    }
    /**
     * Sets the installLatestWindows10OnWindows11IneligibleDevice property value. If true, the latest Microsoft Windows 10 update will be installed on devices ineligible for Microsoft Windows 11
     * @param value Value to set for the installLatestWindows10OnWindows11IneligibleDevice property.
     */
    public void setInstallLatestWindows10OnWindows11IneligibleDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("installLatestWindows10OnWindows11IneligibleDevice", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Feature Update entity.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the rolloutSettings property value. The windows update rollout settings, including offer start date time, offer end date time, and days between each set of offers.
     * @param value Value to set for the rolloutSettings property.
     */
    public void setRolloutSettings(@jakarta.annotation.Nullable final WindowsUpdateRolloutSettings value) {
        this.backingStore.set("rolloutSettings", value);
    }
}
