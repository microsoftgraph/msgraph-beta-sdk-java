package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MachineLearningDetectedSensitiveContent extends DetectedSensitiveContent implements Parsable {
    /**
     * Instantiates a new {@link MachineLearningDetectedSensitiveContent} and sets the default values.
     */
    public MachineLearningDetectedSensitiveContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MachineLearningDetectedSensitiveContent}
     */
    @jakarta.annotation.Nonnull
    public static MachineLearningDetectedSensitiveContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MachineLearningDetectedSensitiveContent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("matchTolerance", (n) -> { this.setMatchTolerance(n.getEnumSetValue(MlClassificationMatchTolerance::forValue)); });
        deserializerMap.put("modelVersion", (n) -> { this.setModelVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matchTolerance property value. The matchTolerance property
     * @return a {@link EnumSet<MlClassificationMatchTolerance>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<MlClassificationMatchTolerance> getMatchTolerance() {
        return this.backingStore.get("matchTolerance");
    }
    /**
     * Gets the modelVersion property value. The modelVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModelVersion() {
        return this.backingStore.get("modelVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("matchTolerance", this.getMatchTolerance());
        writer.writeStringValue("modelVersion", this.getModelVersion());
    }
    /**
     * Sets the matchTolerance property value. The matchTolerance property
     * @param value Value to set for the matchTolerance property.
     */
    public void setMatchTolerance(@jakarta.annotation.Nullable final EnumSet<MlClassificationMatchTolerance> value) {
        this.backingStore.set("matchTolerance", value);
    }
    /**
     * Sets the modelVersion property value. The modelVersion property
     * @param value Value to set for the modelVersion property.
     */
    public void setModelVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("modelVersion", value);
    }
}
