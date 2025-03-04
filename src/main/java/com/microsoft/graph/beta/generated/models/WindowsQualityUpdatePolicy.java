package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Quality Update Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdatePolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsQualityUpdatePolicy} and sets the default values.
     */
    public WindowsQualityUpdatePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdatePolicy}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdatePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdatePolicy();
    }
    /**
     * Gets the assignments property value. List of the groups this profile is assgined to.
     * @return a {@link java.util.List<WindowsQualityUpdatePolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsQualityUpdatePolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the profile was created. The value cannot be modified and is automatically populated when the profile is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. Read-only
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of the policy which is specified by the user. Max allowed length is 1500 chars.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the policy. Max allowed length is 200 chars.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(WindowsQualityUpdatePolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hotpatchEnabled", (n) -> { this.setHotpatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hotpatchEnabled property value. Indicates if hotpatch is enabled for the tenants. When &apos;true&apos;, tenant can apply quality updates without rebooting their devices. When &apos;false&apos;, tenant devices will receive cold patch associated with Windows quality updates.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHotpatchEnabled() {
        return this.backingStore.get("hotpatchEnabled");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of when the profile was modified. The value cannot be modified and is automatically populated when the profile is modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. Read-only
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of the scope tag ids for this profile.
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("hotpatchEnabled", this.getHotpatchEnabled());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the assignments property value. List of the groups this profile is assgined to.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<WindowsQualityUpdatePolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the profile was created. The value cannot be modified and is automatically populated when the profile is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. Read-only
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of the policy which is specified by the user. Max allowed length is 1500 chars.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the policy. Max allowed length is 200 chars.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the hotpatchEnabled property value. Indicates if hotpatch is enabled for the tenants. When &apos;true&apos;, tenant can apply quality updates without rebooting their devices. When &apos;false&apos;, tenant devices will receive cold patch associated with Windows quality updates.
     * @param value Value to set for the hotpatchEnabled property.
     */
    public void setHotpatchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hotpatchEnabled", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of when the profile was modified. The value cannot be modified and is automatically populated when the profile is modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. Read-only
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of the scope tag ids for this profile.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
}
