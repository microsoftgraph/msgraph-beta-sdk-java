package com.microsoft.graph.models;

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
     * The classificationMethod property
     */
    private ClassificationMethod classificationMethod;
    /**
     * The description property
     */
    private String description;
    /**
     * The name property
     */
    private String name;
    /**
     * The publisherName property
     */
    private String publisherName;
    /**
     * The rulePackageId property
     */
    private String rulePackageId;
    /**
     * The rulePackageType property
     */
    private String rulePackageType;
    /**
     * The scope property
     */
    private EnumSet<SensitiveTypeScope> scope;
    /**
     * The sensitiveTypeSource property
     */
    private SensitiveTypeSource sensitiveTypeSource;
    /**
     * The state property
     */
    private String state;
    /**
     * Instantiates a new SensitiveType and sets the default values.
     */
    public SensitiveType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SensitiveType
     */
    @jakarta.annotation.Nonnull
    public static SensitiveType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitiveType();
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
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classificationMethod", (n) -> { this.setClassificationMethod(n.getEnumValue(ClassificationMethod.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        deserializerMap.put("rulePackageId", (n) -> { this.setRulePackageId(n.getStringValue()); });
        deserializerMap.put("rulePackageType", (n) -> { this.setRulePackageType(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getEnumSetValue(SensitiveTypeScope.class)); });
        deserializerMap.put("sensitiveTypeSource", (n) -> { this.setSensitiveTypeSource(n.getEnumValue(SensitiveTypeSource.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the publisherName property value. The publisherName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.publisherName;
    }
    /**
     * Gets the rulePackageId property value. The rulePackageId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRulePackageId() {
        return this.rulePackageId;
    }
    /**
     * Gets the rulePackageType property value. The rulePackageType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRulePackageType() {
        return this.rulePackageType;
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
     * Gets the state property value. The state property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
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
        this.classificationMethod = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.publisherName = value;
    }
    /**
     * Sets the rulePackageId property value. The rulePackageId property
     * @param value Value to set for the rulePackageId property.
     */
    public void setRulePackageId(@jakarta.annotation.Nullable final String value) {
        this.rulePackageId = value;
    }
    /**
     * Sets the rulePackageType property value. The rulePackageType property
     * @param value Value to set for the rulePackageType property.
     */
    public void setRulePackageType(@jakarta.annotation.Nullable final String value) {
        this.rulePackageType = value;
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
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
}
