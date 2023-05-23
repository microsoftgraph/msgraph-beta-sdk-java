package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsQualityUpdateProfile extends Entity implements Parsable {
    /** The list of group assignments of the profile. */
    private java.util.List<WindowsQualityUpdateProfileAssignment> assignments;
    /** The date time that the profile was created. */
    private OffsetDateTime createdDateTime;
    /** Friendly display name of the quality update profile deployable content */
    private String deployableContentDisplayName;
    /** The description of the profile which is specified by the user. */
    private String description;
    /** The display name for the profile. */
    private String displayName;
    /** Expedited update settings. */
    private ExpeditedWindowsQualityUpdateSettings expeditedUpdateSettings;
    /** The date time that the profile was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** Friendly release date to display for a Quality Update release */
    private String releaseDateDisplayName;
    /** List of Scope Tags for this Quality Update entity. */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Instantiates a new WindowsQualityUpdateProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsQualityUpdateProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsQualityUpdateProfile
     */
    @javax.annotation.Nonnull
    public static WindowsQualityUpdateProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateProfile();
    }
    /**
     * Gets the assignments property value. The list of group assignments of the profile.
     * @return a windowsQualityUpdateProfileAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsQualityUpdateProfileAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The date time that the profile was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeployableContentDisplayName() {
        return this.deployableContentDisplayName;
    }
    /**
     * Gets the description property value. The description of the profile which is specified by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the expeditedUpdateSettings property value. Expedited update settings.
     * @return a expeditedWindowsQualityUpdateSettings
     */
    @javax.annotation.Nullable
    public ExpeditedWindowsQualityUpdateSettings getExpeditedUpdateSettings() {
        return this.expeditedUpdateSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the releaseDateDisplayName property value. Friendly release date to display for a Quality Update release
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReleaseDateDisplayName() {
        return this.releaseDateDisplayName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Quality Update entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<WindowsQualityUpdateProfileAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date time that the profile was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deployableContentDisplayName property value. Friendly display name of the quality update profile deployable content
     * @param value Value to set for the deployableContentDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployableContentDisplayName(@javax.annotation.Nullable final String value) {
        this.deployableContentDisplayName = value;
    }
    /**
     * Sets the description property value. The description of the profile which is specified by the user.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the profile.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the expeditedUpdateSettings property value. Expedited update settings.
     * @param value Value to set for the expeditedUpdateSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpeditedUpdateSettings(@javax.annotation.Nullable final ExpeditedWindowsQualityUpdateSettings value) {
        this.expeditedUpdateSettings = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time that the profile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the releaseDateDisplayName property value. Friendly release date to display for a Quality Update release
     * @param value Value to set for the releaseDateDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReleaseDateDisplayName(@javax.annotation.Nullable final String value) {
        this.releaseDateDisplayName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Quality Update entity.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
}
