package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtectionContentLabel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignmentMethod property
     */
    private AssignmentMethod assignmentMethod;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime creationDateTime;
    /**
     * Details on the label that is currently applied to the file.
     */
    private LabelDetails label;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new informationProtectionContentLabel and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public InformationProtectionContentLabel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionContentLabel
     */
    @jakarta.annotation.Nonnull
    public static InformationProtectionContentLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionContentLabel();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the assignmentMethod property value. The assignmentMethod property
     * @return a assignmentMethod
     */
    @jakarta.annotation.Nullable
    public AssignmentMethod getAssignmentMethod() {
        return this.assignmentMethod;
    }
    /**
     * Gets the creationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assignmentMethod", (n) -> { this.setAssignmentMethod(n.getEnumValue(AssignmentMethod.class)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getObjectValue(LabelDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Details on the label that is currently applied to the file.
     * @return a labelDetails
     */
    @jakarta.annotation.Nullable
    public LabelDetails getLabel() {
        return this.label;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeObjectValue("label", this.getLabel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentMethod property value. The assignmentMethod property
     * @param value Value to set for the assignmentMethod property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignmentMethod(@jakarta.annotation.Nullable final AssignmentMethod value) {
        this.assignmentMethod = value;
    }
    /**
     * Sets the creationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the label property value. Details on the label that is currently applied to the file.
     * @param value Value to set for the label property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLabel(@jakarta.annotation.Nullable final LabelDetails value) {
        this.label = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
