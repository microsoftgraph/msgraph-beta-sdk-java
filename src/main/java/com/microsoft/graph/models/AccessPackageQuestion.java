package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageQuestion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * ID of the question.
     */
    private String id;
    /**
     * Specifies whether the requestor is allowed to edit answers to questions.
     */
    private Boolean isAnswerEditable;
    /**
     * Whether the requestor is required to supply an answer or not.
     */
    private Boolean isRequired;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Relative position of this question when displaying a list of questions to the requestor.
     */
    private Integer sequence;
    /**
     * The text of the question to show to the requestor.
     */
    private AccessPackageLocalizedContent text;
    /**
     * Instantiates a new AccessPackageQuestion and sets the default values.
     */
    public AccessPackageQuestion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageQuestion
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.accessPackageMultipleChoiceQuestion": return new AccessPackageMultipleChoiceQuestion();
                case "#microsoft.graph.accessPackageTextInputQuestion": return new AccessPackageTextInputQuestion();
            }
        }
        return new AccessPackageQuestion();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isAnswerEditable", (n) -> { this.setIsAnswerEditable(n.getBooleanValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sequence", (n) -> { this.setSequence(n.getIntegerValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(AccessPackageLocalizedContent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. ID of the question.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isAnswerEditable property value. Specifies whether the requestor is allowed to edit answers to questions.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAnswerEditable() {
        return this.isAnswerEditable;
    }
    /**
     * Gets the isRequired property value. Whether the requestor is required to supply an answer or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sequence property value. Relative position of this question when displaying a list of questions to the requestor.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.sequence;
    }
    /**
     * Gets the text property value. The text of the question to show to the requestor.
     * @return a AccessPackageLocalizedContent
     */
    @jakarta.annotation.Nullable
    public AccessPackageLocalizedContent getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isAnswerEditable", this.getIsAnswerEditable());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("sequence", this.getSequence());
        writer.writeObjectValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the id property value. ID of the question.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isAnswerEditable property value. Specifies whether the requestor is allowed to edit answers to questions.
     * @param value Value to set for the isAnswerEditable property.
     */
    public void setIsAnswerEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.isAnswerEditable = value;
    }
    /**
     * Sets the isRequired property value. Whether the requestor is required to supply an answer or not.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isRequired = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sequence property value. Relative position of this question when displaying a list of questions to the requestor.
     * @param value Value to set for the sequence property.
     */
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.sequence = value;
    }
    /**
     * Sets the text property value. The text of the question to show to the requestor.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final AccessPackageLocalizedContent value) {
        this.text = value;
    }
}
