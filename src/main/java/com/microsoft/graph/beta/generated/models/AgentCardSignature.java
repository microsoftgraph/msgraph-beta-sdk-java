package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentCardSignature implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AgentCardSignature} and sets the default values.
     */
    public AgentCardSignature() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentCardSignature}
     */
    @jakarta.annotation.Nonnull
    public static AgentCardSignature createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentCardSignature();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("header", (n) -> { this.setHeader(n.getObjectValue(JwsHeader::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protected", (n) -> { this.setProtected(n.getStringValue()); });
        deserializerMap.put("signature", (n) -> { this.setSignature(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the header property value. The unprotected JWS header values.
     * @return a {@link JwsHeader}
     */
    @jakarta.annotation.Nullable
    public JwsHeader getHeader() {
        return this.backingStore.get("header");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the protected property value. The protected JWS header for the signature. This is a Base64url-encoded JSON object, as per RFC 7515.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtected() {
        return this.backingStore.get("protected");
    }
    /**
     * Gets the signature property value. The computed signature, Base64url-encoded.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignature() {
        return this.backingStore.get("signature");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("header", this.getHeader());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("protected", this.getProtected());
        writer.writeStringValue("signature", this.getSignature());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the header property value. The unprotected JWS header values.
     * @param value Value to set for the header property.
     */
    public void setHeader(@jakarta.annotation.Nullable final JwsHeader value) {
        this.backingStore.set("header", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the protected property value. The protected JWS header for the signature. This is a Base64url-encoded JSON object, as per RFC 7515.
     * @param value Value to set for the protected property.
     */
    public void setProtected(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("protected", value);
    }
    /**
     * Sets the signature property value. The computed signature, Base64url-encoded.
     * @param value Value to set for the signature property.
     */
    public void setSignature(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signature", value);
    }
}
