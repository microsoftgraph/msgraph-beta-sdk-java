package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DispositionReviewStage extends Entity implements Parsable {
    /** Name representing each stage within a collection. */
    private String name;
    /** A collection of reviewers at each stage. */
    private java.util.List<String> reviewersEmailAddresses;
    /** The sequence number for each stage of the disposition review. */
    private Integer stageNumber;
    /**
     * Instantiates a new dispositionReviewStage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DispositionReviewStage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dispositionReviewStage
     */
    @javax.annotation.Nonnull
    public static DispositionReviewStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispositionReviewStage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("reviewersEmailAddresses", (n) -> { this.setReviewersEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("stageNumber", (n) -> { this.setStageNumber(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name representing each stage within a collection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the reviewersEmailAddresses property value. A collection of reviewers at each stage.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReviewersEmailAddresses() {
        return this.reviewersEmailAddresses;
    }
    /**
     * Gets the stageNumber property value. The sequence number for each stage of the disposition review.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStageNumber() {
        return this.stageNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("reviewersEmailAddresses", this.getReviewersEmailAddresses());
        writer.writeIntegerValue("stageNumber", this.getStageNumber());
    }
    /**
     * Sets the name property value. Name representing each stage within a collection.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the reviewersEmailAddresses property value. A collection of reviewers at each stage.
     * @param value Value to set for the reviewersEmailAddresses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewersEmailAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this.reviewersEmailAddresses = value;
    }
    /**
     * Sets the stageNumber property value. The sequence number for each stage of the disposition review.
     * @param value Value to set for the stageNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStageNumber(@javax.annotation.Nullable final Integer value) {
        this.stageNumber = value;
    }
}
