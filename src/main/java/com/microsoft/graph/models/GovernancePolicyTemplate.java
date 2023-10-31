package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernancePolicyTemplate extends Entity implements Parsable {
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The policy property
     */
    private GovernancePolicy policy;
    /**
     * The settings property
     */
    private BusinessFlowSettings settings;
    /**
     * Instantiates a new GovernancePolicyTemplate and sets the default values.
     */
    public GovernancePolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernancePolicyTemplate
     */
    @jakarta.annotation.Nonnull
    public static GovernancePolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernancePolicyTemplate();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(GovernancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(BusinessFlowSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy property
     * @return a GovernancePolicy
     */
    @jakarta.annotation.Nullable
    public GovernancePolicy getPolicy() {
        return this.policy;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a BusinessFlowSettings
     */
    @jakarta.annotation.Nullable
    public BusinessFlowSettings getSettings() {
        return this.settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final GovernancePolicy value) {
        this.policy = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final BusinessFlowSettings value) {
        this.settings = value;
    }
}
