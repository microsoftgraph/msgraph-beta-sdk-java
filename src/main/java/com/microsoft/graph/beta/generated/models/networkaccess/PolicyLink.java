package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyLink extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyLink} and sets the default values.
     */
    public PolicyLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyLink}
     */
    @jakarta.annotation.Nonnull
    public static PolicyLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.filteringPolicyLink": return new FilteringPolicyLink();
                case "#microsoft.graph.networkaccess.forwardingPolicyLink": return new ForwardingPolicyLink();
                case "#microsoft.graph.networkaccess.threatIntelligencePolicyLink": return new ThreatIntelligencePolicyLink();
                case "#microsoft.graph.networkaccess.tlsInspectionPolicyLink": return new TlsInspectionPolicyLink();
            }
        }
        return new PolicyLink();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(Policy::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(Status::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy property
     * @return a {@link Policy}
     */
    @jakarta.annotation.Nullable
    public Policy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link Status}
     */
    @jakarta.annotation.Nullable
    public Status getState() {
        return this.backingStore.get("state");
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
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final Policy value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final Status value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the version property value. Version.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
