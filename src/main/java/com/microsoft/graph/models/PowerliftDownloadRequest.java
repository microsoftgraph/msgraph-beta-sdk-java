package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Request used to download app diagnostic files. */
public class PowerliftDownloadRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of files to download */
    private java.util.List<String> _files;
    /** The OdataType property */
    private String _odataType;
    /** The unique id for the request */
    private String _powerliftId;
    /**
     * Instantiates a new powerliftDownloadRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PowerliftDownloadRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a powerliftDownloadRequest
     */
    @javax.annotation.Nonnull
    public static PowerliftDownloadRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PowerliftDownloadRequest();
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("powerliftId", (n) -> { this.setPowerliftId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The list of files to download
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFiles() {
        return this._files;
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
     * Gets the powerliftId property value. The unique id for the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPowerliftId() {
        return this._powerliftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("files", this.getFiles());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("powerliftId", this.getPowerliftId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the files property value. The list of files to download
     * @param value Value to set for the files property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFiles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._files = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the powerliftId property value. The unique id for the request
     * @param value Value to set for the powerliftId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerliftId(@javax.annotation.Nullable final String value) {
        this._powerliftId = value;
    }
}
