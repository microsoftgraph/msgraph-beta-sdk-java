package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyDefinitionReference extends AssignedPolicyReference implements Parsable {
    /**
     * Instantiates a new {@link PolicyDefinitionReference} and sets the default values.
     */
    public PolicyDefinitionReference() {
        super();
        this.setOdataType("#microsoft.graph.policyDefinitionReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyDefinitionReference}
     */
    @jakarta.annotation.Nonnull
    public static PolicyDefinitionReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyDefinitionReference();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyDefinition", (n) -> { this.setPolicyDefinition(n.getObjectValue(ResourcePolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("policyUniqueName", (n) -> { this.setPolicyUniqueName(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyDefinition property value. The policyDefinition property
     * @return a {@link ResourcePolicyDefinition}
     */
    @jakarta.annotation.Nullable
    public ResourcePolicyDefinition getPolicyDefinition() {
        return this.backingStore.get("policyDefinition");
    }
    /**
     * Gets the policyUniqueName property value. The policyUniqueName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyUniqueName() {
        return this.backingStore.get("policyUniqueName");
    }
    /**
     * Gets the version property value. The version property
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
        writer.writeObjectValue("policyDefinition", this.getPolicyDefinition());
        writer.writeStringValue("policyUniqueName", this.getPolicyUniqueName());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the policyDefinition property value. The policyDefinition property
     * @param value Value to set for the policyDefinition property.
     */
    public void setPolicyDefinition(@jakarta.annotation.Nullable final ResourcePolicyDefinition value) {
        this.backingStore.set("policyDefinition", value);
    }
    /**
     * Sets the policyUniqueName property value. The policyUniqueName property
     * @param value Value to set for the policyUniqueName property.
     */
    public void setPolicyUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyUniqueName", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
