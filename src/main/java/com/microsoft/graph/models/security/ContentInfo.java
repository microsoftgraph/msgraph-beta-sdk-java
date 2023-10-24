package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The format of the content to be labeled. Possible values are: file, email.
     */
    private String contentFormat;
    /**
     * Identifier used for Azure Information Protection Analytics.
     */
    private String identifier;
    /**
     * Existing Microsoft Purview Information Protection metadata is passed as key-value pairs, where the key is the MSIPLabelGUID_PropName.
     */
    private java.util.List<KeyValuePair> metadata;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The state property
     */
    private ContentState state;
    /**
     * Instantiates a new ContentInfo and sets the default values.
     */
    public ContentInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContentInfo
     */
    @jakarta.annotation.Nonnull
    public static ContentInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentInfo();
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
     * Gets the contentFormat property value. The format of the content to be labeled. Possible values are: file, email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentFormat() {
        return this.contentFormat;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contentFormat", (n) -> { this.setContentFormat(n.getStringValue()); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ContentState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Identifier used for Azure Information Protection Analytics.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * Gets the metadata property value. Existing Microsoft Purview Information Protection metadata is passed as key-value pairs, where the key is the MSIPLabelGUID_PropName.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the state property value. The state property
     * @return a ContentState
     */
    @jakarta.annotation.Nullable
    public ContentState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentFormat", this.getContentFormat());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the contentFormat property value. The format of the content to be labeled. Possible values are: file, email.
     * @param value Value to set for the contentFormat property.
     */
    public void setContentFormat(@jakarta.annotation.Nullable final String value) {
        this.contentFormat = value;
    }
    /**
     * Sets the identifier property value. Identifier used for Azure Information Protection Analytics.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.identifier = value;
    }
    /**
     * Sets the metadata property value. Existing Microsoft Purview Information Protection metadata is passed as key-value pairs, where the key is the MSIPLabelGUID_PropName.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.metadata = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ContentState value) {
        this.state = value;
    }
}
