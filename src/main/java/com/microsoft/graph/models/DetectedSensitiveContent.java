package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetectedSensitiveContent extends DetectedSensitiveContentBase implements Parsable {
    /**
     * The classificationAttributes property
     */
    private java.util.List<ClassificationAttribute> classificationAttributes;
    /**
     * The classificationMethod property
     */
    private ClassificationMethod classificationMethod;
    /**
     * The matches property
     */
    private java.util.List<SensitiveContentLocation> matches;
    /**
     * The scope property
     */
    private EnumSet<SensitiveTypeScope> scope;
    /**
     * The sensitiveTypeSource property
     */
    private SensitiveTypeSource sensitiveTypeSource;
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
        return this.classificationAttributes;
    }
    /**
     * Gets the classificationMethod property value. The classificationMethod property
     * @return a ClassificationMethod
     */
    @jakarta.annotation.Nullable
    public ClassificationMethod getClassificationMethod() {
        return this.classificationMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classificationAttributes", (n) -> { this.setClassificationAttributes(n.getCollectionOfObjectValues(ClassificationAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("classificationMethod", (n) -> { this.setClassificationMethod(n.getEnumValue(ClassificationMethod.class)); });
        deserializerMap.put("matches", (n) -> { this.setMatches(n.getCollectionOfObjectValues(SensitiveContentLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumSetValue(SensitiveTypeScope.class)); });
        deserializerMap.put("sensitiveTypeSource", (n) -> { this.setSensitiveTypeSource(n.getEnumValue(SensitiveTypeSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the matches property value. The matches property
     * @return a java.util.List<SensitiveContentLocation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitiveContentLocation> getMatches() {
        return this.matches;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a EnumSet<SensitiveTypeScope>
     */
    @jakarta.annotation.Nullable
    public EnumSet<SensitiveTypeScope> getScope() {
        return this.scope;
    }
    /**
     * Gets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @return a SensitiveTypeSource
     */
    @jakarta.annotation.Nullable
    public SensitiveTypeSource getSensitiveTypeSource() {
        return this.sensitiveTypeSource;
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
        writer.writeEnumSetValue("scope", this.getScope());
        writer.writeEnumValue("sensitiveTypeSource", this.getSensitiveTypeSource());
    }
    /**
     * Sets the classificationAttributes property value. The classificationAttributes property
     * @param value Value to set for the classificationAttributes property.
     */
    public void setClassificationAttributes(@jakarta.annotation.Nullable final java.util.List<ClassificationAttribute> value) {
        this.classificationAttributes = value;
    }
    /**
     * Sets the classificationMethod property value. The classificationMethod property
     * @param value Value to set for the classificationMethod property.
     */
    public void setClassificationMethod(@jakarta.annotation.Nullable final ClassificationMethod value) {
        this.classificationMethod = value;
    }
    /**
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     */
    public void setMatches(@jakarta.annotation.Nullable final java.util.List<SensitiveContentLocation> value) {
        this.matches = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final EnumSet<SensitiveTypeScope> value) {
        this.scope = value;
    }
    /**
     * Sets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @param value Value to set for the sensitiveTypeSource property.
     */
    public void setSensitiveTypeSource(@jakarta.annotation.Nullable final SensitiveTypeSource value) {
        this.sensitiveTypeSource = value;
    }
}
