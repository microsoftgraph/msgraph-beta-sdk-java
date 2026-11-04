package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The value of an agent user access policy setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPolicySettingAgentUserAccessValueObject extends CopilotPolicySettingValueObject implements Parsable {
    /**
     * Instantiates a new {@link CopilotPolicySettingAgentUserAccessValueObject} and sets the default values.
     */
    public CopilotPolicySettingAgentUserAccessValueObject() {
        super();
        this.setOdataType("#microsoft.graph.copilotPolicySettingAgentUserAccessValueObject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPolicySettingAgentUserAccessValueObject}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPolicySettingAgentUserAccessValueObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPolicySettingAgentUserAccessValueObject();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(CopilotPolicySettingAssignmentMember::createFromDiscriminatorValue)); });
        deserializerMap.put("userAssignmentCategory", (n) -> { this.setUserAssignmentCategory(n.getEnumValue(CopilotPolicySettingUserAssignmentCategory::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Users and groups explicitly granted access.
     * @return a {@link java.util.List<CopilotPolicySettingAssignmentMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CopilotPolicySettingAssignmentMember> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the userAssignmentCategory property value. The category that determines which users are assigned by a Copilot policy setting.
     * @return a {@link CopilotPolicySettingUserAssignmentCategory}
     */
    @jakarta.annotation.Nullable
    public CopilotPolicySettingUserAssignmentCategory getUserAssignmentCategory() {
        return this.backingStore.get("userAssignmentCategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeEnumValue("userAssignmentCategory", this.getUserAssignmentCategory());
    }
    /**
     * Sets the members property value. Users and groups explicitly granted access.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<CopilotPolicySettingAssignmentMember> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the userAssignmentCategory property value. The category that determines which users are assigned by a Copilot policy setting.
     * @param value Value to set for the userAssignmentCategory property.
     */
    public void setUserAssignmentCategory(@jakarta.annotation.Nullable final CopilotPolicySettingUserAssignmentCategory value) {
        this.backingStore.set("userAssignmentCategory", value);
    }
}
