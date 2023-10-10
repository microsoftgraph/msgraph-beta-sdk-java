package com.microsoft.graph.groups.item.sites.item.informationprotection.verifysignature;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifySignaturePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The digest property
     */
    private Base64url digest;
    /**
     * The signature property
     */
    private Base64url signature;
    /**
     * The signingKeyId property
     */
    private String signingKeyId;
    /**
     * Instantiates a new VerifySignaturePostRequestBody and sets the default values.
     */
    public VerifySignaturePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VerifySignaturePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static VerifySignaturePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifySignaturePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the digest property value. The digest property
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getDigest() {
        return this.digest;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("digest", (n) -> { this.setDigest(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("signature", (n) -> { this.setSignature(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("signingKeyId", (n) -> { this.setSigningKeyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the signature property value. The signature property
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getSignature() {
        return this.signature;
    }
    /**
     * Gets the signingKeyId property value. The signingKeyId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSigningKeyId() {
        return this.signingKeyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("digest", this.getDigest());
        writer.writeObjectValue("signature", this.getSignature());
        writer.writeStringValue("signingKeyId", this.getSigningKeyId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the digest property value. The digest property
     * @param value Value to set for the digest property.
     */
    public void setDigest(@jakarta.annotation.Nullable final Base64url value) {
        this.digest = value;
    }
    /**
     * Sets the signature property value. The signature property
     * @param value Value to set for the signature property.
     */
    public void setSignature(@jakarta.annotation.Nullable final Base64url value) {
        this.signature = value;
    }
    /**
     * Sets the signingKeyId property value. The signingKeyId property
     * @param value Value to set for the signingKeyId property.
     */
    public void setSigningKeyId(@jakarta.annotation.Nullable final String value) {
        this.signingKeyId = value;
    }
}
