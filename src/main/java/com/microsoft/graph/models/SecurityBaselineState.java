package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Security baseline state for a device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityBaselineState extends Entity implements Parsable {
    /**
     * Instantiates a new SecurityBaselineState and sets the default values.
     */
    public SecurityBaselineState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityBaselineState
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineState();
    }
    /**
     * Gets the displayName property value. The display name of the security baseline
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("securityBaselineTemplateId", (n) -> { this.setSecurityBaselineTemplateId(n.getStringValue()); });
        deserializerMap.put("settingStates", (n) -> { this.setSettingStates(n.getCollectionOfObjectValues(SecurityBaselineSettingState::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SecurityBaselineComplianceState::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the securityBaselineTemplateId property value. The security baseline template id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSecurityBaselineTemplateId() {
        return this.backingStore.get("securityBaselineTemplateId");
    }
    /**
     * Gets the settingStates property value. The security baseline state for different settings for a device
     * @return a java.util.List<SecurityBaselineSettingState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineSettingState> getSettingStates() {
        return this.backingStore.get("settingStates");
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a SecurityBaselineComplianceState
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("securityBaselineTemplateId", this.getSecurityBaselineTemplateId());
        writer.writeCollectionOfObjectValues("settingStates", this.getSettingStates());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the displayName property value. The display name of the security baseline
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the securityBaselineTemplateId property value. The security baseline template id
     * @param value Value to set for the securityBaselineTemplateId property.
     */
    public void setSecurityBaselineTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityBaselineTemplateId", value);
    }
    /**
     * Sets the settingStates property value. The security baseline state for different settings for a device
     * @param value Value to set for the settingStates property.
     */
    public void setSettingStates(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineSettingState> value) {
        this.backingStore.set("settingStates", value);
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SecurityBaselineComplianceState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
