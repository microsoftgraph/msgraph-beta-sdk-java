package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Entra extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Entra} and sets the default values.
     */
    public Entra() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Entra}
     */
    @jakarta.annotation.Nonnull
    public static Entra createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Entra();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uxSetting", (n) -> { this.setUxSetting(n.getObjectValue(UxSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the uxSetting property value. The uxSetting property
     * @return a {@link UxSetting}
     */
    @jakarta.annotation.Nullable
    public UxSetting getUxSetting() {
        return this.backingStore.get("uxSetting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("uxSetting", this.getUxSetting());
    }
    /**
     * Sets the uxSetting property value. The uxSetting property
     * @param value Value to set for the uxSetting property.
     */
    public void setUxSetting(@jakarta.annotation.Nullable final UxSetting value) {
        this.backingStore.set("uxSetting", value);
    }
}
