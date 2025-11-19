package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttributeRuleMembers extends UserSet implements Parsable {
    /**
     * Instantiates a new {@link AttributeRuleMembers} and sets the default values.
     */
    public AttributeRuleMembers() {
        super();
        this.setOdataType("#microsoft.graph.attributeRuleMembers");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttributeRuleMembers}
     */
    @jakarta.annotation.Nonnull
    public static AttributeRuleMembers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeRuleMembers();
    }
    /**
     * Gets the description property value. The description property
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
        deserializerMap.put("membershipRule", (n) -> { this.setMembershipRule(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the membershipRule property value. The membershipRule property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRule() {
        return this.backingStore.get("membershipRule");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the membershipRule property value. The membershipRule property
     * @param value Value to set for the membershipRule property.
     */
    public void setMembershipRule(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRule", value);
    }
}
