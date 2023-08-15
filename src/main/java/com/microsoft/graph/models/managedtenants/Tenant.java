package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Tenant extends Entity implements Parsable {
    /**
     * The relationship details for the tenant with the managing entity.
     */
    private TenantContract contract;
    /**
     * The date and time the tenant was created in the multi-tenant management platform. Optional. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The display name for the tenant. Required. Read-only.
     */
    private String displayName;
    /**
     * The date and time the tenant was last updated within the multi-tenant management platform. Optional. Read-only.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     */
    private String tenantId;
    /**
     * The onboarding status information for the tenant. Optional. Read-only.
     */
    private TenantStatusInformation tenantStatusInformation;
    /**
     * Instantiates a new tenant and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Tenant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenant
     */
    @jakarta.annotation.Nonnull
    public static Tenant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Tenant();
    }
    /**
     * Gets the contract property value. The relationship details for the tenant with the managing entity.
     * @return a tenantContract
     */
    @jakarta.annotation.Nullable
    public TenantContract getContract() {
        return this.contract;
    }
    /**
     * Gets the createdDateTime property value. The date and time the tenant was created in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The display name for the tenant. Required. Read-only.
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
        deserializerMap.put("contract", (n) -> { this.setContract(n.getObjectValue(TenantContract::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("tenantStatusInformation", (n) -> { this.setTenantStatusInformation(n.getObjectValue(TenantStatusInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time the tenant was last updated within the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the tenantStatusInformation property value. The onboarding status information for the tenant. Optional. Read-only.
     * @return a tenantStatusInformation
     */
    @jakarta.annotation.Nullable
    public TenantStatusInformation getTenantStatusInformation() {
        return this.tenantStatusInformation;
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
    @jakarta.annotation.Nonnull
    public void setContract(@jakarta.annotation.Nullable final TenantContract value) {
        this.contract = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the tenant was created in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time the tenant was last updated within the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the tenantStatusInformation property value. The onboarding status information for the tenant. Optional. Read-only.
     * @param value Value to set for the tenantStatusInformation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantStatusInformation(@jakarta.annotation.Nullable final TenantStatusInformation value) {
        this.tenantStatusInformation = value;
    }
}
