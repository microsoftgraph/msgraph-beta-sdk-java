package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SigningResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The signature property */
    private byte[] _signature;
    /** The signingKeyId property */
    private String _signingKeyId;
    /**
     * Instantiates a new signingResult and sets the default values.
     * @return a void
     */
    public SigningResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.signingResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signingResult
     */
    @javax.annotation.Nonnull
    public static SigningResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SigningResult();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SigningResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("signature", (n) -> { currentObject.setSignature(n.getByteArrayValue()); });
            this.put("signingKeyId", (n) -> { currentObject.setSigningKeyId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the signature property value. The signature property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getSignature() {
        return this._signature;
    }
    /**
     * Gets the signingKeyId property value. The signingKeyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSigningKeyId() {
        return this._signingKeyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteArrayValue("signature", this.getSignature());
        writer.writeStringValue("signingKeyId", this.getSigningKeyId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the signature property value. The signature property
     * @param value Value to set for the signature property.
     * @return a void
     */
    public void setSignature(@javax.annotation.Nullable final byte[] value) {
        this._signature = value;
    }
    /**
     * Sets the signingKeyId property value. The signingKeyId property
     * @param value Value to set for the signingKeyId property.
     * @return a void
     */
    public void setSigningKeyId(@javax.annotation.Nullable final String value) {
        this._signingKeyId = value;
    }
}
