package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitiveType extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensitiveType} and sets the default values.
     */
    public SensitiveType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensitiveType}
     */
    @jakarta.annotation.Nonnull
    public static SensitiveType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitiveType();
    }
    /**
     * Gets the classificationMethod property value. The classificationMethod property
     * @return a {@link ClassificationMethod}
     */
    @jakarta.annotation.Nullable
    public ClassificationMethod getClassificationMethod() {
        return this.backingStore.get("classificationMethod");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classificationMethod", (n) -> { this.setClassificationMethod(n.getEnumValue(ClassificationMethod::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        deserializerMap.put("rulePackageId", (n) -> { this.setRulePackageId(n.getStringValue()); });
        deserializerMap.put("rulePackageType", (n) -> { this.setRulePackageType(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumSetValue(SensitiveTypeScope::forValue)); });
        deserializerMap.put("sensitiveTypeSource", (n) -> { this.setSensitiveTypeSource(n.getEnumValue(SensitiveTypeSource::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the publisherName property value. The publisherName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.backingStore.get("publisherName");
    }
    /**
     * Gets the rulePackageId property value. The rulePackageId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRulePackageId() {
        return this.backingStore.get("rulePackageId");
    }
    /**
     * Gets the rulePackageType property value. The rulePackageType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRulePackageType() {
        return this.backingStore.get("rulePackageType");
    }
    /**
     * Gets the scope property value. The scope property
     * @return a {@link EnumSet<SensitiveTypeScope>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<SensitiveTypeScope> getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @return a {@link SensitiveTypeSource}
     */
    @jakarta.annotation.Nullable
    public SensitiveTypeSource getSensitiveTypeSource() {
        return this.backingStore.get("sensitiveTypeSource");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classificationMethod", this.getClassificationMethod());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeStringValue("rulePackageId", this.getRulePackageId());
        writer.writeStringValue("rulePackageType", this.getRulePackageType());
        writer.writeEnumSetValue("scope", this.getScope());
        writer.writeEnumValue("sensitiveTypeSource", this.getSensitiveTypeSource());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the classificationMethod property value. The classificationMethod property
     * @param value Value to set for the classificationMethod property.
     */
    public void setClassificationMethod(@jakarta.annotation.Nullable final ClassificationMethod value) {
        this.backingStore.set("classificationMethod", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherName", value);
    }
    /**
     * Sets the rulePackageId property value. The rulePackageId property
     * @param value Value to set for the rulePackageId property.
     */
    public void setRulePackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rulePackageId", value);
    }
    /**
     * Sets the rulePackageType property value. The rulePackageType property
     * @param value Value to set for the rulePackageType property.
     */
    public void setRulePackageType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rulePackageType", value);
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final EnumSet<SensitiveTypeScope> value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @param value Value to set for the sensitiveTypeSource property.
     */
    public void setSensitiveTypeSource(@jakarta.annotation.Nullable final SensitiveTypeSource value) {
        this.backingStore.set("sensitiveTypeSource", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
}
