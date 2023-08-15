package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base Profile Type for Resource Access
 */
public class DeviceManagementResourceAccessProfileBase extends Entity implements Parsable {
    /**
     * The list of assignments for the device configuration profile.
     */
    private java.util.List<DeviceManagementResourceAccessProfileAssignment> assignments;
    /**
     * DateTime profile was created
     */
    private OffsetDateTime creationDateTime;
    /**
     * Profile description
     */
    private String description;
    /**
     * Profile display name
     */
    private String displayName;
    /**
     * DateTime profile was last modified
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Scope Tags
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Version of the profile
     */
    private Integer version;
    /**
     * Instantiates a new deviceManagementResourceAccessProfileBase and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementResourceAccessProfileBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementResourceAccessProfileBase
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementResourceAccessProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windows10XCertificateProfile": return new Windows10XCertificateProfile();
                case "#microsoft.graph.windows10XSCEPCertificateProfile": return new Windows10XSCEPCertificateProfile();
                case "#microsoft.graph.windows10XTrustedRootCertificate": return new Windows10XTrustedRootCertificate();
                case "#microsoft.graph.windows10XVpnConfiguration": return new Windows10XVpnConfiguration();
                case "#microsoft.graph.windows10XWifiConfiguration": return new Windows10XWifiConfiguration();
            }
        }
        return new DeviceManagementResourceAccessProfileBase();
    }
    /**
     * Gets the assignments property value. The list of assignments for the device configuration profile.
     * @return a deviceManagementResourceAccessProfileAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementResourceAccessProfileAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the creationDateTime property value. DateTime profile was created
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Gets the description property value. Profile description
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Profile display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceManagementResourceAccessProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime profile was last modified
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. Scope Tags
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the version property value. Version of the profile
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of assignments for the device configuration profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementResourceAccessProfileAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the creationDateTime property value. DateTime profile was created
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the description property value. Profile description
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Profile display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime profile was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. Scope Tags
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the version property value. Version of the profile
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
