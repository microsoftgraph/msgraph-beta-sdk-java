package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LabelingOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The assignmentMethod property */
    private AssignmentMethod assignmentMethod;
    /** The downgrade justification object that indicates if downgrade was justified and, if so, the reason. */
    private DowngradeJustification downgradeJustification;
    /** Extended properties will be parsed and returned in the standard Microsoft Purview Information Protection labeled metadata format as part of the label information. */
    private java.util.List<KeyValuePair> extendedProperties;
    /** The GUID of the label that should be applied to the information. */
    private String labelId;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new LabelingOptions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LabelingOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LabelingOptions
     */
    @javax.annotation.Nonnull
    public static LabelingOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelingOptions();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the assignmentMethod property value. The assignmentMethod property
     * @return a AssignmentMethod
     */
    @javax.annotation.Nullable
    public AssignmentMethod getAssignmentMethod() {
        return this.assignmentMethod;
    }
    /**
     * Gets the downgradeJustification property value. The downgrade justification object that indicates if downgrade was justified and, if so, the reason.
     * @return a downgradeJustification
     */
    @javax.annotation.Nullable
    public DowngradeJustification getDowngradeJustification() {
        return this.downgradeJustification;
    }
    /**
     * Gets the extendedProperties property value. Extended properties will be parsed and returned in the standard Microsoft Purview Information Protection labeled metadata format as part of the label information.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getExtendedProperties() {
        return this.extendedProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assignmentMethod", (n) -> { this.setAssignmentMethod(n.getEnumValue(AssignmentMethod.class)); });
        deserializerMap.put("downgradeJustification", (n) -> { this.setDowngradeJustification(n.getObjectValue(DowngradeJustification::createFromDiscriminatorValue)); });
        deserializerMap.put("extendedProperties", (n) -> { this.setExtendedProperties(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("labelId", (n) -> { this.setLabelId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labelId property value. The GUID of the label that should be applied to the information.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabelId() {
        return this.labelId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeObjectValue("downgradeJustification", this.getDowngradeJustification());
        writer.writeCollectionOfObjectValues("extendedProperties", this.getExtendedProperties());
        writer.writeStringValue("labelId", this.getLabelId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentMethod property value. The assignmentMethod property
     * @param value Value to set for the assignmentMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentMethod(@javax.annotation.Nullable final AssignmentMethod value) {
        this.assignmentMethod = value;
    }
    /**
     * Sets the downgradeJustification property value. The downgrade justification object that indicates if downgrade was justified and, if so, the reason.
     * @param value Value to set for the downgradeJustification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDowngradeJustification(@javax.annotation.Nullable final DowngradeJustification value) {
        this.downgradeJustification = value;
    }
    /**
     * Sets the extendedProperties property value. Extended properties will be parsed and returned in the standard Microsoft Purview Information Protection labeled metadata format as part of the label information.
     * @param value Value to set for the extendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtendedProperties(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.extendedProperties = value;
    }
    /**
     * Sets the labelId property value. The GUID of the label that should be applied to the information.
     * @param value Value to set for the labelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabelId(@javax.annotation.Nullable final String value) {
        this.labelId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
