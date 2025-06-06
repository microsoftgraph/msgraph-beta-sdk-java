package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentPointsGrade extends EducationAssignmentGrade implements Parsable {
    /**
     * Instantiates a new {@link EducationAssignmentPointsGrade} and sets the default values.
     */
    public EducationAssignmentPointsGrade() {
        super();
        this.setOdataType("#microsoft.graph.educationAssignmentPointsGrade");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAssignmentPointsGrade}
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentPointsGrade createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentPointsGrade();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("grade", (n) -> { this.setGrade(n.getStringValue()); });
        deserializerMap.put("points", (n) -> { this.setPoints(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grade property value. The grade letter from the grading scheme that corresponds to the given number of points.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGrade() {
        return this.backingStore.get("grade");
    }
    /**
     * Gets the points property value. Number of points a teacher gives to this submission object.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getPoints() {
        return this.backingStore.get("points");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("grade", this.getGrade());
        writer.writeFloatValue("points", this.getPoints());
    }
    /**
     * Sets the grade property value. The grade letter from the grading scheme that corresponds to the given number of points.
     * @param value Value to set for the grade property.
     */
    public void setGrade(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("grade", value);
    }
    /**
     * Sets the points property value. Number of points a teacher gives to this submission object.
     * @param value Value to set for the points property.
     */
    public void setPoints(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("points", value);
    }
}
