package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MachineLearningDetectedSensitiveContent extends DetectedSensitiveContent implements Parsable {
    /**
     * The matchTolerance property
     */
    private MlClassificationMatchTolerance matchTolerance;
    /**
     * The modelVersion property
     */
    private String modelVersion;
    /**
     * Instantiates a new machineLearningDetectedSensitiveContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MachineLearningDetectedSensitiveContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a machineLearningDetectedSensitiveContent
     */
    @javax.annotation.Nonnull
    public static MachineLearningDetectedSensitiveContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineLearningDetectedSensitiveContent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("matchTolerance", (n) -> { this.setMatchTolerance(n.getEnumValue(MlClassificationMatchTolerance.class)); });
        deserializerMap.put("modelVersion", (n) -> { this.setModelVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matchTolerance property value. The matchTolerance property
     * @return a mlClassificationMatchTolerance
     */
    @javax.annotation.Nullable
    public MlClassificationMatchTolerance getMatchTolerance() {
        return this.matchTolerance;
    }
    /**
     * Gets the modelVersion property value. The modelVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModelVersion() {
        return this.modelVersion;
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
        writer.writeEnumValue("matchTolerance", this.getMatchTolerance());
        writer.writeStringValue("modelVersion", this.getModelVersion());
    }
    /**
     * Sets the matchTolerance property value. The matchTolerance property
     * @param value Value to set for the matchTolerance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchTolerance(@javax.annotation.Nullable final MlClassificationMatchTolerance value) {
        this.matchTolerance = value;
    }
    /**
     * Sets the modelVersion property value. The modelVersion property
     * @param value Value to set for the modelVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelVersion(@javax.annotation.Nullable final String value) {
        this.modelVersion = value;
    }
}
