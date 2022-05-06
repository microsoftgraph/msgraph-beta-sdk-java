package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeDefinition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** true if the attribute should be used as the anchor for the object. Anchor attributes must have a unique value identifying an object, and must be immutable. Default is false. One, and only one, of the object's attributes must be designated as the anchor to support synchronization.  */
    private Boolean _anchor;
    /** The apiExpressions property  */
    private java.util.List<StringKeyStringValuePair> _apiExpressions;
    /** true if value of this attribute should be treated as case-sensitive. This setting affects how the synchronization engine detects changes for the attribute.  */
    private Boolean _caseExact;
    /** The defaultValue property  */
    private String _defaultValue;
    /** 'true' to allow null values for attributes.  */
    private Boolean _flowNullValues;
    /** Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.  */
    private java.util.List<MetadataEntry> _metadata;
    /** true if an attribute can have multiple values. Default is false.  */
    private Boolean _multivalued;
    /** An attribute's mutability. Possible values are:  ReadWrite, ReadOnly, Immutable, WriteOnly. Default is ReadWrite.  */
    private Mutability _mutability;
    /** Name of the attribute. Must be unique within the object definition. Not nullable.  */
    private String _name;
    /** For attributes with reference type, lists referenced objects (for example, the manager attribute would list User as the referenced object).  */
    private java.util.List<ReferencedObject> _referencedObjects;
    /** true if attribute is required. Object can not be created if any of the required attributes are missing. If during synchronization, the required attribute has no value, the default value will be used. If default the value was not set, synchronization will record an error.  */
    private Boolean _required;
    /** Attribute value type. Possible values are: String, Integer, Reference, Binary, Boolean,DateTime. Default is String.  */
    private AttributeType _type;
    /**
     * Instantiates a new attributeDefinition and sets the default values.
     * @return a void
     */
    public AttributeDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeDefinition
     */
    @javax.annotation.Nonnull
    public static AttributeDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeDefinition();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the anchor property value. true if the attribute should be used as the anchor for the object. Anchor attributes must have a unique value identifying an object, and must be immutable. Default is false. One, and only one, of the object's attributes must be designated as the anchor to support synchronization.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAnchor() {
        return this._anchor;
    }
    /**
     * Gets the apiExpressions property value. The apiExpressions property
     * @return a stringKeyStringValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyStringValuePair> getApiExpressions() {
        return this._apiExpressions;
    }
    /**
     * Gets the caseExact property value. true if value of this attribute should be treated as case-sensitive. This setting affects how the synchronization engine detects changes for the attribute.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCaseExact() {
        return this._caseExact;
    }
    /**
     * Gets the defaultValue property value. The defaultValue property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeDefinition currentObject = this;
        return new HashMap<>(12) {{
            this.put("anchor", (n) -> { currentObject.setAnchor(n.getBooleanValue()); });
            this.put("apiExpressions", (n) -> { currentObject.setApiExpressions(n.getCollectionOfObjectValues(StringKeyStringValuePair::createFromDiscriminatorValue)); });
            this.put("caseExact", (n) -> { currentObject.setCaseExact(n.getBooleanValue()); });
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getStringValue()); });
            this.put("flowNullValues", (n) -> { currentObject.setFlowNullValues(n.getBooleanValue()); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getCollectionOfObjectValues(MetadataEntry::createFromDiscriminatorValue)); });
            this.put("multivalued", (n) -> { currentObject.setMultivalued(n.getBooleanValue()); });
            this.put("mutability", (n) -> { currentObject.setMutability(n.getEnumValue(Mutability.class)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("referencedObjects", (n) -> { currentObject.setReferencedObjects(n.getCollectionOfObjectValues(ReferencedObject::createFromDiscriminatorValue)); });
            this.put("required", (n) -> { currentObject.setRequired(n.getBooleanValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(AttributeType.class)); });
        }};
    }
    /**
     * Gets the flowNullValues property value. 'true' to allow null values for attributes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFlowNullValues() {
        return this._flowNullValues;
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @return a metadataEntry
     */
    @javax.annotation.Nullable
    public java.util.List<MetadataEntry> getMetadata() {
        return this._metadata;
    }
    /**
     * Gets the multivalued property value. true if an attribute can have multiple values. Default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMultivalued() {
        return this._multivalued;
    }
    /**
     * Gets the mutability property value. An attribute's mutability. Possible values are:  ReadWrite, ReadOnly, Immutable, WriteOnly. Default is ReadWrite.
     * @return a mutability
     */
    @javax.annotation.Nullable
    public Mutability getMutability() {
        return this._mutability;
    }
    /**
     * Gets the name property value. Name of the attribute. Must be unique within the object definition. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the referencedObjects property value. For attributes with reference type, lists referenced objects (for example, the manager attribute would list User as the referenced object).
     * @return a referencedObject
     */
    @javax.annotation.Nullable
    public java.util.List<ReferencedObject> getReferencedObjects() {
        return this._referencedObjects;
    }
    /**
     * Gets the required property value. true if attribute is required. Object can not be created if any of the required attributes are missing. If during synchronization, the required attribute has no value, the default value will be used. If default the value was not set, synchronization will record an error.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this._required;
    }
    /**
     * Gets the type property value. Attribute value type. Possible values are: String, Integer, Reference, Binary, Boolean,DateTime. Default is String.
     * @return a attributeType
     */
    @javax.annotation.Nullable
    public AttributeType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("anchor", this.getAnchor());
        writer.writeCollectionOfObjectValues("apiExpressions", this.getApiExpressions());
        writer.writeBooleanValue("caseExact", this.getCaseExact());
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("flowNullValues", this.getFlowNullValues());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeBooleanValue("multivalued", this.getMultivalued());
        writer.writeEnumValue("mutability", this.getMutability());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("referencedObjects", this.getReferencedObjects());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the anchor property value. true if the attribute should be used as the anchor for the object. Anchor attributes must have a unique value identifying an object, and must be immutable. Default is false. One, and only one, of the object's attributes must be designated as the anchor to support synchronization.
     * @param value Value to set for the anchor property.
     * @return a void
     */
    public void setAnchor(@javax.annotation.Nullable final Boolean value) {
        this._anchor = value;
    }
    /**
     * Sets the apiExpressions property value. The apiExpressions property
     * @param value Value to set for the apiExpressions property.
     * @return a void
     */
    public void setApiExpressions(@javax.annotation.Nullable final java.util.List<StringKeyStringValuePair> value) {
        this._apiExpressions = value;
    }
    /**
     * Sets the caseExact property value. true if value of this attribute should be treated as case-sensitive. This setting affects how the synchronization engine detects changes for the attribute.
     * @param value Value to set for the caseExact property.
     * @return a void
     */
    public void setCaseExact(@javax.annotation.Nullable final Boolean value) {
        this._caseExact = value;
    }
    /**
     * Sets the defaultValue property value. The defaultValue property
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this._defaultValue = value;
    }
    /**
     * Sets the flowNullValues property value. 'true' to allow null values for attributes.
     * @param value Value to set for the flowNullValues property.
     * @return a void
     */
    public void setFlowNullValues(@javax.annotation.Nullable final Boolean value) {
        this._flowNullValues = value;
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    public void setMetadata(@javax.annotation.Nullable final java.util.List<MetadataEntry> value) {
        this._metadata = value;
    }
    /**
     * Sets the multivalued property value. true if an attribute can have multiple values. Default is false.
     * @param value Value to set for the multivalued property.
     * @return a void
     */
    public void setMultivalued(@javax.annotation.Nullable final Boolean value) {
        this._multivalued = value;
    }
    /**
     * Sets the mutability property value. An attribute's mutability. Possible values are:  ReadWrite, ReadOnly, Immutable, WriteOnly. Default is ReadWrite.
     * @param value Value to set for the mutability property.
     * @return a void
     */
    public void setMutability(@javax.annotation.Nullable final Mutability value) {
        this._mutability = value;
    }
    /**
     * Sets the name property value. Name of the attribute. Must be unique within the object definition. Not nullable.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the referencedObjects property value. For attributes with reference type, lists referenced objects (for example, the manager attribute would list User as the referenced object).
     * @param value Value to set for the referencedObjects property.
     * @return a void
     */
    public void setReferencedObjects(@javax.annotation.Nullable final java.util.List<ReferencedObject> value) {
        this._referencedObjects = value;
    }
    /**
     * Sets the required property value. true if attribute is required. Object can not be created if any of the required attributes are missing. If during synchronization, the required attribute has no value, the default value will be used. If default the value was not set, synchronization will record an error.
     * @param value Value to set for the required property.
     * @return a void
     */
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this._required = value;
    }
    /**
     * Sets the type property value. Attribute value type. Possible values are: String, Integer, Reference, Binary, Boolean,DateTime. Default is String.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final AttributeType value) {
        this._type = value;
    }
}
