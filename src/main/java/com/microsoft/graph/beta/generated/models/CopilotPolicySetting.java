package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPolicySetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotPolicySetting} and sets the default values.
     */
    public CopilotPolicySetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPolicySetting}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPolicySetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPolicySetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
