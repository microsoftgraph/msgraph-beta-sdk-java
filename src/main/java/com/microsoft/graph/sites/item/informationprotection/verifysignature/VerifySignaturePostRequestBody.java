package com.microsoft.graph.sites.item.informationprotection.verifysignature;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifySignaturePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The digest property
     */
    private byte[] digest;
    /**
     * The signature property
     */
    private byte[] signature;
    /**
     * The signingKeyId property
     */
    private String signingKeyId;
    /**
     * Instantiates a new verifySignaturePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerifySignaturePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifySignaturePostRequestBody
     */
    @javax.annotation.Nonnull
    public static VerifySignaturePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifySignaturePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the digest property value. The digest property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getDigest() {
        return this.digest;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("digest", (n) -> { this.setDigest(n.getByteArrayValue()); });
        deserializerMap.put("signature", (n) -> { this.setSignature(n.getByteArrayValue()); });
        deserializerMap.put("signingKeyId", (n) -> { this.setSigningKeyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the signature property value. The signature property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getSignature() {
        return this.signature;
    }
    /**
     * Gets the signingKeyId property value. The signingKeyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSigningKeyId() {
        return this.signingKeyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("digest", this.getDigest());
        writer.writeByteArrayValue("signature", this.getSignature());
        writer.writeStringValue("signingKeyId", this.getSigningKeyId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the digest property value. The digest property
     * @param value Value to set for the digest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDigest(@javax.annotation.Nullable final byte[] value) {
        this.digest = value;
    }
    /**
     * Sets the signature property value. The signature property
     * @param value Value to set for the signature property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignature(@javax.annotation.Nullable final byte[] value) {
        this.signature = value;
    }
    /**
     * Sets the signingKeyId property value. The signingKeyId property
     * @param value Value to set for the signingKeyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSigningKeyId(@javax.annotation.Nullable final String value) {
        this.signingKeyId = value;
    }
}
