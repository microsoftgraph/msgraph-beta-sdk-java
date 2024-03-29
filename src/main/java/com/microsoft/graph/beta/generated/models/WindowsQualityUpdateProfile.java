package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Quality Update Profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsQualityUpdateProfile} and sets the default values.
     */
    public WindowsQualityUpdateProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateProfile}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateProfile();
    }
    /**
     * Gets the assignments property value. The list of group assignments of the profile.
     * @return a {@link java.util.List<WindowsQualityUpdateProfileAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsQualityUpdateProfileAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date time that the profile was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeployableContentDisplayName() {
        return this.backingStore.get("deployableContentDisplayName");
    }
    /**
     * Gets the description property value. The description of the profile which is specified by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the expeditedUpdateSettings property value. Expedited update settings.
     * @return a {@link ExpeditedWindowsQualityUpdateSettings}
     */
    @jakarta.annotation.Nullable
    public ExpeditedWindowsQualityUpdateSettings getExpeditedUpdateSettings() {
        return this.backingStore.get("expeditedUpdateSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(WindowsQualityUpdateProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deployableContentDisplayName", (n) -> { this.setDeployableContentDisplayName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("expeditedUpdateSettings", (n) -> { this.setExpeditedUpdateSettings(n.getObjectValue(ExpeditedWindowsQualityUpdateSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("releaseDateDisplayName", (n) -> { this.setReleaseDateDisplayName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the releaseDateDisplayName property value. Friendly release date to display for a Quality Update release
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReleaseDateDisplayName() {
        return this.backingStore.get("releaseDateDisplayName");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Quality Update entity.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
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
        writer.writeObjectValue("expeditedUpdateSettings", this.getExpeditedUpdateSettings());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("releaseDateDisplayName", this.getReleaseDateDisplayName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the assignments property value. The list of group assignments of the profile.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<WindowsQualityUpdateProfileAssignment> value) {
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
     * Sets the displayName property value. The display name for the profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the expeditedUpdateSettings property value. Expedited update settings.
     * @param value Value to set for the expeditedUpdateSettings property.
     */
    public void setExpeditedUpdateSettings(@jakarta.annotation.Nullable final ExpeditedWindowsQualityUpdateSettings value) {
        this.backingStore.set("expeditedUpdateSettings", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the releaseDateDisplayName property value. Friendly release date to display for a Quality Update release
     * @param value Value to set for the releaseDateDisplayName property.
     */
    public void setReleaseDateDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("releaseDateDisplayName", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Quality Update entity.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
}
