package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EncryptedGcpStorageBucketFinding extends Finding implements Parsable {
    /**
     * Instantiates a new EncryptedGcpStorageBucketFinding and sets the default values.
     */
    public EncryptedGcpStorageBucketFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EncryptedGcpStorageBucketFinding
     */
    @jakarta.annotation.Nonnull
    public static EncryptedGcpStorageBucketFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptedGcpStorageBucketFinding();
    }
    /**
     * Gets the accessibility property value. The accessibility property
     * @return a GcpAccessType
     */
    @jakarta.annotation.Nullable
    public GcpAccessType getAccessibility() {
        return this.BackingStore.get("accessibility");
    }
    /**
     * Gets the encryptionManagedBy property value. The encryptionManagedBy property
     * @return a GcpEncryption
     */
    @jakarta.annotation.Nullable
    public GcpEncryption getEncryptionManagedBy() {
        return this.BackingStore.get("encryptionManagedBy");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibility", (n) -> { this.setAccessibility(n.getEnumValue(GcpAccessType.class)); });
        deserializerMap.put("encryptionManagedBy", (n) -> { this.setEncryptionManagedBy(n.getEnumValue(GcpEncryption.class)); });
        deserializerMap.put("storageBucket", (n) -> { this.setStorageBucket(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the storageBucket property value. The storageBucket property
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getStorageBucket() {
        return this.BackingStore.get("storageBucket");
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
        writer.writeObjectValue("storageBucket", this.getStorageBucket());
    }
    /**
     * Sets the accessibility property value. The accessibility property
     * @param value Value to set for the accessibility property.
     */
    public void setAccessibility(@jakarta.annotation.Nullable final GcpAccessType value) {
        this.BackingStore.set("accessibility", value);
    }
    /**
     * Sets the encryptionManagedBy property value. The encryptionManagedBy property
     * @param value Value to set for the encryptionManagedBy property.
     */
    public void setEncryptionManagedBy(@jakarta.annotation.Nullable final GcpEncryption value) {
        this.BackingStore.set("encryptionManagedBy", value);
    }
    /**
     * Sets the storageBucket property value. The storageBucket property
     * @param value Value to set for the storageBucket property.
     */
    public void setStorageBucket(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.BackingStore.set("storageBucket", value);
    }
}
