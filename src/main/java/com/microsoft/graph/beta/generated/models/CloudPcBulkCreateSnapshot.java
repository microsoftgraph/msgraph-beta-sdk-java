package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkCreateSnapshot extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkCreateSnapshot} and sets the default values.
     */
    public CloudPcBulkCreateSnapshot() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkCreateSnapshot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkCreateSnapshot}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkCreateSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkCreateSnapshot();
    }
    /**
     * Gets the accessTier property value. The accessTier property
     * @return a {@link CloudPcBlobAccessTier}
     */
    @jakarta.annotation.Nullable
    public CloudPcBlobAccessTier getAccessTier() {
        return this.backingStore.get("accessTier");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessTier", (n) -> { this.setAccessTier(n.getEnumValue(CloudPcBlobAccessTier::forValue)); });
        deserializerMap.put("storageAccountId", (n) -> { this.setStorageAccountId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the storageAccountId property value. The storageAccountId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageAccountId() {
        return this.backingStore.get("storageAccountId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessTier", this.getAccessTier());
        writer.writeStringValue("storageAccountId", this.getStorageAccountId());
    }
    /**
     * Sets the accessTier property value. The accessTier property
     * @param value Value to set for the accessTier property.
     */
    public void setAccessTier(@jakarta.annotation.Nullable final CloudPcBlobAccessTier value) {
        this.backingStore.set("accessTier", value);
    }
    /**
     * Sets the storageAccountId property value. The storageAccountId property
     * @param value Value to set for the storageAccountId property.
     */
    public void setStorageAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageAccountId", value);
    }
}
