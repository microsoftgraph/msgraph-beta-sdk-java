package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardingRule extends PolicyRule implements Parsable {
    /**
     * Instantiates a new {@link ForwardingRule} and sets the default values.
     */
    public ForwardingRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.forwardingRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardingRule}
     */
    @jakarta.annotation.Nonnull
    public static ForwardingRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.internetAccessForwardingRule": return new InternetAccessForwardingRule();
                case "#microsoft.graph.networkaccess.m365ForwardingRule": return new M365ForwardingRule();
                case "#microsoft.graph.networkaccess.privateAccessForwardingRule": return new PrivateAccessForwardingRule();
            }
        }
        return new ForwardingRule();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link ForwardingRuleAction}
     */
    @jakarta.annotation.Nullable
    public ForwardingRuleAction getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the clientFallbackAction property value. The clientFallbackAction property
     * @return a {@link ClientFallbackAction}
     */
    @jakarta.annotation.Nullable
    public ClientFallbackAction getClientFallbackAction() {
        return this.backingStore.get("clientFallbackAction");
    }
    /**
     * Gets the destinations property value. Destinations maintain a list of potential destinations and destination types that the user may access within the context of a network filtering policy. This includes IP addresses and fully qualified domain names (FQDNs)/URLs.
     * @return a {@link java.util.List<RuleDestination>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RuleDestination> getDestinations() {
        return this.backingStore.get("destinations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ForwardingRuleAction::forValue)); });
        deserializerMap.put("clientFallbackAction", (n) -> { this.setClientFallbackAction(n.getEnumValue(ClientFallbackAction::forValue)); });
        deserializerMap.put("destinations", (n) -> { this.setDestinations(n.getCollectionOfObjectValues(RuleDestination::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleType", (n) -> { this.setRuleType(n.getEnumValue(NetworkDestinationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ruleType property value. The ruleType property
     * @return a {@link NetworkDestinationType}
     */
    @jakarta.annotation.Nullable
    public NetworkDestinationType getRuleType() {
        return this.backingStore.get("ruleType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("clientFallbackAction", this.getClientFallbackAction());
        writer.writeCollectionOfObjectValues("destinations", this.getDestinations());
        writer.writeEnumValue("ruleType", this.getRuleType());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final ForwardingRuleAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the clientFallbackAction property value. The clientFallbackAction property
     * @param value Value to set for the clientFallbackAction property.
     */
    public void setClientFallbackAction(@jakarta.annotation.Nullable final ClientFallbackAction value) {
        this.backingStore.set("clientFallbackAction", value);
    }
    /**
     * Sets the destinations property value. Destinations maintain a list of potential destinations and destination types that the user may access within the context of a network filtering policy. This includes IP addresses and fully qualified domain names (FQDNs)/URLs.
     * @param value Value to set for the destinations property.
     */
    public void setDestinations(@jakarta.annotation.Nullable final java.util.List<RuleDestination> value) {
        this.backingStore.set("destinations", value);
    }
    /**
     * Sets the ruleType property value. The ruleType property
     * @param value Value to set for the ruleType property.
     */
    public void setRuleType(@jakarta.annotation.Nullable final NetworkDestinationType value) {
        this.backingStore.set("ruleType", value);
    }
}
