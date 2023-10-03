package com.microsoft.graph.devicemanagement.intents.item.migratetotemplate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MigrateToTemplatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The newTemplateId property
     */
    private String newTemplateId;
    /**
     * The preserveCustomValues property
     */
    private Boolean preserveCustomValues;
    /**
     * Instantiates a new MigrateToTemplatePostRequestBody and sets the default values.
     */
    public MigrateToTemplatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MigrateToTemplatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static MigrateToTemplatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MigrateToTemplatePostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("newTemplateId", (n) -> { this.setNewTemplateId(n.getStringValue()); });
        deserializerMap.put("preserveCustomValues", (n) -> { this.setPreserveCustomValues(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newTemplateId property value. The newTemplateId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNewTemplateId() {
        return this.newTemplateId;
    }
    /**
     * Gets the preserveCustomValues property value. The preserveCustomValues property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreserveCustomValues() {
        return this.preserveCustomValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("newTemplateId", this.getNewTemplateId());
        writer.writeBooleanValue("preserveCustomValues", this.getPreserveCustomValues());
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
     * Sets the newTemplateId property value. The newTemplateId property
     * @param value Value to set for the newTemplateId property.
     */
    public void setNewTemplateId(@jakarta.annotation.Nullable final String value) {
        this.newTemplateId = value;
    }
    /**
     * Sets the preserveCustomValues property value. The preserveCustomValues property
     * @param value Value to set for the preserveCustomValues property.
     */
    public void setPreserveCustomValues(@jakarta.annotation.Nullable final Boolean value) {
        this.preserveCustomValues = value;
    }
}
