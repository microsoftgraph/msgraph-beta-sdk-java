package com.microsoft.graph.dataclassification.classifyexactmatches;

import com.microsoft.graph.models.ContentClassification;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the classifyExactMatches method. */
public class ClassifyExactMatchesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The contentClassifications property */
    private java.util.List<ContentClassification> _contentClassifications;
    /** The sensitiveTypeIds property */
    private java.util.List<String> _sensitiveTypeIds;
    /** The text property */
    private String _text;
    /** The timeoutInMs property */
    private String _timeoutInMs;
    /**
     * Instantiates a new classifyExactMatchesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClassifyExactMatchesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classifyExactMatchesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ClassifyExactMatchesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifyExactMatchesPostRequestBody();
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
     * Gets the contentClassifications property value. The contentClassifications property
     * @return a contentClassification
     */
    @javax.annotation.Nullable
    public java.util.List<ContentClassification> getContentClassifications() {
        return this._contentClassifications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClassifyExactMatchesPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("contentClassifications", (n) -> { currentObject.setContentClassifications(n.getCollectionOfObjectValues(ContentClassification::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitiveTypeIds", (n) -> { currentObject.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
        deserializerMap.put("timeoutInMs", (n) -> { currentObject.setTimeoutInMs(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this._sensitiveTypeIds;
    }
    /**
     * Gets the text property value. The text property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Gets the timeoutInMs property value. The timeoutInMs property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeoutInMs() {
        return this._timeoutInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("contentClassifications", this.getContentClassifications());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
        writer.writeStringValue("text", this.getText());
        writer.writeStringValue("timeoutInMs", this.getTimeoutInMs());
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
     * Sets the contentClassifications property value. The contentClassifications property
     * @param value Value to set for the contentClassifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentClassifications(@javax.annotation.Nullable final java.util.List<ContentClassification> value) {
        this._contentClassifications = value;
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitiveTypeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sensitiveTypeIds = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
    /**
     * Sets the timeoutInMs property value. The timeoutInMs property
     * @param value Value to set for the timeoutInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeoutInMs(@javax.annotation.Nullable final String value) {
        this._timeoutInMs = value;
    }
}
