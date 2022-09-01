package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class SensitiveType extends Entity implements Parsable {
    /** The classificationMethod property */
    private ClassificationMethod _classificationMethod;
    /** The description property */
    private String _description;
    /** The name property */
    private String _name;
    /** The publisherName property */
    private String _publisherName;
    /** The rulePackageId property */
    private String _rulePackageId;
    /** The rulePackageType property */
    private String _rulePackageType;
    /** The scope property */
    private SensitiveTypeScope _scope;
    /** The sensitiveTypeSource property */
    private SensitiveTypeSource _sensitiveTypeSource;
    /** The state property */
    private String _state;
    /**
     * Instantiates a new sensitiveType and sets the default values.
     * @return a void
     */
    public SensitiveType() {
        super();
        this.setOdataType("#microsoft.graph.sensitiveType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitiveType
     */
    @javax.annotation.Nonnull
    public static SensitiveType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitiveType();
    }
    /**
     * Gets the classificationMethod property value. The classificationMethod property
     * @return a classificationMethod
     */
    @javax.annotation.Nullable
    public ClassificationMethod getClassificationMethod() {
        return this._classificationMethod;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SensitiveType currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classificationMethod", (n) -> { currentObject.setClassificationMethod(n.getEnumValue(ClassificationMethod.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("publisherName", (n) -> { currentObject.setPublisherName(n.getStringValue()); });
            this.put("rulePackageId", (n) -> { currentObject.setRulePackageId(n.getStringValue()); });
            this.put("rulePackageType", (n) -> { currentObject.setRulePackageType(n.getStringValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getEnumValue(SensitiveTypeScope.class)); });
            this.put("sensitiveTypeSource", (n) -> { currentObject.setSensitiveTypeSource(n.getEnumValue(SensitiveTypeSource.class)); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the publisherName property value. The publisherName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisherName() {
        return this._publisherName;
    }
    /**
     * Gets the rulePackageId property value. The rulePackageId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRulePackageId() {
        return this._rulePackageId;
    }
    /**
     * Gets the rulePackageType property value. The rulePackageType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRulePackageType() {
        return this._rulePackageType;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a sensitiveTypeScope
     */
    @javax.annotation.Nullable
    public SensitiveTypeScope getScope() {
        return this._scope;
    }
    /**
     * Gets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @return a sensitiveTypeSource
     */
    @javax.annotation.Nullable
    public SensitiveTypeSource getSensitiveTypeSource() {
        return this._sensitiveTypeSource;
    }
    /**
     * Gets the state property value. The state property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classificationMethod", this.getClassificationMethod());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeStringValue("rulePackageId", this.getRulePackageId());
        writer.writeStringValue("rulePackageType", this.getRulePackageType());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeEnumValue("sensitiveTypeSource", this.getSensitiveTypeSource());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the classificationMethod property value. The classificationMethod property
     * @param value Value to set for the classificationMethod property.
     * @return a void
     */
    public void setClassificationMethod(@javax.annotation.Nullable final ClassificationMethod value) {
        this._classificationMethod = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the publisherName property value. The publisherName property
     * @param value Value to set for the publisherName property.
     * @return a void
     */
    public void setPublisherName(@javax.annotation.Nullable final String value) {
        this._publisherName = value;
    }
    /**
     * Sets the rulePackageId property value. The rulePackageId property
     * @param value Value to set for the rulePackageId property.
     * @return a void
     */
    public void setRulePackageId(@javax.annotation.Nullable final String value) {
        this._rulePackageId = value;
    }
    /**
     * Sets the rulePackageType property value. The rulePackageType property
     * @param value Value to set for the rulePackageType property.
     * @return a void
     */
    public void setRulePackageType(@javax.annotation.Nullable final String value) {
        this._rulePackageType = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final SensitiveTypeScope value) {
        this._scope = value;
    }
    /**
     * Sets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @param value Value to set for the sensitiveTypeSource property.
     * @return a void
     */
    public void setSensitiveTypeSource(@javax.annotation.Nullable final SensitiveTypeSource value) {
        this._sensitiveTypeSource = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
}
