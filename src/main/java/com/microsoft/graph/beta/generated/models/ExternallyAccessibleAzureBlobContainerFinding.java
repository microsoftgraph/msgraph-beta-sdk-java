package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternallyAccessibleAzureBlobContainerFinding extends Finding implements Parsable {
    /**
     * Instantiates a new {@link ExternallyAccessibleAzureBlobContainerFinding} and sets the default values.
     */
    public ExternallyAccessibleAzureBlobContainerFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternallyAccessibleAzureBlobContainerFinding}
     */
    @jakarta.annotation.Nonnull
    public static ExternallyAccessibleAzureBlobContainerFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternallyAccessibleAzureBlobContainerFinding();
    }
    /**
     * Gets the accessibility property value. The accessibility property
     * @return a {@link AzureAccessType}
     */
    @jakarta.annotation.Nullable
    public AzureAccessType getAccessibility() {
        return this.backingStore.get("accessibility");
    }
    /**
     * Gets the encryptionManagedBy property value. The encryptionManagedBy property
     * @return a {@link AzureEncryption}
     */
    @jakarta.annotation.Nullable
    public AzureEncryption getEncryptionManagedBy() {
        return this.backingStore.get("encryptionManagedBy");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibility", (n) -> { this.setAccessibility(n.getEnumValue(AzureAccessType::forValue)); });
        deserializerMap.put("encryptionManagedBy", (n) -> { this.setEncryptionManagedBy(n.getEnumValue(AzureEncryption::forValue)); });
        deserializerMap.put("storageAccount", (n) -> { this.setStorageAccount(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the storageAccount property value. The storageAccount property
     * @return a {@link AuthorizationSystemResource}
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getStorageAccount() {
        return this.backingStore.get("storageAccount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessibility", this.getAccessibility());
        writer.writeEnumValue("encryptionManagedBy", this.getEncryptionManagedBy());
        writer.writeObjectValue("storageAccount", this.getStorageAccount());
    }
    /**
     * Sets the accessibility property value. The accessibility property
     * @param value Value to set for the accessibility property.
     */
    public void setAccessibility(@jakarta.annotation.Nullable final AzureAccessType value) {
        this.backingStore.set("accessibility", value);
    }
    /**
     * Sets the encryptionManagedBy property value. The encryptionManagedBy property
     * @param value Value to set for the encryptionManagedBy property.
     */
    public void setEncryptionManagedBy(@jakarta.annotation.Nullable final AzureEncryption value) {
        this.backingStore.set("encryptionManagedBy", value);
    }
    /**
     * Sets the storageAccount property value. The storageAccount property
     * @param value Value to set for the storageAccount property.
     */
    public void setStorageAccount(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.backingStore.set("storageAccount", value);
    }
}
