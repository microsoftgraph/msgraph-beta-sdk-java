package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoveWatermarkAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new {@link RemoveWatermarkAction} and sets the default values.
     */
    public RemoveWatermarkAction() {
        super();
        this.setOdataType("#microsoft.graph.removeWatermarkAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RemoveWatermarkAction}
     */
    @jakarta.annotation.Nonnull
    public static RemoveWatermarkAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoveWatermarkAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uiElementNames", (n) -> { this.setUiElementNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the uiElementNames property value. The name of the UI element of footer to be removed.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUiElementNames() {
        return this.backingStore.get("uiElementNames");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("uiElementNames", this.getUiElementNames());
    }
    /**
     * Sets the uiElementNames property value. The name of the UI element of footer to be removed.
     * @param value Value to set for the uiElementNames property.
     */
    public void setUiElementNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("uiElementNames", value);
    }
}
