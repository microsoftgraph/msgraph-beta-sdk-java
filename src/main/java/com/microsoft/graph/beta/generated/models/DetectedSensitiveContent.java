package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetectedSensitiveContent extends DetectedSensitiveContentBase implements Parsable {
    /**
     * Instantiates a new DetectedSensitiveContent and sets the default values.
     */
    public DetectedSensitiveContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DetectedSensitiveContent
     */
    @jakarta.annotation.Nonnull
    public static DetectedSensitiveContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.machineLearningDetectedSensitiveContent": return new MachineLearningDetectedSensitiveContent();
            }
        }
        return new DetectedSensitiveContent();
    }
    /**
     * Gets the classificationAttributes property value. The classificationAttributes property
     * @return a java.util.List<ClassificationAttribute>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClassificationAttribute> getClassificationAttributes() {
        return this.backingStore.get("classificationAttributes");
    }
    /**
     * Gets the classificationMethod property value. The classificationMethod property
     * @return a DetectedSensitiveContentClassificationMethod
     */
    @jakarta.annotation.Nullable
    public DetectedSensitiveContentClassificationMethod getClassificationMethod() {
        return this.backingStore.get("classificationMethod");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classificationAttributes", (n) -> { this.setClassificationAttributes(n.getCollectionOfObjectValues(ClassificationAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("classificationMethod", (n) -> { this.setClassificationMethod(n.getEnumValue(DetectedSensitiveContentClassificationMethod::forValue)); });
        deserializerMap.put("matches", (n) -> { this.setMatches(n.getCollectionOfObjectValues(SensitiveContentLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumValue(DetectedSensitiveContentScope::forValue)); });
        deserializerMap.put("sensitiveTypeSource", (n) -> { this.setSensitiveTypeSource(n.getEnumValue(DetectedSensitiveContentSensitiveTypeSource::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matches property value. The matches property
     * @return a java.util.List<SensitiveContentLocation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitiveContentLocation> getMatches() {
        return this.backingStore.get("matches");
    }
    /**
     * Gets the scope property value. The scope property
     * @return a DetectedSensitiveContentScope
     */
    @jakarta.annotation.Nullable
    public DetectedSensitiveContentScope getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @return a DetectedSensitiveContentSensitiveTypeSource
     */
    @jakarta.annotation.Nullable
    public DetectedSensitiveContentSensitiveTypeSource getSensitiveTypeSource() {
        return this.backingStore.get("sensitiveTypeSource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("classificationAttributes", this.getClassificationAttributes());
        writer.writeEnumValue("classificationMethod", this.getClassificationMethod());
        writer.writeCollectionOfObjectValues("matches", this.getMatches());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeEnumValue("sensitiveTypeSource", this.getSensitiveTypeSource());
    }
    /**
     * Sets the classificationAttributes property value. The classificationAttributes property
     * @param value Value to set for the classificationAttributes property.
     */
    public void setClassificationAttributes(@jakarta.annotation.Nullable final java.util.List<ClassificationAttribute> value) {
        this.backingStore.set("classificationAttributes", value);
    }
    /**
     * Sets the classificationMethod property value. The classificationMethod property
     * @param value Value to set for the classificationMethod property.
     */
    public void setClassificationMethod(@jakarta.annotation.Nullable final DetectedSensitiveContentClassificationMethod value) {
        this.backingStore.set("classificationMethod", value);
    }
    /**
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     */
    public void setMatches(@jakarta.annotation.Nullable final java.util.List<SensitiveContentLocation> value) {
        this.backingStore.set("matches", value);
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final DetectedSensitiveContentScope value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @param value Value to set for the sensitiveTypeSource property.
     */
    public void setSensitiveTypeSource(@jakarta.annotation.Nullable final DetectedSensitiveContentSensitiveTypeSource value) {
        this.backingStore.set("sensitiveTypeSource", value);
    }
}
