package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class Tenant extends Entity implements Parsable {
    /** The relationship details for the tenant with the managing entity. */
    private TenantContract _contract;
    /** The date and time the tenant was created in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The display name for the tenant. Required. Read-only. */
    private String _displayName;
    /** The date and time the tenant was last updated within the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String _tenantId;
    /** The onboarding status information for the tenant. Optional. Read-only. */
    private TenantStatusInformation _tenantStatusInformation;
    /**
     * Instantiates a new tenant and sets the default values.
     * @return a void
     */
    public Tenant() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.tenant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenant
     */
    @javax.annotation.Nonnull
    public static Tenant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Tenant();
    }
    /**
     * Gets the contract property value. The relationship details for the tenant with the managing entity.
     * @return a tenantContract
     */
    @javax.annotation.Nullable
    public TenantContract getContract() {
        return this._contract;
    }
    /**
     * Gets the createdDateTime property value. The date and time the tenant was created in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The display name for the tenant. Required. Read-only.
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
        final Tenant currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contract", (n) -> { currentObject.setContract(n.getObjectValue(TenantContract::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("tenantStatusInformation", (n) -> { currentObject.setTenantStatusInformation(n.getObjectValue(TenantStatusInformation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time the tenant was last updated within the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the tenantStatusInformation property value. The onboarding status information for the tenant. Optional. Read-only.
     * @return a tenantStatusInformation
     */
    @javax.annotation.Nullable
    public TenantStatusInformation getTenantStatusInformation() {
        return this._tenantStatusInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contract", this.getContract());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("tenantStatusInformation", this.getTenantStatusInformation());
    }
    /**
     * Sets the contract property value. The relationship details for the tenant with the managing entity.
     * @param value Value to set for the contract property.
     * @return a void
     */
    public void setContract(@javax.annotation.Nullable final TenantContract value) {
        this._contract = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the tenant was created in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time the tenant was last updated within the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the tenantStatusInformation property value. The onboarding status information for the tenant. Optional. Read-only.
     * @param value Value to set for the tenantStatusInformation property.
     * @return a void
     */
    public void setTenantStatusInformation(@javax.annotation.Nullable final TenantStatusInformation value) {
        this._tenantStatusInformation = value;
    }
}
