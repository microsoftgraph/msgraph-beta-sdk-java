package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantOrganization extends Entity implements Parsable {
    /**
     * Date when multi-tenant organization was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the multi-tenant organization.
     */
    private String description;
    /**
     * Display name of the multi-tenant organization.
     */
    private String displayName;
    /**
     * Defines the status of a tenant joining a multi-tenant organization.
     */
    private MultiTenantOrganizationJoinRequestRecord joinRequest;
    /**
     * State of the multi-tenant organization. The possible values are: active, inactive, unknownFutureValue. active indicates the multi-tenant organization is created. inactive indicates the multi-tenant organization is not created. Read-only.
     */
    private MultiTenantOrganizationState state;
    /**
     * Defines tenants added to a multi-tenant organization.
     */
    private java.util.List<MultiTenantOrganizationMember> tenants;
    /**
     * Instantiates a new multiTenantOrganization and sets the default values.
     */
    public MultiTenantOrganization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganization
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganization();
    }
    /**
     * Gets the createdDateTime property value. Date when multi-tenant organization was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the multi-tenant organization.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the multi-tenant organization.
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("joinRequest", (n) -> { this.setJoinRequest(n.getObjectValue(MultiTenantOrganizationJoinRequestRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MultiTenantOrganizationState.class)); });
        deserializerMap.put("tenants", (n) -> { this.setTenants(n.getCollectionOfObjectValues(MultiTenantOrganizationMember::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the joinRequest property value. Defines the status of a tenant joining a multi-tenant organization.
     * @return a multiTenantOrganizationJoinRequestRecord
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationJoinRequestRecord getJoinRequest() {
        return this.joinRequest;
    }
    /**
     * Gets the state property value. State of the multi-tenant organization. The possible values are: active, inactive, unknownFutureValue. active indicates the multi-tenant organization is created. inactive indicates the multi-tenant organization is not created. Read-only.
     * @return a multiTenantOrganizationState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationState getState() {
        return this.state;
    }
    /**
     * Gets the tenants property value. Defines tenants added to a multi-tenant organization.
     * @return a multiTenantOrganizationMember
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiTenantOrganizationMember> getTenants() {
        return this.tenants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("joinRequest", this.getJoinRequest());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("tenants", this.getTenants());
    }
    /**
     * Sets the createdDateTime property value. Date when multi-tenant organization was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the multi-tenant organization.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the multi-tenant organization.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the joinRequest property value. Defines the status of a tenant joining a multi-tenant organization.
     * @param value Value to set for the joinRequest property.
     */
    public void setJoinRequest(@jakarta.annotation.Nullable final MultiTenantOrganizationJoinRequestRecord value) {
        this.joinRequest = value;
    }
    /**
     * Sets the state property value. State of the multi-tenant organization. The possible values are: active, inactive, unknownFutureValue. active indicates the multi-tenant organization is created. inactive indicates the multi-tenant organization is not created. Read-only.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MultiTenantOrganizationState value) {
        this.state = value;
    }
    /**
     * Sets the tenants property value. Defines tenants added to a multi-tenant organization.
     * @param value Value to set for the tenants property.
     */
    public void setTenants(@jakarta.annotation.Nullable final java.util.List<MultiTenantOrganizationMember> value) {
        this.tenants = value;
    }
}
