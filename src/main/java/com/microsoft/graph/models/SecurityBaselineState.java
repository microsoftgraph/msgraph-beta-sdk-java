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
public class SecurityBaselineState extends Entity implements Parsable {
    /**
     * The display name of the security baseline
     */
    private String displayName;
    /**
     * The security baseline template id
     */
    private String securityBaselineTemplateId;
    /**
     * The security baseline state for different settings for a device
     */
    private java.util.List<SecurityBaselineSettingState> settingStates;
    /**
     * Security Baseline Compliance State
     */
    private SecurityBaselineComplianceState state;
    /**
     * User Principal Name
     */
    private String userPrincipalName;
    /**
     * Instantiates a new securityBaselineState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityBaselineState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineState
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineState();
    }
    /**
     * Gets the displayName property value. The display name of the security baseline
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("securityBaselineTemplateId", (n) -> { this.setSecurityBaselineTemplateId(n.getStringValue()); });
        deserializerMap.put("settingStates", (n) -> { this.setSettingStates(n.getCollectionOfObjectValues(SecurityBaselineSettingState::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SecurityBaselineComplianceState.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the securityBaselineTemplateId property value. The security baseline template id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityBaselineTemplateId() {
        return this.securityBaselineTemplateId;
    }
    /**
     * Gets the settingStates property value. The security baseline state for different settings for a device
     * @return a securityBaselineSettingState
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineSettingState> getSettingStates() {
        return this.settingStates;
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a SecurityBaselineComplianceState
     */
    @javax.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this.state;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the securityBaselineTemplateId property value. The security baseline template id
     * @param value Value to set for the securityBaselineTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityBaselineTemplateId(@javax.annotation.Nullable final String value) {
        this.securityBaselineTemplateId = value;
    }
    /**
     * Sets the settingStates property value. The security baseline state for different settings for a device
     * @param value Value to set for the settingStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingStates(@javax.annotation.Nullable final java.util.List<SecurityBaselineSettingState> value) {
        this.settingStates = value;
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final SecurityBaselineComplianceState value) {
        this.state = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
