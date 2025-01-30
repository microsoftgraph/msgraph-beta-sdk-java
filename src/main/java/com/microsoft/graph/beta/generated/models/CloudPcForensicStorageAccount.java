package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcForensicStorageAccount extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcForensicStorageAccount} and sets the default values.
     */
    public CloudPcForensicStorageAccount() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcForensicStorageAccount}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcForensicStorageAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcForensicStorageAccount();
    }
    /**
     * Gets the accessTier property value. The access tier of the storage account. Possible values are hot, cool, premium, cold, and unknownFutureValue. Default value is hot. Read-only.
     * @return a {@link CloudPcStorageAccountAccessTier}
     */
    @jakarta.annotation.Nullable
    public CloudPcStorageAccountAccessTier getAccessTier() {
        return this.backingStore.get("accessTier");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessTier", (n) -> { this.setAccessTier(n.getEnumValue(CloudPcStorageAccountAccessTier::forValue)); });
        deserializerMap.put("immutableStorage", (n) -> { this.setImmutableStorage(n.getBooleanValue()); });
        deserializerMap.put("storageAccountId", (n) -> { this.setStorageAccountId(n.getStringValue()); });
        deserializerMap.put("storageAccountName", (n) -> { this.setStorageAccountName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the immutableStorage property value. Indicates whether immutability policies are configured for the storage account. When true, the storage account only accepts hot as the snapshot access tier. When false, the storage account accepts all valid access tiers. Read-Only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getImmutableStorage() {
        return this.backingStore.get("immutableStorage");
    }
    /**
     * Gets the storageAccountId property value. The ID of the storage account. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageAccountId() {
        return this.backingStore.get("storageAccountId");
    }
    /**
     * Gets the storageAccountName property value. The name of the storage account. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageAccountName() {
        return this.backingStore.get("storageAccountName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessTier", this.getAccessTier());
        writer.writeBooleanValue("immutableStorage", this.getImmutableStorage());
        writer.writeStringValue("storageAccountId", this.getStorageAccountId());
        writer.writeStringValue("storageAccountName", this.getStorageAccountName());
    }
    /**
     * Sets the accessTier property value. The access tier of the storage account. Possible values are hot, cool, premium, cold, and unknownFutureValue. Default value is hot. Read-only.
     * @param value Value to set for the accessTier property.
     */
    public void setAccessTier(@jakarta.annotation.Nullable final CloudPcStorageAccountAccessTier value) {
        this.backingStore.set("accessTier", value);
    }
    /**
     * Sets the immutableStorage property value. Indicates whether immutability policies are configured for the storage account. When true, the storage account only accepts hot as the snapshot access tier. When false, the storage account accepts all valid access tiers. Read-Only.
     * @param value Value to set for the immutableStorage property.
     */
    public void setImmutableStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("immutableStorage", value);
    }
    /**
     * Sets the storageAccountId property value. The ID of the storage account. Read-only.
     * @param value Value to set for the storageAccountId property.
     */
    public void setStorageAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageAccountId", value);
    }
    /**
     * Sets the storageAccountName property value. The name of the storage account. Read-only.
     * @param value Value to set for the storageAccountName property.
     */
    public void setStorageAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageAccountName", value);
    }
}
