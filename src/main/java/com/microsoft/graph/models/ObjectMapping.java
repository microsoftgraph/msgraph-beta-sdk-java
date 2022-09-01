package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ObjectMapping implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values. */
    private java.util.List<AttributeMapping> _attributeMappings;
    /** When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped. */
    private Boolean _enabled;
    /** The flowTypes property */
    private ObjectFlowTypes _flowTypes;
    /** Additional extension properties. Unless mentioned explicitly, metadata values should not be changed. */
    private java.util.List<MetadataEntry> _metadata;
    /** Human-friendly name of the object mapping. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US. */
    private Filter _scope;
    /** Name of the object in the source directory. Must match the object name from the source directory definition. */
    private String _sourceObjectName;
    /** Name of the object in target directory. Must match the object name from the target directory definition. */
    private String _targetObjectName;
    /**
     * Instantiates a new objectMapping and sets the default values.
     * @return a void
     */
    public ObjectMapping() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.objectMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a objectMapping
     */
    @javax.annotation.Nonnull
    public static ObjectMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectMapping();
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
     * Gets the attributeMappings property value. Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     * @return a attributeMapping
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeMapping> getAttributeMappings() {
        return this._attributeMappings;
    }
    /**
     * Gets the enabled property value. When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ObjectMapping currentObject = this;
        return new HashMap<>(9) {{
            this.put("attributeMappings", (n) -> { currentObject.setAttributeMappings(n.getCollectionOfObjectValues(AttributeMapping::createFromDiscriminatorValue)); });
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("flowTypes", (n) -> { currentObject.setFlowTypes(n.getEnumValue(ObjectFlowTypes.class)); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getCollectionOfObjectValues(MetadataEntry::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getObjectValue(Filter::createFromDiscriminatorValue)); });
            this.put("sourceObjectName", (n) -> { currentObject.setSourceObjectName(n.getStringValue()); });
            this.put("targetObjectName", (n) -> { currentObject.setTargetObjectName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the flowTypes property value. The flowTypes property
     * @return a objectFlowTypes
     */
    @javax.annotation.Nullable
    public ObjectFlowTypes getFlowTypes() {
        return this._flowTypes;
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
     * Gets the name property value. Human-friendly name of the object mapping.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the scope property value. Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     * @return a filter
     */
    @javax.annotation.Nullable
    public Filter getScope() {
        return this._scope;
    }
    /**
     * Gets the sourceObjectName property value. Name of the object in the source directory. Must match the object name from the source directory definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceObjectName() {
        return this._sourceObjectName;
    }
    /**
     * Gets the targetObjectName property value. Name of the object in target directory. Must match the object name from the target directory definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetObjectName() {
        return this._targetObjectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributeMappings", this.getAttributeMappings());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumValue("flowTypes", this.getFlowTypes());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("scope", this.getScope());
        writer.writeStringValue("sourceObjectName", this.getSourceObjectName());
        writer.writeStringValue("targetObjectName", this.getTargetObjectName());
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
     * Sets the attributeMappings property value. Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     * @param value Value to set for the attributeMappings property.
     * @return a void
     */
    public void setAttributeMappings(@javax.annotation.Nullable final java.util.List<AttributeMapping> value) {
        this._attributeMappings = value;
    }
    /**
     * Sets the enabled property value. When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the flowTypes property value. The flowTypes property
     * @param value Value to set for the flowTypes property.
     * @return a void
     */
    public void setFlowTypes(@javax.annotation.Nullable final ObjectFlowTypes value) {
        this._flowTypes = value;
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
     * Sets the name property value. Human-friendly name of the object mapping.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the scope property value. Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final Filter value) {
        this._scope = value;
    }
    /**
     * Sets the sourceObjectName property value. Name of the object in the source directory. Must match the object name from the source directory definition.
     * @param value Value to set for the sourceObjectName property.
     * @return a void
     */
    public void setSourceObjectName(@javax.annotation.Nullable final String value) {
        this._sourceObjectName = value;
    }
    /**
     * Sets the targetObjectName property value. Name of the object in target directory. Must match the object name from the target directory definition.
     * @param value Value to set for the targetObjectName property.
     * @return a void
     */
    public void setTargetObjectName(@javax.annotation.Nullable final String value) {
        this._targetObjectName = value;
    }
}
