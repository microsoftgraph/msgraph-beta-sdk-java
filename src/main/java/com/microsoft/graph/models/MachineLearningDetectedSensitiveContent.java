package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MachineLearningDetectedSensitiveContent extends DetectedSensitiveContent implements Parsable {
    /** The matchTolerance property */
    private MlClassificationMatchTolerance _matchTolerance;
    /** The modelVersion property */
    private String _modelVersion;
    /**
     * Instantiates a new MachineLearningDetectedSensitiveContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MachineLearningDetectedSensitiveContent() {
        super();
        this.setOdataType("#microsoft.graph.machineLearningDetectedSensitiveContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MachineLearningDetectedSensitiveContent
     */
    @javax.annotation.Nonnull
    public static MachineLearningDetectedSensitiveContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineLearningDetectedSensitiveContent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MachineLearningDetectedSensitiveContent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("matchTolerance", (n) -> { currentObject.setMatchTolerance(n.getEnumValue(MlClassificationMatchTolerance.class)); });
            this.put("modelVersion", (n) -> { currentObject.setModelVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the matchTolerance property value. The matchTolerance property
     * @return a mlClassificationMatchTolerance
     */
    @javax.annotation.Nullable
    public MlClassificationMatchTolerance getMatchTolerance() {
        return this._matchTolerance;
    }
    /**
     * Gets the modelVersion property value. The modelVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModelVersion() {
        return this._modelVersion;
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
        this._matchTolerance = value;
    }
    /**
     * Sets the modelVersion property value. The modelVersion property
     * @param value Value to set for the modelVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelVersion(@javax.annotation.Nullable final String value) {
        this._modelVersion = value;
    }
}
