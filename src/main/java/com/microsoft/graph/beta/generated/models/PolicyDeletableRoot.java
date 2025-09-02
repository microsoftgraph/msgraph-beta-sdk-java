package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyDeletableRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyDeletableRoot} and sets the default values.
     */
    public PolicyDeletableRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyDeletableRoot}
     */
    @jakarta.annotation.Nonnull
    public static PolicyDeletableRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyDeletableRoot();
    }
    /**
     * Gets the crossTenantPartners property value. Represents the partner-specific configuration for cross-tenant access and tenant restrictions. Cross-tenant access settings include inbound and outbound settings of Microsoft Entra B2B collaboration and B2B direct connect.
     * @return a {@link java.util.List<CrossTenantAccessPolicyConfigurationPartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CrossTenantAccessPolicyConfigurationPartner> getCrossTenantPartners() {
        return this.backingStore.get("crossTenantPartners");
    }
    /**
     * Gets the crossTenantSyncPolicyPartners property value. Defines the cross-tenant policy for synchronization of users from a partner tenant. Use this user synchronization policy to streamline collaboration between users in a multi-tenant organization by automating the creation, update, and deletion of users from one tenant to another.
     * @return a {@link java.util.List<CrossTenantIdentitySyncPolicyPartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CrossTenantIdentitySyncPolicyPartner> getCrossTenantSyncPolicyPartners() {
        return this.backingStore.get("crossTenantSyncPolicyPartners");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("crossTenantPartners", (n) -> { this.setCrossTenantPartners(n.getCollectionOfObjectValues(CrossTenantAccessPolicyConfigurationPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("crossTenantSyncPolicyPartners", (n) -> { this.setCrossTenantSyncPolicyPartners(n.getCollectionOfObjectValues(CrossTenantIdentitySyncPolicyPartner::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("crossTenantPartners", this.getCrossTenantPartners());
        writer.writeCollectionOfObjectValues("crossTenantSyncPolicyPartners", this.getCrossTenantSyncPolicyPartners());
    }
    /**
     * Sets the crossTenantPartners property value. Represents the partner-specific configuration for cross-tenant access and tenant restrictions. Cross-tenant access settings include inbound and outbound settings of Microsoft Entra B2B collaboration and B2B direct connect.
     * @param value Value to set for the crossTenantPartners property.
     */
    public void setCrossTenantPartners(@jakarta.annotation.Nullable final java.util.List<CrossTenantAccessPolicyConfigurationPartner> value) {
        this.backingStore.set("crossTenantPartners", value);
    }
    /**
     * Sets the crossTenantSyncPolicyPartners property value. Defines the cross-tenant policy for synchronization of users from a partner tenant. Use this user synchronization policy to streamline collaboration between users in a multi-tenant organization by automating the creation, update, and deletion of users from one tenant to another.
     * @param value Value to set for the crossTenantSyncPolicyPartners property.
     */
    public void setCrossTenantSyncPolicyPartners(@jakarta.annotation.Nullable final java.util.List<CrossTenantIdentitySyncPolicyPartner> value) {
        this.backingStore.set("crossTenantSyncPolicyPartners", value);
    }
}
