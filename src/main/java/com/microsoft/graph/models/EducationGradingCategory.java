package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationGradingCategory extends Entity implements Parsable {
    /**
     * The name of the grading category.
     */
    private String displayName;
    /**
     * The weight of the category; an integer between 0 and 100.
     */
    private Integer percentageWeight;
    /**
     * Instantiates a new educationGradingCategory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationGradingCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationGradingCategory
     */
    @javax.annotation.Nonnull
    public static EducationGradingCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationGradingCategory();
    }
    /**
     * Gets the displayName property value. The name of the grading category.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("percentageWeight", (n) -> { this.setPercentageWeight(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentageWeight property value. The weight of the category; an integer between 0 and 100.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentageWeight() {
        return this.percentageWeight;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("percentageWeight", this.getPercentageWeight());
    }
    /**
     * Sets the displayName property value. The name of the grading category.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the percentageWeight property value. The weight of the category; an integer between 0 and 100.
     * @param value Value to set for the percentageWeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentageWeight(@javax.annotation.Nullable final Integer value) {
        this.percentageWeight = value;
    }
}
