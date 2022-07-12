package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeMapping implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Default value to be used in case the source property was evaluated to null. Optional. */
    private String _defaultValue;
    /** For internal use only. */
    private Boolean _exportMissingReferences;
    /** The flowBehavior property */
    private AttributeFlowBehavior _flowBehavior;
    /** The flowType property */
    private AttributeFlowType _flowType;
    /** If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes. */
    private Integer _matchingPriority;
    /** Defines how a value should be extracted (or transformed) from the source object. */
    private AttributeMappingSource _source;
    /** Name of the attribute on the target object. */
    private String _targetAttributeName;
    /**
     * Instantiates a new attributeMapping and sets the default values.
     * @return a void
     */
    public AttributeMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeMapping
     */
    @javax.annotation.Nonnull
    public static AttributeMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMapping();
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
     * Gets the defaultValue property value. Default value to be used in case the source property was evaluated to null. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this._defaultValue;
    }
    /**
     * Gets the exportMissingReferences property value. For internal use only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExportMissingReferences() {
        return this._exportMissingReferences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeMapping currentObject = this;
        return new HashMap<>(7) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getStringValue()); });
            this.put("exportMissingReferences", (n) -> { currentObject.setExportMissingReferences(n.getBooleanValue()); });
            this.put("flowBehavior", (n) -> { currentObject.setFlowBehavior(n.getEnumValue(AttributeFlowBehavior.class)); });
            this.put("flowType", (n) -> { currentObject.setFlowType(n.getEnumValue(AttributeFlowType.class)); });
            this.put("matchingPriority", (n) -> { currentObject.setMatchingPriority(n.getIntegerValue()); });
            this.put("source", (n) -> { currentObject.setSource(n.getObjectValue(AttributeMappingSource::createFromDiscriminatorValue)); });
            this.put("targetAttributeName", (n) -> { currentObject.setTargetAttributeName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the flowBehavior property value. The flowBehavior property
     * @return a attributeFlowBehavior
     */
    @javax.annotation.Nullable
    public AttributeFlowBehavior getFlowBehavior() {
        return this._flowBehavior;
    }
    /**
     * Gets the flowType property value. The flowType property
     * @return a attributeFlowType
     */
    @javax.annotation.Nullable
    public AttributeFlowType getFlowType() {
        return this._flowType;
    }
    /**
     * Gets the matchingPriority property value. If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMatchingPriority() {
        return this._matchingPriority;
    }
    /**
     * Gets the source property value. Defines how a value should be extracted (or transformed) from the source object.
     * @return a attributeMappingSource
     */
    @javax.annotation.Nullable
    public AttributeMappingSource getSource() {
        return this._source;
    }
    /**
     * Gets the targetAttributeName property value. Name of the attribute on the target object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetAttributeName() {
        return this._targetAttributeName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("exportMissingReferences", this.getExportMissingReferences());
        writer.writeEnumValue("flowBehavior", this.getFlowBehavior());
        writer.writeEnumValue("flowType", this.getFlowType());
        writer.writeIntegerValue("matchingPriority", this.getMatchingPriority());
        writer.writeObjectValue("source", this.getSource());
        writer.writeStringValue("targetAttributeName", this.getTargetAttributeName());
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
     * Sets the defaultValue property value. Default value to be used in case the source property was evaluated to null. Optional.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this._defaultValue = value;
    }
    /**
     * Sets the exportMissingReferences property value. For internal use only.
     * @param value Value to set for the exportMissingReferences property.
     * @return a void
     */
    public void setExportMissingReferences(@javax.annotation.Nullable final Boolean value) {
        this._exportMissingReferences = value;
    }
    /**
     * Sets the flowBehavior property value. The flowBehavior property
     * @param value Value to set for the flowBehavior property.
     * @return a void
     */
    public void setFlowBehavior(@javax.annotation.Nullable final AttributeFlowBehavior value) {
        this._flowBehavior = value;
    }
    /**
     * Sets the flowType property value. The flowType property
     * @param value Value to set for the flowType property.
     * @return a void
     */
    public void setFlowType(@javax.annotation.Nullable final AttributeFlowType value) {
        this._flowType = value;
    }
    /**
     * Sets the matchingPriority property value. If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     * @param value Value to set for the matchingPriority property.
     * @return a void
     */
    public void setMatchingPriority(@javax.annotation.Nullable final Integer value) {
        this._matchingPriority = value;
    }
    /**
     * Sets the source property value. Defines how a value should be extracted (or transformed) from the source object.
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final AttributeMappingSource value) {
        this._source = value;
    }
    /**
     * Sets the targetAttributeName property value. Name of the attribute on the target object.
     * @param value Value to set for the targetAttributeName property.
     * @return a void
     */
    public void setTargetAttributeName(@javax.annotation.Nullable final String value) {
        this._targetAttributeName = value;
    }
}
