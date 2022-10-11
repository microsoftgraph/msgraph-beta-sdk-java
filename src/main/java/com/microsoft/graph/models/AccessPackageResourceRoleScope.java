package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AccessPackageResourceRoleScope extends Entity implements Parsable {
    /** Read-only. Nullable. Supports $expand. */
    private AccessPackageResourceRole _accessPackageResourceRole;
    /** The accessPackageResourceScope property */
    private AccessPackageResourceScope _accessPackageResourceScope;
    /** The createdBy property */
    private String _createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** The modifiedBy property */
    private String _modifiedBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _modifiedDateTime;
    /**
     * Instantiates a new accessPackageResourceRoleScope and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceRoleScope() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageResourceRoleScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRoleScope
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceRoleScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRoleScope();
    }
    /**
     * Gets the accessPackageResourceRole property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nullable
    public AccessPackageResourceRole getAccessPackageResourceRole() {
        return this._accessPackageResourceRole;
    }
    /**
     * Gets the accessPackageResourceScope property value. The accessPackageResourceScope property
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public AccessPackageResourceScope getAccessPackageResourceScope() {
        return this._accessPackageResourceScope;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageResourceRoleScope currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackageResourceRole", (n) -> { currentObject.setAccessPackageResourceRole(n.getObjectValue(AccessPackageResourceRole::createFromDiscriminatorValue)); });
            this.put("accessPackageResourceScope", (n) -> { currentObject.setAccessPackageResourceScope(n.getObjectValue(AccessPackageResourceScope::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("modifiedBy", (n) -> { currentObject.setModifiedBy(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the modifiedBy property value. The modifiedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModifiedBy() {
        return this._modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
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
        writer.writeObjectValue("accessPackageResourceRole", this.getAccessPackageResourceRole());
        writer.writeObjectValue("accessPackageResourceScope", this.getAccessPackageResourceScope());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the accessPackageResourceRole property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackageResourceRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceRole(@javax.annotation.Nullable final AccessPackageResourceRole value) {
        this._accessPackageResourceRole = value;
    }
    /**
     * Sets the accessPackageResourceScope property value. The accessPackageResourceScope property
     * @param value Value to set for the accessPackageResourceScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceScope(@javax.annotation.Nullable final AccessPackageResourceScope value) {
        this._accessPackageResourceScope = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final String value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the modifiedBy property value. The modifiedBy property
     * @param value Value to set for the modifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedBy(@javax.annotation.Nullable final String value) {
        this._modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
}
