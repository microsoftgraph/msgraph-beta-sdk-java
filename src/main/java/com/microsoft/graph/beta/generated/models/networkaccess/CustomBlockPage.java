package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomBlockPage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomBlockPage} and sets the default values.
     */
    public CustomBlockPage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomBlockPage}
     */
    @jakarta.annotation.Nonnull
    public static CustomBlockPage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomBlockPage();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a {@link BlockPageConfigurationBase}
     */
    @jakarta.annotation.Nullable
    public BlockPageConfigurationBase getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(BlockPageConfigurationBase::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(Status::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link Status}
     */
    @jakarta.annotation.Nullable
    public Status getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final BlockPageConfigurationBase value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final Status value) {
        this.backingStore.set("state", value);
    }
}
