package com.microsoft.graph.devicemanagement.deponboardingsettings.item.uploaddeptoken;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the uploadDepToken method. */
public class UploadDepTokenPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The appleId property */
    private String _appleId;
    /** The depToken property */
    private String _depToken;
    /**
     * Instantiates a new uploadDepTokenPostRequestBody and sets the default values.
     * @return a void
     */
    public UploadDepTokenPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uploadDepTokenPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UploadDepTokenPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadDepTokenPostRequestBody();
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
     * Gets the appleId property value. The appleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleId() {
        return this._appleId;
    }
    /**
     * Gets the depToken property value. The depToken property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDepToken() {
        return this._depToken;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UploadDepTokenPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("appleId", (n) -> { currentObject.setAppleId(n.getStringValue()); });
            this.put("depToken", (n) -> { currentObject.setDepToken(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeStringValue("depToken", this.getDepToken());
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
     * Sets the appleId property value. The appleId property
     * @param value Value to set for the appleId property.
     * @return a void
     */
    public void setAppleId(@javax.annotation.Nullable final String value) {
        this._appleId = value;
    }
    /**
     * Sets the depToken property value. The depToken property
     * @param value Value to set for the depToken property.
     * @return a void
     */
    public void setDepToken(@javax.annotation.Nullable final String value) {
        this._depToken = value;
    }
}
