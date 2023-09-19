package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantOrganizationJoinRequestRecord extends Entity implements Parsable {
    /**
     * Tenant ID of the Azure Active Directory tenant that added a tenant to the multi-tenant organization. To reset a failed join request, set addedByTenantId to 00000000-0000-0000-0000-000000000000. Required.
     */
    private String addedByTenantId;
    /**
     * State of the tenant in the multi-tenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multi-tenant organization to participate in the multi-tenant organization. Tenants in the active state can participate in the multi-tenant organization. Tenants in the removed state are in the process of being removed from the multi-tenant organization. Read-only.
     */
    private MultiTenantOrganizationMemberState memberState;
    /**
     * Role of the tenant in the multi-tenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multi-tenant organization. There can be multiple tenants with the owner role in a multi-tenant organization. Tenants with the member role can participate in a multi-tenant organization.
     */
    private MultiTenantOrganizationMemberRole role;
    /**
     * Details of the processing status for a tenant joining a multi-tenant organization. Read-only.
     */
    private MultiTenantOrganizationJoinRequestTransitionDetails transitionDetails;
    /**
     * Instantiates a new multiTenantOrganizationJoinRequestRecord and sets the default values.
     */
    public MultiTenantOrganizationJoinRequestRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationJoinRequestRecord
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationJoinRequestRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationJoinRequestRecord();
    }
    /**
     * Gets the addedByTenantId property value. Tenant ID of the Azure Active Directory tenant that added a tenant to the multi-tenant organization. To reset a failed join request, set addedByTenantId to 00000000-0000-0000-0000-000000000000. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAddedByTenantId() {
        return this.addedByTenantId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedByTenantId", (n) -> { this.setAddedByTenantId(n.getStringValue()); });
        deserializerMap.put("memberState", (n) -> { this.setMemberState(n.getEnumValue(MultiTenantOrganizationMemberState.class)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MultiTenantOrganizationMemberRole.class)); });
        deserializerMap.put("transitionDetails", (n) -> { this.setTransitionDetails(n.getObjectValue(MultiTenantOrganizationJoinRequestTransitionDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberState property value. State of the tenant in the multi-tenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multi-tenant organization to participate in the multi-tenant organization. Tenants in the active state can participate in the multi-tenant organization. Tenants in the removed state are in the process of being removed from the multi-tenant organization. Read-only.
     * @return a multiTenantOrganizationMemberState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getMemberState() {
        return this.memberState;
    }
    /**
     * Gets the role property value. Role of the tenant in the multi-tenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multi-tenant organization. There can be multiple tenants with the owner role in a multi-tenant organization. Tenants with the member role can participate in a multi-tenant organization.
     * @return a multiTenantOrganizationMemberRole
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberRole getRole() {
        return this.role;
    }
    /**
     * Gets the transitionDetails property value. Details of the processing status for a tenant joining a multi-tenant organization. Read-only.
     * @return a multiTenantOrganizationJoinRequestTransitionDetails
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationJoinRequestTransitionDetails getTransitionDetails() {
        return this.transitionDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("addedByTenantId", this.getAddedByTenantId());
        writer.writeEnumValue("memberState", this.getMemberState());
        writer.writeEnumValue("role", this.getRole());
        writer.writeObjectValue("transitionDetails", this.getTransitionDetails());
    }
    /**
     * Sets the addedByTenantId property value. Tenant ID of the Azure Active Directory tenant that added a tenant to the multi-tenant organization. To reset a failed join request, set addedByTenantId to 00000000-0000-0000-0000-000000000000. Required.
     * @param value Value to set for the addedByTenantId property.
     */
    public void setAddedByTenantId(@jakarta.annotation.Nullable final String value) {
        this.addedByTenantId = value;
    }
    /**
     * Sets the memberState property value. State of the tenant in the multi-tenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multi-tenant organization to participate in the multi-tenant organization. Tenants in the active state can participate in the multi-tenant organization. Tenants in the removed state are in the process of being removed from the multi-tenant organization. Read-only.
     * @param value Value to set for the memberState property.
     */
    public void setMemberState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.memberState = value;
    }
    /**
     * Sets the role property value. Role of the tenant in the multi-tenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multi-tenant organization. There can be multiple tenants with the owner role in a multi-tenant organization. Tenants with the member role can participate in a multi-tenant organization.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.role = value;
    }
    /**
     * Sets the transitionDetails property value. Details of the processing status for a tenant joining a multi-tenant organization. Read-only.
     * @param value Value to set for the transitionDetails property.
     */
    public void setTransitionDetails(@jakarta.annotation.Nullable final MultiTenantOrganizationJoinRequestTransitionDetails value) {
        this.transitionDetails = value;
    }
}
