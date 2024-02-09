package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDisasterRecoveryAzureConnectionSetting extends CloudPcDisasterRecoveryNetworkSetting implements Parsable {
    /**
     * Instantiates a new {@link CloudPcDisasterRecoveryAzureConnectionSetting} and sets the default values.
     */
    public CloudPcDisasterRecoveryAzureConnectionSetting() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcDisasterRecoveryAzureConnectionSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcDisasterRecoveryAzureConnectionSetting}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDisasterRecoveryAzureConnectionSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDisasterRecoveryAzureConnectionSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onPremisesConnectionId", (n) -> { this.setOnPremisesConnectionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the onPremisesConnectionId property value. The onPremisesConnectionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesConnectionId() {
        return this.backingStore.get("onPremisesConnectionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("onPremisesConnectionId", this.getOnPremisesConnectionId());
    }
    /**
     * Sets the onPremisesConnectionId property value. The onPremisesConnectionId property
     * @param value Value to set for the onPremisesConnectionId property.
     */
    public void setOnPremisesConnectionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesConnectionId", value);
    }
}
