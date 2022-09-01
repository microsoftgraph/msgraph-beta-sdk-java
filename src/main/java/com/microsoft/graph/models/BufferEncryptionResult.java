package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BufferEncryptionResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The encryptedBuffer property */
    private byte[] _encryptedBuffer;
    /** The OdataType property */
    private String _odataType;
    /** The publishingLicense property */
    private byte[] _publishingLicense;
    /**
     * Instantiates a new bufferEncryptionResult and sets the default values.
     * @return a void
     */
    public BufferEncryptionResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.bufferEncryptionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bufferEncryptionResult
     */
    @javax.annotation.Nonnull
    public static BufferEncryptionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BufferEncryptionResult();
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
     * Gets the encryptedBuffer property value. The encryptedBuffer property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getEncryptedBuffer() {
        return this._encryptedBuffer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BufferEncryptionResult currentObject = this;
        return new HashMap<>(3) {{
            this.put("encryptedBuffer", (n) -> { currentObject.setEncryptedBuffer(n.getByteArrayValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("publishingLicense", (n) -> { currentObject.setPublishingLicense(n.getByteArrayValue()); });
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
     * Gets the publishingLicense property value. The publishingLicense property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPublishingLicense() {
        return this._publishingLicense;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("encryptedBuffer", this.getEncryptedBuffer());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteArrayValue("publishingLicense", this.getPublishingLicense());
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
     * Sets the encryptedBuffer property value. The encryptedBuffer property
     * @param value Value to set for the encryptedBuffer property.
     * @return a void
     */
    public void setEncryptedBuffer(@javax.annotation.Nullable final byte[] value) {
        this._encryptedBuffer = value;
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
     * Sets the publishingLicense property value. The publishingLicense property
     * @param value Value to set for the publishingLicense property.
     * @return a void
     */
    public void setPublishingLicense(@javax.annotation.Nullable final byte[] value) {
        this._publishingLicense = value;
    }
}
