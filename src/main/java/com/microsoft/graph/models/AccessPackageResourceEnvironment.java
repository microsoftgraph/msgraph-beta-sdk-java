package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResourceEnvironment extends Entity implements Parsable {
    /** Read-only. Required. */
    private java.util.List<AccessPackageResource> _accessPackageResources;
    /** Connection information of an environment used to connect to a resource. */
    private ConnectionInfo _connectionInfo;
    /** The display name of the user that created this object. */
    private String _createdBy;
    /** The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /** The description of this object. */
    private String _description;
    /** The display name of this object. */
    private String _displayName;
    /** Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications. */
    private Boolean _isDefaultEnvironment;
    /** The display name of the entity that last modified this object. */
    private String _modifiedBy;
    /** The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _modifiedDateTime;
    /** The unique identifier of this environment in the origin system. */
    private String _originId;
    /** The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq). */
    private String _originSystem;
    /**
     * Instantiates a new accessPackageResourceEnvironment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceEnvironment() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageResourceEnvironment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceEnvironment
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceEnvironment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceEnvironment();
    }
    /**
     * Gets the accessPackageResources property value. Read-only. Required.
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResource> getAccessPackageResources() {
        return this._accessPackageResources;
    }
    /**
     * Gets the connectionInfo property value. Connection information of an environment used to connect to a resource.
     * @return a connectionInfo
     */
    @javax.annotation.Nullable
    public ConnectionInfo getConnectionInfo() {
        return this._connectionInfo;
    }
    /**
     * Gets the createdBy property value. The display name of the user that created this object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of this object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of this object.
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
        final AccessPackageResourceEnvironment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackageResources", (n) -> { currentObject.setAccessPackageResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
            this.put("connectionInfo", (n) -> { currentObject.setConnectionInfo(n.getObjectValue(ConnectionInfo::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isDefaultEnvironment", (n) -> { currentObject.setIsDefaultEnvironment(n.getBooleanValue()); });
            this.put("modifiedBy", (n) -> { currentObject.setModifiedBy(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("originId", (n) -> { currentObject.setOriginId(n.getStringValue()); });
            this.put("originSystem", (n) -> { currentObject.setOriginSystem(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefaultEnvironment property value. Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultEnvironment() {
        return this._isDefaultEnvironment;
    }
    /**
     * Gets the modifiedBy property value. The display name of the entity that last modified this object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModifiedBy() {
        return this._modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the originId property value. The unique identifier of this environment in the origin system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginId() {
        return this._originId;
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginSystem() {
        return this._originSystem;
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
        writer.writeCollectionOfObjectValues("accessPackageResources", this.getAccessPackageResources());
        writer.writeObjectValue("connectionInfo", this.getConnectionInfo());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDefaultEnvironment", this.getIsDefaultEnvironment());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
    }
    /**
     * Sets the accessPackageResources property value. Read-only. Required.
     * @param value Value to set for the accessPackageResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResources(@javax.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this._accessPackageResources = value;
    }
    /**
     * Sets the connectionInfo property value. Connection information of an environment used to connect to a resource.
     * @param value Value to set for the connectionInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionInfo(@javax.annotation.Nullable final ConnectionInfo value) {
        this._connectionInfo = value;
    }
    /**
     * Sets the createdBy property value. The display name of the user that created this object.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final String value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time that this object was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of this object.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of this object.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isDefaultEnvironment property value. Determines whether this is default environment or not. It is set to true for all static origin systems, such as Azure AD groups and Azure AD Applications.
     * @param value Value to set for the isDefaultEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultEnvironment(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultEnvironment = value;
    }
    /**
     * Sets the modifiedBy property value. The display name of the entity that last modified this object.
     * @param value Value to set for the modifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedBy(@javax.annotation.Nullable final String value) {
        this._modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The date and time that this object was last modified. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the originId property value. The unique identifier of this environment in the origin system.
     * @param value Value to set for the originId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginId(@javax.annotation.Nullable final String value) {
        this._originId = value;
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, that is, SharePointOnline. Requires $filter (eq).
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginSystem(@javax.annotation.Nullable final String value) {
        this._originSystem = value;
    }
}
