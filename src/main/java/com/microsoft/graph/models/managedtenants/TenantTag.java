package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class TenantTag extends Entity implements Parsable {
    /** The identifier for the account that created the tenant tag. Required. Read-only.  */
    private String _createdByUserId;
    /** The date and time when the tenant tag was created. Required. Read-only.  */
    private OffsetDateTime _createdDateTime;
    /** The date and time when the tenant tag was deleted. Required. Read-only.  */
    private OffsetDateTime _deletedDateTime;
    /** The description for the tenant tag. Optional. Read-only.  */
    private String _description;
    /** The display name for the tenant tag. Required. Read-only.  */
    private String _displayName;
    /** The identifier for the account that lasted on the tenant tag. Optional. Read-only.  */
    private String _lastActionByUserId;
    /** The date and time the last action was performed against the tenant tag. Optional. Read-only.  */
    private OffsetDateTime _lastActionDateTime;
    /** The collection of managed tenants associated with the tenant tag. Optional.  */
    private java.util.List<TenantInfo> _tenants;
    /**
     * Instantiates a new tenantTag and sets the default values.
     * @return a void
     */
    public TenantTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantTag
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
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the tenant tag was created. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the tenant tag was deleted. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this._deletedDateTime;
    }
    /**
     * Gets the description property value. The description for the tenant tag. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the tenant tag. Required. Read-only.
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
        final TenantTag currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deletedDateTime", (n) -> { currentObject.setDeletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("tenants", (n) -> { currentObject.setTenants(n.getCollectionOfObjectValues(TenantInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastActionByUserId property value. The identifier for the account that lasted on the tenant tag. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The date and time the last action was performed against the tenant tag. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the tenants property value. The collection of managed tenants associated with the tenant tag. Optional.
     * @return a tenantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<TenantInfo> getTenants() {
        return this._tenants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the tenant tag was created. Required. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the tenant tag was deleted. Required. Read-only.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deletedDateTime = value;
    }
    /**
     * Sets the description property value. The description for the tenant tag. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant tag. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastActionByUserId property value. The identifier for the account that lasted on the tenant tag. Optional. Read-only.
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The date and time the last action was performed against the tenant tag. Optional. Read-only.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the tenants property value. The collection of managed tenants associated with the tenant tag. Optional.
     * @param value Value to set for the tenants property.
     * @return a void
     */
    public void setTenants(@javax.annotation.Nullable final java.util.List<TenantInfo> value) {
        this._tenants = value;
    }
}
