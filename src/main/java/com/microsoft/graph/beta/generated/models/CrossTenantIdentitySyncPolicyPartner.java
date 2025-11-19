package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantIdentitySyncPolicyPartner extends PolicyDeletableItem implements Parsable {
    /**
     * Instantiates a new {@link CrossTenantIdentitySyncPolicyPartner} and sets the default values.
     */
    public CrossTenantIdentitySyncPolicyPartner() {
        super();
        this.setOdataType("#microsoft.graph.crossTenantIdentitySyncPolicyPartner");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CrossTenantIdentitySyncPolicyPartner}
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantIdentitySyncPolicyPartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantIdentitySyncPolicyPartner();
    }
    /**
     * Gets the displayName property value. Display name for the cross-tenant user synchronization policy. Use the name of the partner Microsoft Entra tenant to easily identify the policy. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalCloudAuthorizedApplicationId property value. The externalCloudAuthorizedApplicationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalCloudAuthorizedApplicationId() {
        return this.backingStore.get("externalCloudAuthorizedApplicationId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalCloudAuthorizedApplicationId", (n) -> { this.setExternalCloudAuthorizedApplicationId(n.getStringValue()); });
        deserializerMap.put("groupSyncInbound", (n) -> { this.setGroupSyncInbound(n.getObjectValue(CrossTenantGroupSyncInbound::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userSyncInbound", (n) -> { this.setUserSyncInbound(n.getObjectValue(CrossTenantUserSyncInbound::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupSyncInbound property value. The groupSyncInbound property
     * @return a {@link CrossTenantGroupSyncInbound}
     */
    @jakarta.annotation.Nullable
    public CrossTenantGroupSyncInbound getGroupSyncInbound() {
        return this.backingStore.get("groupSyncInbound");
    }
    /**
     * Gets the tenantId property value. Tenant identifier for the partner Microsoft Entra organization. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the userSyncInbound property value. Defines whether users can be synchronized from the partner tenant. Key.
     * @return a {@link CrossTenantUserSyncInbound}
     */
    @jakarta.annotation.Nullable
    public CrossTenantUserSyncInbound getUserSyncInbound() {
        return this.backingStore.get("userSyncInbound");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalCloudAuthorizedApplicationId", this.getExternalCloudAuthorizedApplicationId());
        writer.writeObjectValue("groupSyncInbound", this.getGroupSyncInbound());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("userSyncInbound", this.getUserSyncInbound());
    }
    /**
     * Sets the displayName property value. Display name for the cross-tenant user synchronization policy. Use the name of the partner Microsoft Entra tenant to easily identify the policy. Optional.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalCloudAuthorizedApplicationId property value. The externalCloudAuthorizedApplicationId property
     * @param value Value to set for the externalCloudAuthorizedApplicationId property.
     */
    public void setExternalCloudAuthorizedApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalCloudAuthorizedApplicationId", value);
    }
    /**
     * Sets the groupSyncInbound property value. The groupSyncInbound property
     * @param value Value to set for the groupSyncInbound property.
     */
    public void setGroupSyncInbound(@jakarta.annotation.Nullable final CrossTenantGroupSyncInbound value) {
        this.backingStore.set("groupSyncInbound", value);
    }
    /**
     * Sets the tenantId property value. Tenant identifier for the partner Microsoft Entra organization. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the userSyncInbound property value. Defines whether users can be synchronized from the partner tenant. Key.
     * @param value Value to set for the userSyncInbound property.
     */
    public void setUserSyncInbound(@jakarta.annotation.Nullable final CrossTenantUserSyncInbound value) {
        this.backingStore.set("userSyncInbound", value);
    }
}
