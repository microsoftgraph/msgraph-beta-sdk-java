package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantTag extends Entity implements Parsable {
    /** The identifier for the account that created the tenant tag. Required. Read-only. */
    private String createdByUserId;
    /** The date and time when the tenant tag was created. Required. Read-only. */
    private OffsetDateTime createdDateTime;
    /** The date and time when the tenant tag was deleted. Required. Read-only. */
    private OffsetDateTime deletedDateTime;
    /** The description for the tenant tag. Optional. Read-only. */
    private String description;
    /** The display name for the tenant tag. Required. Read-only. */
    private String displayName;
    /** The identifier for the account that lasted on the tenant tag. Optional. Read-only. */
    private String lastActionByUserId;
    /** The date and time the last action was performed against the tenant tag. Optional. Read-only. */
    private OffsetDateTime lastActionDateTime;
    /** The collection of managed tenants associated with the tenant tag. Optional. */
    private java.util.List<TenantInfo> tenants;
    /**
     * Instantiates a new TenantTag and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TenantTag
     */
    @javax.annotation.Nonnull
    public static TenantTag createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantTag();
    }
    /**
     * Gets the createdByUserId property value. The identifier for the account that created the tenant tag. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the tenant tag was created. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the tenant tag was deleted. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * Gets the description property value. The description for the tenant tag. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the tenant tag. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenants", (n) -> { this.setTenants(n.getCollectionOfObjectValues(TenantInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The identifier for the account that lasted on the tenant tag. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this.lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The date and time the last action was performed against the tenant tag. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the tenants property value. The collection of managed tenants associated with the tenant tag. Optional.
     * @return a tenantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<TenantInfo> getTenants() {
        return this.tenants;
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
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeCollectionOfObjectValues("tenants", this.getTenants());
    }
    /**
     * Sets the createdByUserId property value. The identifier for the account that created the tenant tag. Required. Read-only.
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the tenant tag was created. Required. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the tenant tag was deleted. Required. Read-only.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.deletedDateTime = value;
    }
    /**
     * Sets the description property value. The description for the tenant tag. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant tag. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastActionByUserId property value. The identifier for the account that lasted on the tenant tag. Optional. Read-only.
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this.lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The date and time the last action was performed against the tenant tag. Optional. Read-only.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the tenants property value. The collection of managed tenants associated with the tenant tag. Optional.
     * @param value Value to set for the tenants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenants(@javax.annotation.Nullable final java.util.List<TenantInfo> value) {
        this.tenants = value;
    }
}
