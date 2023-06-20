package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ForwardingRule extends PolicyRule implements Parsable {
    /** The action property */
    private ForwardingRuleAction action;
    /** The destinations property */
    private java.util.List<RuleDestination> destinations;
    /** The ruleType property */
    private NetworkDestinationType ruleType;
    /**
     * Instantiates a new ForwardingRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ForwardingRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.forwardingRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ForwardingRule
     */
    @javax.annotation.Nonnull
    public static ForwardingRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.m365ForwardingRule": return new M365ForwardingRule();
                case "#microsoft.graph.networkaccess.privateAccessForwardingRule": return new PrivateAccessForwardingRule();
            }
        }
        return new ForwardingRule();
    }
    /**
     * Gets the action property value. The action property
     * @return a ForwardingRuleAction
     */
    @javax.annotation.Nullable
    public ForwardingRuleAction getAction() {
        return this.action;
    }
    /**
     * Gets the destinations property value. The destinations property
     * @return a ruleDestination
     */
    @javax.annotation.Nullable
    public java.util.List<RuleDestination> getDestinations() {
        return this.destinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ForwardingRuleAction.class)); });
        deserializerMap.put("destinations", (n) -> { this.setDestinations(n.getCollectionOfObjectValues(RuleDestination::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleType", (n) -> { this.setRuleType(n.getEnumValue(NetworkDestinationType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ruleType property value. The ruleType property
     * @return a NetworkDestinationType
     */
    @javax.annotation.Nullable
    public NetworkDestinationType getRuleType() {
        return this.ruleType;
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
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfObjectValues("destinations", this.getDestinations());
        writer.writeEnumValue("ruleType", this.getRuleType());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final ForwardingRuleAction value) {
        this.action = value;
    }
    /**
     * Sets the destinations property value. The destinations property
     * @param value Value to set for the destinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinations(@javax.annotation.Nullable final java.util.List<RuleDestination> value) {
        this.destinations = value;
    }
    /**
     * Sets the ruleType property value. The ruleType property
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleType(@javax.annotation.Nullable final NetworkDestinationType value) {
        this.ruleType = value;
    }
}
