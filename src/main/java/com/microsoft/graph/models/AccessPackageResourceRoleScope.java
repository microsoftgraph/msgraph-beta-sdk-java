package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceRoleScope extends Entity implements Parsable {
    /**
     * Read-only. Nullable. Supports $expand.
     */
    private AccessPackageResourceRole accessPackageResourceRole;
    /**
     * The accessPackageResourceScope property
     */
    private AccessPackageResourceScope accessPackageResourceScope;
    /**
     * The createdBy property
     */
    private String createdBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * The modifiedBy property
     */
    private String modifiedBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Instantiates a new accessPackageResourceRoleScope and sets the default values.
     */
    public AccessPackageResourceRoleScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRoleScope
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceRoleScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRoleScope();
    }
    /**
     * Gets the accessPackageResourceRole property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageResourceRole
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceRole getAccessPackageResourceRole() {
        return this.accessPackageResourceRole;
    }
    /**
     * Gets the accessPackageResourceScope property value. The accessPackageResourceScope property
     * @return a accessPackageResourceScope
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceScope getAccessPackageResourceScope() {
        return this.accessPackageResourceScope;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageResourceRole", (n) -> { this.setAccessPackageResourceRole(n.getObjectValue(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceScope", (n) -> { this.setAccessPackageResourceScope(n.getObjectValue(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedBy property value. The modifiedBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccessPackageResourceRole(@jakarta.annotation.Nullable final AccessPackageResourceRole value) {
        this.accessPackageResourceRole = value;
    }
    /**
     * Sets the accessPackageResourceScope property value. The accessPackageResourceScope property
     * @param value Value to set for the accessPackageResourceScope property.
     */
    public void setAccessPackageResourceScope(@jakarta.annotation.Nullable final AccessPackageResourceScope value) {
        this.accessPackageResourceScope = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the modifiedBy property value. The modifiedBy property
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
}
