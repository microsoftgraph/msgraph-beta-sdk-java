package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StrongAuthenticationDetail extends Entity implements Parsable {
    /**
     * The encryptedPinHashHistory property
     */
    private byte[] encryptedPinHashHistory;
    /**
     * The proofupTime property
     */
    private Long proofupTime;
    /**
     * Instantiates a new strongAuthenticationDetail and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public StrongAuthenticationDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a strongAuthenticationDetail
     */
    @jakarta.annotation.Nonnull
    public static StrongAuthenticationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StrongAuthenticationDetail();
    }
    /**
     * Gets the encryptedPinHashHistory property value. The encryptedPinHashHistory property
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getEncryptedPinHashHistory() {
        return this.encryptedPinHashHistory;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("encryptedPinHashHistory", (n) -> { this.setEncryptedPinHashHistory(n.getByteArrayValue()); });
        deserializerMap.put("proofupTime", (n) -> { this.setProofupTime(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the proofupTime property value. The proofupTime property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getProofupTime() {
        return this.proofupTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("encryptedPinHashHistory", this.getEncryptedPinHashHistory());
        writer.writeLongValue("proofupTime", this.getProofupTime());
    }
    /**
     * Sets the encryptedPinHashHistory property value. The encryptedPinHashHistory property
     * @param value Value to set for the encryptedPinHashHistory property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEncryptedPinHashHistory(@jakarta.annotation.Nullable final byte[] value) {
        this.encryptedPinHashHistory = value;
    }
    /**
     * Sets the proofupTime property value. The proofupTime property
     * @param value Value to set for the proofupTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProofupTime(@jakarta.annotation.Nullable final Long value) {
        this.proofupTime = value;
    }
}
