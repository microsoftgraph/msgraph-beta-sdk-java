package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Policy extends Entity implements Parsable {
    /**
     * Description.
     */
    private String description;
    /**
     * Policy name.
     */
    private String name;
    /**
     * Represents the definition of the policy ruleset that makes up the core definition of a policy.
     */
    private java.util.List<PolicyRule> policyRules;
    /**
     * Version.
     */
    private String version;
    /**
     * Instantiates a new policy and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Policy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policy
     */
    @jakarta.annotation.Nonnull
    public static Policy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.forwardingPolicy": return new ForwardingPolicy();
            }
        }
        return new Policy();
    }
    /**
     * Gets the description property value. Description.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the policyRules property value. Represents the definition of the policy ruleset that makes up the core definition of a policy.
     * @return a policyRule
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyRule> getPolicyRules() {
        return this.policyRules;
    }
    /**
     * Gets the version property value. Version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the name property value. Policy name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the policyRules property value. Represents the definition of the policy ruleset that makes up the core definition of a policy.
     * @param value Value to set for the policyRules property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicyRules(@jakarta.annotation.Nullable final java.util.List<PolicyRule> value) {
        this.policyRules = value;
    }
    /**
     * Sets the version property value. Version.
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
