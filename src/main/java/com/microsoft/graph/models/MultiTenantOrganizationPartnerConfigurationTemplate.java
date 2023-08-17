package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MultiTenantOrganizationPartnerConfigurationTemplate extends Entity implements Parsable {
    /**
     * The automaticUserConsentSettings property
     */
    private InboundOutboundPolicyConfiguration automaticUserConsentSettings;
    /**
     * The b2bCollaborationInbound property
     */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationInbound;
    /**
     * The b2bCollaborationOutbound property
     */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationOutbound;
    /**
     * The b2bDirectConnectInbound property
     */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectInbound;
    /**
     * The b2bDirectConnectOutbound property
     */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectOutbound;
    /**
     * The inboundTrust property
     */
    private CrossTenantAccessPolicyInboundTrust inboundTrust;
    /**
     * The templateApplicationLevel property
     */
    private TemplateApplicationLevel templateApplicationLevel;
    /**
     * Instantiates a new multiTenantOrganizationPartnerConfigurationTemplate and sets the default values.
     */
    public MultiTenantOrganizationPartnerConfigurationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationPartnerConfigurationTemplate
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationPartnerConfigurationTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationPartnerConfigurationTemplate();
    }
    /**
     * Gets the automaticUserConsentSettings property value. The automaticUserConsentSettings property
     * @return a inboundOutboundPolicyConfiguration
     */
    @jakarta.annotation.Nullable
    public InboundOutboundPolicyConfiguration getAutomaticUserConsentSettings() {
        return this.automaticUserConsentSettings;
    }
    /**
     * Gets the b2bCollaborationInbound property value. The b2bCollaborationInbound property
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationInbound() {
        return this.b2bCollaborationInbound;
    }
    /**
     * Gets the b2bCollaborationOutbound property value. The b2bCollaborationOutbound property
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationOutbound() {
        return this.b2bCollaborationOutbound;
    }
    /**
     * Gets the b2bDirectConnectInbound property value. The b2bDirectConnectInbound property
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectInbound() {
        return this.b2bDirectConnectInbound;
    }
    /**
     * Gets the b2bDirectConnectOutbound property value. The b2bDirectConnectOutbound property
     * @return a crossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectOutbound() {
        return this.b2bDirectConnectOutbound;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("automaticUserConsentSettings", (n) -> { this.setAutomaticUserConsentSettings(n.getObjectValue(InboundOutboundPolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationInbound", (n) -> { this.setB2bCollaborationInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationOutbound", (n) -> { this.setB2bCollaborationOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectInbound", (n) -> { this.setB2bDirectConnectInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectOutbound", (n) -> { this.setB2bDirectConnectOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundTrust", (n) -> { this.setInboundTrust(n.getObjectValue(CrossTenantAccessPolicyInboundTrust::createFromDiscriminatorValue)); });
        deserializerMap.put("templateApplicationLevel", (n) -> { this.setTemplateApplicationLevel(n.getEnumValue(TemplateApplicationLevel.class)); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTrust property value. The inboundTrust property
     * @return a crossTenantAccessPolicyInboundTrust
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust getInboundTrust() {
        return this.inboundTrust;
    }
    /**
     * Gets the templateApplicationLevel property value. The templateApplicationLevel property
     * @return a templateApplicationLevel
     */
    @jakarta.annotation.Nullable
    public TemplateApplicationLevel getTemplateApplicationLevel() {
        return this.templateApplicationLevel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("automaticUserConsentSettings", this.getAutomaticUserConsentSettings());
        writer.writeObjectValue("b2bCollaborationInbound", this.getB2bCollaborationInbound());
        writer.writeObjectValue("b2bCollaborationOutbound", this.getB2bCollaborationOutbound());
        writer.writeObjectValue("b2bDirectConnectInbound", this.getB2bDirectConnectInbound());
        writer.writeObjectValue("b2bDirectConnectOutbound", this.getB2bDirectConnectOutbound());
        writer.writeObjectValue("inboundTrust", this.getInboundTrust());
        writer.writeEnumValue("templateApplicationLevel", this.getTemplateApplicationLevel());
    }
    /**
     * Sets the automaticUserConsentSettings property value. The automaticUserConsentSettings property
     * @param value Value to set for the automaticUserConsentSettings property.
     */
    public void setAutomaticUserConsentSettings(@jakarta.annotation.Nullable final InboundOutboundPolicyConfiguration value) {
        this.automaticUserConsentSettings = value;
    }
    /**
     * Sets the b2bCollaborationInbound property value. The b2bCollaborationInbound property
     * @param value Value to set for the b2bCollaborationInbound property.
     */
    public void setB2bCollaborationInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationInbound = value;
    }
    /**
     * Sets the b2bCollaborationOutbound property value. The b2bCollaborationOutbound property
     * @param value Value to set for the b2bCollaborationOutbound property.
     */
    public void setB2bCollaborationOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationOutbound = value;
    }
    /**
     * Sets the b2bDirectConnectInbound property value. The b2bDirectConnectInbound property
     * @param value Value to set for the b2bDirectConnectInbound property.
     */
    public void setB2bDirectConnectInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectInbound = value;
    }
    /**
     * Sets the b2bDirectConnectOutbound property value. The b2bDirectConnectOutbound property
     * @param value Value to set for the b2bDirectConnectOutbound property.
     */
    public void setB2bDirectConnectOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectOutbound = value;
    }
    /**
     * Sets the inboundTrust property value. The inboundTrust property
     * @param value Value to set for the inboundTrust property.
     */
    public void setInboundTrust(@jakarta.annotation.Nullable final CrossTenantAccessPolicyInboundTrust value) {
        this.inboundTrust = value;
    }
    /**
     * Sets the templateApplicationLevel property value. The templateApplicationLevel property
     * @param value Value to set for the templateApplicationLevel property.
     */
    public void setTemplateApplicationLevel(@jakarta.annotation.Nullable final TemplateApplicationLevel value) {
        this.templateApplicationLevel = value;
    }
}
