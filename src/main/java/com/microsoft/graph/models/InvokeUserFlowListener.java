package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvokeUserFlowListener extends AuthenticationListener implements Parsable {
    /**
     * The user flow that is invoked when this action executes.
     */
    private B2xIdentityUserFlow userFlow;
    /**
     * Instantiates a new invokeUserFlowListener and sets the default values.
     */
    public InvokeUserFlowListener() {
        super();
        this.setOdataType("#microsoft.graph.invokeUserFlowListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invokeUserFlowListener
     */
    @jakarta.annotation.Nonnull
    public static InvokeUserFlowListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvokeUserFlowListener();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userFlow", (n) -> { this.setUserFlow(n.getObjectValue(B2xIdentityUserFlow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userFlow property value. The user flow that is invoked when this action executes.
     * @return a b2xIdentityUserFlow
     */
    @jakarta.annotation.Nullable
    public B2xIdentityUserFlow getUserFlow() {
        return this.userFlow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("userFlow", this.getUserFlow());
    }
    /**
     * Sets the userFlow property value. The user flow that is invoked when this action executes.
     * @param value Value to set for the userFlow property.
     */
    public void setUserFlow(@jakarta.annotation.Nullable final B2xIdentityUserFlow value) {
        this.userFlow = value;
    }
}
