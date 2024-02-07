package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDisasterRecoveryMicrosoftHostedNetworkSetting extends CloudPcDisasterRecoveryNetworkSetting implements Parsable {
    /**
     * Instantiates a new CloudPcDisasterRecoveryMicrosoftHostedNetworkSetting and sets the default values.
     */
    public CloudPcDisasterRecoveryMicrosoftHostedNetworkSetting() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcDisasterRecoveryMicrosoftHostedNetworkSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcDisasterRecoveryMicrosoftHostedNetworkSetting
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDisasterRecoveryMicrosoftHostedNetworkSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDisasterRecoveryMicrosoftHostedNetworkSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("regionGroup", (n) -> { this.setRegionGroup(n.getEnumValue(CloudPcRegionGroup::forValue)); });
        deserializerMap.put("regionName", (n) -> { this.setRegionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the regionGroup property value. The regionGroup property
     * @return a CloudPcRegionGroup
     */
    @jakarta.annotation.Nullable
    public CloudPcRegionGroup getRegionGroup() {
        return this.backingStore.get("regionGroup");
    }
    /**
     * Gets the regionName property value. The regionName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegionName() {
        return this.backingStore.get("regionName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("regionGroup", this.getRegionGroup());
        writer.writeStringValue("regionName", this.getRegionName());
    }
    /**
     * Sets the regionGroup property value. The regionGroup property
     * @param value Value to set for the regionGroup property.
     */
    public void setRegionGroup(@jakarta.annotation.Nullable final CloudPcRegionGroup value) {
        this.backingStore.set("regionGroup", value);
    }
    /**
     * Sets the regionName property value. The regionName property
     * @param value Value to set for the regionName property.
     */
    public void setRegionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("regionName", value);
    }
}
