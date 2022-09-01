package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** true if the synchronization rule can be customized; false if this rule is read-only and should not be changed. */
    private Boolean _editable;
    /** Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API. */
    private String _id;
    /** Additional extension properties. Unless instructed explicitly by the support team, metadata values should not be changed. */
    private java.util.List<StringKeyStringValuePair> _metadata;
    /** Human-readable name of the synchronization rule. Not nullable. */
    private String _name;
    /** Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized. */
    private java.util.List<ObjectMapping> _objectMappings;
    /** The OdataType property */
    private String _odataType;
    /** Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first. */
    private Integer _priority;
    /** Name of the source directory. Must match one of the directory definitions in synchronizationSchema. */
    private String _sourceDirectoryName;
    /** Name of the target directory. Must match one of the directory definitions in synchronizationSchema. */
    private String _targetDirectoryName;
    /**
     * Instantiates a new synchronizationRule and sets the default values.
     * @return a void
     */
    public SynchronizationRule() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.synchronizationRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationRule
     */
    @javax.annotation.Nonnull
    public static SynchronizationRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationRule();
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
     * Gets the editable property value. true if the synchronization rule can be customized; false if this rule is read-only and should not be changed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEditable() {
        return this._editable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationRule currentObject = this;
        return new HashMap<>(9) {{
            this.put("editable", (n) -> { currentObject.setEditable(n.getBooleanValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getCollectionOfObjectValues(StringKeyStringValuePair::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("objectMappings", (n) -> { currentObject.setObjectMappings(n.getCollectionOfObjectValues(ObjectMapping::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("sourceDirectoryName", (n) -> { currentObject.setSourceDirectoryName(n.getStringValue()); });
            this.put("targetDirectoryName", (n) -> { currentObject.setTargetDirectoryName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless instructed explicitly by the support team, metadata values should not be changed.
     * @return a stringKeyStringValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyStringValuePair> getMetadata() {
        return this._metadata;
    }
    /**
     * Gets the name property value. Human-readable name of the synchronization rule. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the objectMappings property value. Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized.
     * @return a objectMapping
     */
    @javax.annotation.Nullable
    public java.util.List<ObjectMapping> getObjectMappings() {
        return this._objectMappings;
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
     * Gets the priority property value. Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the sourceDirectoryName property value. Name of the source directory. Must match one of the directory definitions in synchronizationSchema.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceDirectoryName() {
        return this._sourceDirectoryName;
    }
    /**
     * Gets the targetDirectoryName property value. Name of the target directory. Must match one of the directory definitions in synchronizationSchema.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDirectoryName() {
        return this._targetDirectoryName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("editable", this.getEditable());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("objectMappings", this.getObjectMappings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("sourceDirectoryName", this.getSourceDirectoryName());
        writer.writeStringValue("targetDirectoryName", this.getTargetDirectoryName());
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
     * Sets the editable property value. true if the synchronization rule can be customized; false if this rule is read-only and should not be changed.
     * @param value Value to set for the editable property.
     * @return a void
     */
    public void setEditable(@javax.annotation.Nullable final Boolean value) {
        this._editable = value;
    }
    /**
     * Sets the id property value. Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless instructed explicitly by the support team, metadata values should not be changed.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    public void setMetadata(@javax.annotation.Nullable final java.util.List<StringKeyStringValuePair> value) {
        this._metadata = value;
    }
    /**
     * Sets the name property value. Human-readable name of the synchronization rule. Not nullable.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the objectMappings property value. Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized.
     * @param value Value to set for the objectMappings property.
     * @return a void
     */
    public void setObjectMappings(@javax.annotation.Nullable final java.util.List<ObjectMapping> value) {
        this._objectMappings = value;
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
     * Sets the priority property value. Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the sourceDirectoryName property value. Name of the source directory. Must match one of the directory definitions in synchronizationSchema.
     * @param value Value to set for the sourceDirectoryName property.
     * @return a void
     */
    public void setSourceDirectoryName(@javax.annotation.Nullable final String value) {
        this._sourceDirectoryName = value;
    }
    /**
     * Sets the targetDirectoryName property value. Name of the target directory. Must match one of the directory definitions in synchronizationSchema.
     * @param value Value to set for the targetDirectoryName property.
     * @return a void
     */
    public void setTargetDirectoryName(@javax.annotation.Nullable final String value) {
        this._targetDirectoryName = value;
    }
}
