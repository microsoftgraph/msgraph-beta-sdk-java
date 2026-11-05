package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The value of an agent sharing policy setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPolicySettingAgentSharingValueObject extends CopilotPolicySettingValueObject implements Parsable {
    /**
     * Instantiates a new {@link CopilotPolicySettingAgentSharingValueObject} and sets the default values.
     */
    public CopilotPolicySettingAgentSharingValueObject() {
        super();
        this.setOdataType("#microsoft.graph.copilotPolicySettingAgentSharingValueObject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPolicySettingAgentSharingValueObject}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPolicySettingAgentSharingValueObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPolicySettingAgentSharingValueObject();
    }
    /**
     * Gets the agentSharingLimit property value. The supported range and default value for an agent sharing limit.
     * @return a {@link CopilotPolicySettingAgentSharingLimit}
     */
    @jakarta.annotation.Nullable
    public CopilotPolicySettingAgentSharingLimit getAgentSharingLimit() {
        return this.backingStore.get("agentSharingLimit");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentSharingLimit", (n) -> { this.setAgentSharingLimit(n.getObjectValue(CopilotPolicySettingAgentSharingLimit::createFromDiscriminatorValue)); });
        deserializerMap.put("isSharingWithGroupsEnabled", (n) -> { this.setIsSharingWithGroupsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isUserSharingLimitEnabled", (n) -> { this.setIsUserSharingLimitEnabled(n.getBooleanValue()); });
        deserializerMap.put("organizationWideSharingAssignment", (n) -> { this.setOrganizationWideSharingAssignment(n.getObjectValue(CopilotPolicySettingUserAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isSharingWithGroupsEnabled property value. Indicates whether sharing agents with groups is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharingWithGroupsEnabled() {
        return this.backingStore.get("isSharingWithGroupsEnabled");
    }
    /**
     * Gets the isUserSharingLimitEnabled property value. Indicates whether the per-user agent sharing limit is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUserSharingLimitEnabled() {
        return this.backingStore.get("isUserSharingLimitEnabled");
    }
    /**
     * Gets the organizationWideSharingAssignment property value. The users and groups selected by a Copilot policy setting.
     * @return a {@link CopilotPolicySettingUserAssignment}
     */
    @jakarta.annotation.Nullable
    public CopilotPolicySettingUserAssignment getOrganizationWideSharingAssignment() {
        return this.backingStore.get("organizationWideSharingAssignment");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("agentSharingLimit", this.getAgentSharingLimit());
        writer.writeBooleanValue("isSharingWithGroupsEnabled", this.getIsSharingWithGroupsEnabled());
        writer.writeBooleanValue("isUserSharingLimitEnabled", this.getIsUserSharingLimitEnabled());
        writer.writeObjectValue("organizationWideSharingAssignment", this.getOrganizationWideSharingAssignment());
    }
    /**
     * Sets the agentSharingLimit property value. The supported range and default value for an agent sharing limit.
     * @param value Value to set for the agentSharingLimit property.
     */
    public void setAgentSharingLimit(@jakarta.annotation.Nullable final CopilotPolicySettingAgentSharingLimit value) {
        this.backingStore.set("agentSharingLimit", value);
    }
    /**
     * Sets the isSharingWithGroupsEnabled property value. Indicates whether sharing agents with groups is enabled.
     * @param value Value to set for the isSharingWithGroupsEnabled property.
     */
    public void setIsSharingWithGroupsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSharingWithGroupsEnabled", value);
    }
    /**
     * Sets the isUserSharingLimitEnabled property value. Indicates whether the per-user agent sharing limit is enabled.
     * @param value Value to set for the isUserSharingLimitEnabled property.
     */
    public void setIsUserSharingLimitEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUserSharingLimitEnabled", value);
    }
    /**
     * Sets the organizationWideSharingAssignment property value. The users and groups selected by a Copilot policy setting.
     * @param value Value to set for the organizationWideSharingAssignment property.
     */
    public void setOrganizationWideSharingAssignment(@jakarta.annotation.Nullable final CopilotPolicySettingUserAssignment value) {
        this.backingStore.set("organizationWideSharingAssignment", value);
    }
}
