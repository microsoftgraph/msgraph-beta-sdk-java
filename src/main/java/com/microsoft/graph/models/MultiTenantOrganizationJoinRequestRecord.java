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
     * Instantiates a new MultiTenantOrganizationJoinRequestRecord and sets the default values.
     */
    public MultiTenantOrganizationJoinRequestRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MultiTenantOrganizationJoinRequestRecord
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationJoinRequestRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationJoinRequestRecord();
    }
    /**
     * Gets the addedByTenantId property value. Tenant ID of the Microsoft Entra tenant that added a tenant to the multi-tenant organization. To reset a failed join request, set addedByTenantId to 00000000-0000-0000-0000-000000000000. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAddedByTenantId() {
        return this.backingStore.get("addedByTenantId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedByTenantId", (n) -> { this.setAddedByTenantId(n.getStringValue()); });
        deserializerMap.put("memberState", (n) -> { this.setMemberState(n.getEnumValue(MultiTenantOrganizationMemberState::forValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MultiTenantOrganizationMemberRole::forValue)); });
        deserializerMap.put("transitionDetails", (n) -> { this.setTransitionDetails(n.getObjectValue(MultiTenantOrganizationJoinRequestTransitionDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberState property value. State of the tenant in the multi-tenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multi-tenant organization to participate in the multi-tenant organization. Tenants in the active state can participate in the multi-tenant organization. Tenants in the removed state are in the process of being removed from the multi-tenant organization. Read-only.
     * @return a MultiTenantOrganizationMemberState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getMemberState() {
        return this.backingStore.get("memberState");
    }
    /**
     * Gets the role property value. Role of the tenant in the multi-tenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multi-tenant organization. There can be multiple tenants with the owner role in a multi-tenant organization. Tenants with the member role can participate in a multi-tenant organization.
     * @return a MultiTenantOrganizationMemberRole
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the transitionDetails property value. Details of the processing status for a tenant joining a multi-tenant organization. Read-only.
     * @return a MultiTenantOrganizationJoinRequestTransitionDetails
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationJoinRequestTransitionDetails getTransitionDetails() {
        return this.backingStore.get("transitionDetails");
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
     * Sets the addedByTenantId property value. Tenant ID of the Microsoft Entra tenant that added a tenant to the multi-tenant organization. To reset a failed join request, set addedByTenantId to 00000000-0000-0000-0000-000000000000. Required.
     * @param value Value to set for the addedByTenantId property.
     */
    public void setAddedByTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("addedByTenantId", value);
    }
    /**
     * Sets the memberState property value. State of the tenant in the multi-tenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multi-tenant organization to participate in the multi-tenant organization. Tenants in the active state can participate in the multi-tenant organization. Tenants in the removed state are in the process of being removed from the multi-tenant organization. Read-only.
     * @param value Value to set for the memberState property.
     */
    public void setMemberState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.backingStore.set("memberState", value);
    }
    /**
     * Sets the role property value. Role of the tenant in the multi-tenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multi-tenant organization. There can be multiple tenants with the owner role in a multi-tenant organization. Tenants with the member role can participate in a multi-tenant organization.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the transitionDetails property value. Details of the processing status for a tenant joining a multi-tenant organization. Read-only.
     * @param value Value to set for the transitionDetails property.
     */
    public void setTransitionDetails(@jakarta.annotation.Nullable final MultiTenantOrganizationJoinRequestTransitionDetails value) {
        this.backingStore.set("transitionDetails", value);
    }
}
