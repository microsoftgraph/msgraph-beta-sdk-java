package com.microsoft.graph.models;

import com.microsoft.graph.models.Windows10XCertificateProfile;
import com.microsoft.graph.models.Windows10XSCEPCertificateProfile;
import com.microsoft.graph.models.Windows10XTrustedRootCertificate;
import com.microsoft.graph.models.Windows10XVpnConfiguration;
import com.microsoft.graph.models.Windows10XWifiConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementResourceAccessProfileBase extends Entity implements Parsable {
    /** The list of assignments for the device configuration profile. */
    private java.util.List<DeviceManagementResourceAccessProfileAssignment> _assignments;
    /** DateTime profile was created */
    private OffsetDateTime _creationDateTime;
    /** Profile description */
    private String _description;
    /** Profile display name */
    private String _displayName;
    /** DateTime profile was last modified */
    private OffsetDateTime _lastModifiedDateTime;
    /** Scope Tags */
    private java.util.List<String> _roleScopeTagIds;
    /** Version of the profile */
    private Integer _version;
    /**
     * Instantiates a new DeviceManagementResourceAccessProfileBase and sets the default values.
     * @return a void
     */
    public DeviceManagementResourceAccessProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementResourceAccessProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementResourceAccessProfileBase
     */
    @javax.annotation.Nonnull
    public static DeviceManagementResourceAccessProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementResourceAccessProfileAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the creationDateTime property value. DateTime profile was created
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this._creationDateTime;
    }
    /**
     * Gets the description property value. Profile description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Profile display name
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
        final DeviceManagementResourceAccessProfileBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceManagementResourceAccessProfileAssignment::createFromDiscriminatorValue)); });
            this.put("creationDateTime", (n) -> { currentObject.setCreationDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime profile was last modified
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. Scope Tags
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the version property value. Version of the profile
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
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
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementResourceAccessProfileAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the creationDateTime property value. DateTime profile was created
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._creationDateTime = value;
    }
    /**
     * Sets the description property value. Profile description
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Profile display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime profile was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. Scope Tags
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the version property value. Version of the profile
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
