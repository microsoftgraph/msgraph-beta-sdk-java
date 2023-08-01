package com.microsoft.graph.approvalworkflowproviders.item.businessflowswithrequestsawaitingmydecision.item.recorddecisions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecordDecisionsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The justification property
     */
    private String justification;
    /**
     * The reviewResult property
     */
    private String reviewResult;
    /**
     * Instantiates a new recordDecisionsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecordDecisionsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recordDecisionsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RecordDecisionsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordDecisionsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("reviewResult", (n) -> { this.setReviewResult(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the justification property value. The justification property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the reviewResult property value. The reviewResult property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewResult() {
        return this.reviewResult;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("reviewResult", this.getReviewResult());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustification(@javax.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the reviewResult property value. The reviewResult property
     * @param value Value to set for the reviewResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewResult(@javax.annotation.Nullable final String value) {
        this.reviewResult = value;
    }
}
