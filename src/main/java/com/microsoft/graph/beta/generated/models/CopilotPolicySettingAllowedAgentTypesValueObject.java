package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The value of the microsoft.agent.allowedagenttypes policy setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPolicySettingAllowedAgentTypesValueObject extends CopilotPolicySettingValueObject implements Parsable {
    /**
     * Instantiates a new {@link CopilotPolicySettingAllowedAgentTypesValueObject} and sets the default values.
     */
    public CopilotPolicySettingAllowedAgentTypesValueObject() {
        super();
        this.setOdataType("#microsoft.graph.copilotPolicySettingAllowedAgentTypesValueObject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPolicySettingAllowedAgentTypesValueObject}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPolicySettingAllowedAgentTypesValueObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPolicySettingAllowedAgentTypesValueObject();
    }
    /**
     * Gets the areISVAppsAllowed property value. Indicates whether independent software vendor (ISV) apps are allowed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreISVAppsAllowed() {
        return this.backingStore.get("areISVAppsAllowed");
    }
    /**
     * Gets the areMicrosoftAppsAllowed property value. Indicates whether Microsoft apps are allowed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreMicrosoftAppsAllowed() {
        return this.backingStore.get("areMicrosoftAppsAllowed");
    }
    /**
     * Gets the areMicrosoftCertifiedThirdPartyAppsAllowed property value. Indicates whether Microsoft-certified third-party apps are allowed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreMicrosoftCertifiedThirdPartyAppsAllowed() {
        return this.backingStore.get("areMicrosoftCertifiedThirdPartyAppsAllowed");
    }
    /**
     * Gets the areTenantScopedAppsAllowed property value. Indicates whether tenant-scoped apps are allowed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreTenantScopedAppsAllowed() {
        return this.backingStore.get("areTenantScopedAppsAllowed");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("areISVAppsAllowed", (n) -> { this.setAreISVAppsAllowed(n.getBooleanValue()); });
        deserializerMap.put("areMicrosoftAppsAllowed", (n) -> { this.setAreMicrosoftAppsAllowed(n.getBooleanValue()); });
        deserializerMap.put("areMicrosoftCertifiedThirdPartyAppsAllowed", (n) -> { this.setAreMicrosoftCertifiedThirdPartyAppsAllowed(n.getBooleanValue()); });
        deserializerMap.put("areTenantScopedAppsAllowed", (n) -> { this.setAreTenantScopedAppsAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("areISVAppsAllowed", this.getAreISVAppsAllowed());
        writer.writeBooleanValue("areMicrosoftAppsAllowed", this.getAreMicrosoftAppsAllowed());
        writer.writeBooleanValue("areMicrosoftCertifiedThirdPartyAppsAllowed", this.getAreMicrosoftCertifiedThirdPartyAppsAllowed());
        writer.writeBooleanValue("areTenantScopedAppsAllowed", this.getAreTenantScopedAppsAllowed());
    }
    /**
     * Sets the areISVAppsAllowed property value. Indicates whether independent software vendor (ISV) apps are allowed.
     * @param value Value to set for the areISVAppsAllowed property.
     */
    public void setAreISVAppsAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areISVAppsAllowed", value);
    }
    /**
     * Sets the areMicrosoftAppsAllowed property value. Indicates whether Microsoft apps are allowed.
     * @param value Value to set for the areMicrosoftAppsAllowed property.
     */
    public void setAreMicrosoftAppsAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areMicrosoftAppsAllowed", value);
    }
    /**
     * Sets the areMicrosoftCertifiedThirdPartyAppsAllowed property value. Indicates whether Microsoft-certified third-party apps are allowed.
     * @param value Value to set for the areMicrosoftCertifiedThirdPartyAppsAllowed property.
     */
    public void setAreMicrosoftCertifiedThirdPartyAppsAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areMicrosoftCertifiedThirdPartyAppsAllowed", value);
    }
    /**
     * Sets the areTenantScopedAppsAllowed property value. Indicates whether tenant-scoped apps are allowed.
     * @param value Value to set for the areTenantScopedAppsAllowed property.
     */
    public void setAreTenantScopedAppsAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areTenantScopedAppsAllowed", value);
    }
}
