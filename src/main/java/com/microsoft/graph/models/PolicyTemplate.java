package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PolicyTemplate extends Entity implements Parsable {
    /**
     * The multiTenantOrganizationIdentitySynchronization property
     */
    private MultiTenantOrganizationIdentitySyncPolicyTemplate multiTenantOrganizationIdentitySynchronization;
    /**
     * The multiTenantOrganizationPartnerConfiguration property
     */
    private MultiTenantOrganizationPartnerConfigurationTemplate multiTenantOrganizationPartnerConfiguration;
    /**
     * Instantiates a new policyTemplate and sets the default values.
     */
    public PolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policyTemplate
     */
    @jakarta.annotation.Nonnull
    public static PolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("multiTenantOrganizationIdentitySynchronization", (n) -> { this.setMultiTenantOrganizationIdentitySynchronization(n.getObjectValue(MultiTenantOrganizationIdentitySyncPolicyTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("multiTenantOrganizationPartnerConfiguration", (n) -> { this.setMultiTenantOrganizationPartnerConfiguration(n.getObjectValue(MultiTenantOrganizationPartnerConfigurationTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the multiTenantOrganizationIdentitySynchronization property value. The multiTenantOrganizationIdentitySynchronization property
     * @return a multiTenantOrganizationIdentitySyncPolicyTemplate
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationIdentitySyncPolicyTemplate getMultiTenantOrganizationIdentitySynchronization() {
        return this.multiTenantOrganizationIdentitySynchronization;
    }
    /**
     * Gets the multiTenantOrganizationPartnerConfiguration property value. The multiTenantOrganizationPartnerConfiguration property
     * @return a multiTenantOrganizationPartnerConfigurationTemplate
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationPartnerConfigurationTemplate getMultiTenantOrganizationPartnerConfiguration() {
        return this.multiTenantOrganizationPartnerConfiguration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("multiTenantOrganizationIdentitySynchronization", this.getMultiTenantOrganizationIdentitySynchronization());
        writer.writeObjectValue("multiTenantOrganizationPartnerConfiguration", this.getMultiTenantOrganizationPartnerConfiguration());
    }
    /**
     * Sets the multiTenantOrganizationIdentitySynchronization property value. The multiTenantOrganizationIdentitySynchronization property
     * @param value Value to set for the multiTenantOrganizationIdentitySynchronization property.
     */
    public void setMultiTenantOrganizationIdentitySynchronization(@jakarta.annotation.Nullable final MultiTenantOrganizationIdentitySyncPolicyTemplate value) {
        this.multiTenantOrganizationIdentitySynchronization = value;
    }
    /**
     * Sets the multiTenantOrganizationPartnerConfiguration property value. The multiTenantOrganizationPartnerConfiguration property
     * @param value Value to set for the multiTenantOrganizationPartnerConfiguration property.
     */
    public void setMultiTenantOrganizationPartnerConfiguration(@jakarta.annotation.Nullable final MultiTenantOrganizationPartnerConfigurationTemplate value) {
        this.multiTenantOrganizationPartnerConfiguration = value;
    }
}
