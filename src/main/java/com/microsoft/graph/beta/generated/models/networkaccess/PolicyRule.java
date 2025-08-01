package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyRule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyRule} and sets the default values.
     */
    public PolicyRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyRule}
     */
    @jakarta.annotation.Nonnull
    public static PolicyRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.filteringRule": return new FilteringRule();
                case "#microsoft.graph.networkaccess.forwardingRule": return new ForwardingRule();
                case "#microsoft.graph.networkaccess.fqdnFilteringRule": return new FqdnFilteringRule();
                case "#microsoft.graph.networkaccess.internetAccessForwardingRule": return new InternetAccessForwardingRule();
                case "#microsoft.graph.networkaccess.m365ForwardingRule": return new M365ForwardingRule();
                case "#microsoft.graph.networkaccess.privateAccessForwardingRule": return new PrivateAccessForwardingRule();
                case "#microsoft.graph.networkaccess.threatIntelligenceRule": return new ThreatIntelligenceRule();
                case "#microsoft.graph.networkaccess.tlsInspectionRule": return new TlsInspectionRule();
                case "#microsoft.graph.networkaccess.webCategoryFilteringRule": return new WebCategoryFilteringRule();
            }
        }
        return new PolicyRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
}
