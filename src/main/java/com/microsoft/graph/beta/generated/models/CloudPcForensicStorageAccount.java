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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("storageAccountId", (n) -> { this.setStorageAccountId(n.getStringValue()); });
        deserializerMap.put("storageAccountName", (n) -> { this.setStorageAccountName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the storageAccountId property value. The ID of the storage account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageAccountId() {
        return this.backingStore.get("storageAccountId");
    }
    /**
     * Gets the storageAccountName property value. The name of the storage account.
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
        writer.writeStringValue("storageAccountId", this.getStorageAccountId());
        writer.writeStringValue("storageAccountName", this.getStorageAccountName());
    }
    /**
     * Sets the storageAccountId property value. The ID of the storage account.
     * @param value Value to set for the storageAccountId property.
     */
    public void setStorageAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageAccountId", value);
    }
    /**
     * Sets the storageAccountName property value. The name of the storage account.
     * @param value Value to set for the storageAccountName property.
     */
    public void setStorageAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageAccountName", value);
    }
}
