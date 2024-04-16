package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClassGroupProvisioningFlow extends ProvisioningFlow implements Parsable {
    /**
     * Instantiates a new {@link ClassGroupProvisioningFlow} and sets the default values.
     */
    public ClassGroupProvisioningFlow() {
        super();
        this.setOdataType("#microsoft.graph.industryData.classGroupProvisioningFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClassGroupProvisioningFlow}
     */
    @jakarta.annotation.Nonnull
    public static ClassGroupProvisioningFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassGroupProvisioningFlow();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a {@link ClassGroupConfiguration}
     */
    @jakarta.annotation.Nullable
    public ClassGroupConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(ClassGroupConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
    }
    /**
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final ClassGroupConfiguration value) {
        this.backingStore.set("configuration", value);
    }
}
