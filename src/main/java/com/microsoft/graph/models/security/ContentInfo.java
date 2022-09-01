package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The format of the content to be labeled. Possible values are: file, email. */
    private String _contentFormat;
    /** Identifier used for Azure Information Protection Analytics. */
    private String _identifier;
    /** Existing Microsoft Purview Information Protection metadata is passed as key-value pairs, where the key is the MSIP_Label_GUID_PropName. */
    private java.util.List<KeyValuePair> _metadata;
    /** The OdataType property */
    private String _odataType;
    /** The state property */
    private ContentState _state;
    /**
     * Instantiates a new contentInfo and sets the default values.
     * @return a void
     */
    public ContentInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.contentInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contentInfo
     */
    @javax.annotation.Nonnull
    public static ContentInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentInfo();
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
     * Gets the contentFormat property value. The format of the content to be labeled. Possible values are: file, email.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentFormat() {
        return this._contentFormat;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ContentInfo currentObject = this;
        return new HashMap<>(5) {{
            this.put("contentFormat", (n) -> { currentObject.setContentFormat(n.getStringValue()); });
            this.put("identifier", (n) -> { currentObject.setIdentifier(n.getStringValue()); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ContentState.class)); });
        }};
    }
    /**
     * Gets the identifier property value. Identifier used for Azure Information Protection Analytics.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this._identifier;
    }
    /**
     * Gets the metadata property value. Existing Microsoft Purview Information Protection metadata is passed as key-value pairs, where the key is the MSIP_Label_GUID_PropName.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getMetadata() {
        return this._metadata;
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
     * Gets the state property value. The state property
     * @return a contentState
     */
    @javax.annotation.Nullable
    public ContentState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentFormat", this.getContentFormat());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the contentFormat property value. The format of the content to be labeled. Possible values are: file, email.
     * @param value Value to set for the contentFormat property.
     * @return a void
     */
    public void setContentFormat(@javax.annotation.Nullable final String value) {
        this._contentFormat = value;
    }
    /**
     * Sets the identifier property value. Identifier used for Azure Information Protection Analytics.
     * @param value Value to set for the identifier property.
     * @return a void
     */
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this._identifier = value;
    }
    /**
     * Sets the metadata property value. Existing Microsoft Purview Information Protection metadata is passed as key-value pairs, where the key is the MSIP_Label_GUID_PropName.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    public void setMetadata(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._metadata = value;
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
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ContentState value) {
        this._state = value;
    }
}
