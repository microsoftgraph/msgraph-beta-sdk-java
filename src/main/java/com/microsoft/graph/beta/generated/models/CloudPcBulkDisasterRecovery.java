package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkDisasterRecovery extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkDisasterRecovery} and sets the default values.
     */
    public CloudPcBulkDisasterRecovery() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkDisasterRecovery");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkDisasterRecovery}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkDisasterRecovery createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkDisasterRecovery();
    }
    /**
     * Gets the capabilityType property value. The capabilityType property
     * @return a {@link CloudPcDisasterRecoveryCapabilityType}
     */
    @jakarta.annotation.Nullable
    public CloudPcDisasterRecoveryCapabilityType getCapabilityType() {
        return this.backingStore.get("capabilityType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capabilityType", (n) -> { this.setCapabilityType(n.getEnumValue(CloudPcDisasterRecoveryCapabilityType::forValue)); });
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(CloudPcDisasterRecoveryLicenseType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a {@link CloudPcDisasterRecoveryLicenseType}
     */
    @jakarta.annotation.Nullable
    public CloudPcDisasterRecoveryLicenseType getLicenseType() {
        return this.backingStore.get("licenseType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("capabilityType", this.getCapabilityType());
        writer.writeEnumValue("licenseType", this.getLicenseType());
    }
    /**
     * Sets the capabilityType property value. The capabilityType property
     * @param value Value to set for the capabilityType property.
     */
    public void setCapabilityType(@jakarta.annotation.Nullable final CloudPcDisasterRecoveryCapabilityType value) {
        this.backingStore.set("capabilityType", value);
    }
    /**
     * Sets the licenseType property value. The licenseType property
     * @param value Value to set for the licenseType property.
     */
    public void setLicenseType(@jakarta.annotation.Nullable final CloudPcDisasterRecoveryLicenseType value) {
        this.backingStore.set("licenseType", value);
    }
}
