package com.microsoft.graph.dataclassification.classifyexactmatches;

import com.microsoft.graph.models.ContentClassification;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClassifyExactMatchesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The contentClassifications property
     */
    private java.util.List<ContentClassification> contentClassifications;
    /**
     * The sensitiveTypeIds property
     */
    private java.util.List<String> sensitiveTypeIds;
    /**
     * The text property
     */
    private String text;
    /**
     * The timeoutInMs property
     */
    private String timeoutInMs;
    /**
     * Instantiates a new classifyExactMatchesPostRequestBody and sets the default values.
     */
    public ClassifyExactMatchesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classifyExactMatchesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ClassifyExactMatchesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifyExactMatchesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the contentClassifications property value. The contentClassifications property
     * @return a contentClassification
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentClassification> getContentClassifications() {
        return this.contentClassifications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contentClassifications", (n) -> { this.setContentClassifications(n.getCollectionOfObjectValues(ContentClassification::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitiveTypeIds", (n) -> { this.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("timeoutInMs", (n) -> { this.setTimeoutInMs(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this.sensitiveTypeIds;
    }
    /**
     * Gets the text property value. The text property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the timeoutInMs property value. The timeoutInMs property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTimeoutInMs() {
        return this.timeoutInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("contentClassifications", this.getContentClassifications());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
        writer.writeStringValue("text", this.getText());
        writer.writeStringValue("timeoutInMs", this.getTimeoutInMs());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentClassifications property value. The contentClassifications property
     * @param value Value to set for the contentClassifications property.
     */
    public void setContentClassifications(@jakarta.annotation.Nullable final java.util.List<ContentClassification> value) {
        this.contentClassifications = value;
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     */
    public void setSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sensitiveTypeIds = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the timeoutInMs property value. The timeoutInMs property
     * @param value Value to set for the timeoutInMs property.
     */
    public void setTimeoutInMs(@jakarta.annotation.Nullable final String value) {
        this.timeoutInMs = value;
    }
}
