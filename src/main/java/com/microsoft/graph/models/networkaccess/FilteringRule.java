package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilteringRule extends PolicyRule implements Parsable {
    /**
     * Instantiates a new FilteringRule and sets the default values.
     */
    public FilteringRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.filteringRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FilteringRule
     */
    @jakarta.annotation.Nonnull
    public static FilteringRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.fqdnFilteringRule": return new FqdnFilteringRule();
                case "#microsoft.graph.networkaccess.webCategoryFilteringRule": return new WebCategoryFilteringRule();
            }
        }
        return new FilteringRule();
    }
    /**
     * Gets the destinations property value. Possible destinations and types of destinations accessed by the user in accordance with the network filtering policy, such as IP addresses and FQDNs/URLs.
     * @return a java.util.List<RuleDestination>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RuleDestination> getDestinations() {
        return this.backingStore.get("destinations");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinations", (n) -> { this.setDestinations(n.getCollectionOfObjectValues(RuleDestination::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleType", (n) -> { this.setRuleType(n.getEnumValue(NetworkDestinationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ruleType property value. The ruleType property
     * @return a NetworkDestinationType
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
        writer.writeCollectionOfObjectValues("destinations", this.getDestinations());
        writer.writeEnumValue("ruleType", this.getRuleType());
    }
    /**
     * Sets the destinations property value. Possible destinations and types of destinations accessed by the user in accordance with the network filtering policy, such as IP addresses and FQDNs/URLs.
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
