package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyTipAction extends DlpActionInfo implements Parsable {
    /**
     * Instantiates a new {@link PolicyTipAction} and sets the default values.
     */
    public PolicyTipAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyTipAction}
     */
    @jakarta.annotation.Nonnull
    public static PolicyTipAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.notifyUserAction": return new NotifyUserAction();
            }
        }
        return new PolicyTipAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyTip", (n) -> { this.setPolicyTip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyTip property value. The text of the policy tip that explains what triggered the DLP policy. Developers can display this information to users in the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyTip() {
        return this.backingStore.get("policyTip");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("policyTip", this.getPolicyTip());
    }
    /**
     * Sets the policyTip property value. The text of the policy tip that explains what triggered the DLP policy. Developers can display this information to users in the app.
     * @param value Value to set for the policyTip property.
     */
    public void setPolicyTip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyTip", value);
    }
}
