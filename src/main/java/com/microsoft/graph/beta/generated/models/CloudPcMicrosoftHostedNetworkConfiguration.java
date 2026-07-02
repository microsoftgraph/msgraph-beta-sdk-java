package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcMicrosoftHostedNetworkConfiguration extends CloudPcNetworkConfiguration implements Parsable {
    /**
     * Instantiates a new {@link CloudPcMicrosoftHostedNetworkConfiguration} and sets the default values.
     */
    public CloudPcMicrosoftHostedNetworkConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcMicrosoftHostedNetworkConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcMicrosoftHostedNetworkConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcMicrosoftHostedNetworkConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcMicrosoftHostedNetworkConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("geographicLocationType", (n) -> { this.setGeographicLocationType(n.getEnumValue(CloudPcGeographicLocationType::forValue)); });
        deserializerMap.put("regionGroups", (n) -> { this.setRegionGroups(n.getCollectionOfObjectValues(CloudPcRegionGroupConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the geographicLocationType property value. The geographicLocationType property
     * @return a {@link CloudPcGeographicLocationType}
     */
    @jakarta.annotation.Nullable
    public CloudPcGeographicLocationType getGeographicLocationType() {
        return this.backingStore.get("geographicLocationType");
    }
    /**
     * Gets the regionGroups property value. The region group configurations for the network.
     * @return a {@link java.util.List<CloudPcRegionGroupConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcRegionGroupConfiguration> getRegionGroups() {
        return this.backingStore.get("regionGroups");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("geographicLocationType", this.getGeographicLocationType());
        writer.writeCollectionOfObjectValues("regionGroups", this.getRegionGroups());
    }
    /**
     * Sets the geographicLocationType property value. The geographicLocationType property
     * @param value Value to set for the geographicLocationType property.
     */
    public void setGeographicLocationType(@jakarta.annotation.Nullable final CloudPcGeographicLocationType value) {
        this.backingStore.set("geographicLocationType", value);
    }
    /**
     * Sets the regionGroups property value. The region group configurations for the network.
     * @param value Value to set for the regionGroups property.
     */
    public void setRegionGroups(@jakarta.annotation.Nullable final java.util.List<CloudPcRegionGroupConfiguration> value) {
        this.backingStore.set("regionGroups", value);
    }
}
