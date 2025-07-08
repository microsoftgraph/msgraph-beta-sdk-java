package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Policy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Policy} and sets the default values.
     */
    public Policy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Policy}
     */
    @jakarta.annotation.Nonnull
    public static Policy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.filteringPolicy": return new FilteringPolicy();
                case "#microsoft.graph.networkaccess.forwardingPolicy": return new ForwardingPolicy();
                case "#microsoft.graph.networkaccess.threatIntelligencePolicy": return new ThreatIntelligencePolicy();
            }
        }
        return new Policy();
    }
    /**
     * Gets the description property value. Description.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("policyRules", (n) -> { this.setPolicyRules(n.getCollectionOfObjectValues(PolicyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Policy name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the policyRules property value. Represents the definition of the policy ruleset that makes up the core definition of a policy.
     * @return a {@link java.util.List<PolicyRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyRule> getPolicyRules() {
        return this.backingStore.get("policyRules");
    }
    /**
     * Gets the version property value. Version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("policyRules", this.getPolicyRules());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the description property value. Description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the name property value. Policy name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the policyRules property value. Represents the definition of the policy ruleset that makes up the core definition of a policy.
     * @param value Value to set for the policyRules property.
     */
    public void setPolicyRules(@jakarta.annotation.Nullable final java.util.List<PolicyRule> value) {
        this.backingStore.set("policyRules", value);
    }
    /**
     * Sets the version property value. Version.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
