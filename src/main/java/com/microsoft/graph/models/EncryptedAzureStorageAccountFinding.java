package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EncryptedAzureStorageAccountFinding extends Finding implements Parsable {
    /**
     * The encryptionManagedBy property
     */
    private AzureEncryption encryptionManagedBy;
    /**
     * The storageAccount property
     */
    private AuthorizationSystemResource storageAccount;
    /**
     * Instantiates a new EncryptedAzureStorageAccountFinding and sets the default values.
     */
    public EncryptedAzureStorageAccountFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EncryptedAzureStorageAccountFinding
     */
    @jakarta.annotation.Nonnull
    public static EncryptedAzureStorageAccountFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptedAzureStorageAccountFinding();
    }
    /**
     * Gets the encryptionManagedBy property value. The encryptionManagedBy property
     * @return a AzureEncryption
     */
    @jakarta.annotation.Nullable
    public AzureEncryption getEncryptionManagedBy() {
        return this.encryptionManagedBy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("encryptionManagedBy", (n) -> { this.setEncryptionManagedBy(n.getEnumValue(AzureEncryption.class)); });
        deserializerMap.put("storageAccount", (n) -> { this.setStorageAccount(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the storageAccount property value. The storageAccount property
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getStorageAccount() {
        return this.storageAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("encryptionManagedBy", this.getEncryptionManagedBy());
        writer.writeObjectValue("storageAccount", this.getStorageAccount());
    }
    /**
     * Sets the encryptionManagedBy property value. The encryptionManagedBy property
     * @param value Value to set for the encryptionManagedBy property.
     */
    public void setEncryptionManagedBy(@jakarta.annotation.Nullable final AzureEncryption value) {
        this.encryptionManagedBy = value;
    }
    /**
     * Sets the storageAccount property value. The storageAccount property
     * @param value Value to set for the storageAccount property.
     */
    public void setStorageAccount(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.storageAccount = value;
    }
}
