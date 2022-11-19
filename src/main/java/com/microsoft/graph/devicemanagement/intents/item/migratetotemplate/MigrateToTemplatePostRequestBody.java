package com.microsoft.graph.devicemanagement.intents.item.migratetotemplate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the migrateToTemplate method. */
public class MigrateToTemplatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The newTemplateId property */
    private String _newTemplateId;
    /** The preserveCustomValues property */
    private Boolean _preserveCustomValues;
    /**
     * Instantiates a new migrateToTemplatePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MigrateToTemplatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a migrateToTemplatePostRequestBody
     */
    @javax.annotation.Nonnull
    public static MigrateToTemplatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MigrateToTemplatePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MigrateToTemplatePostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("newTemplateId", (n) -> { currentObject.setNewTemplateId(n.getStringValue()); });
        deserializerMap.put("preserveCustomValues", (n) -> { currentObject.setPreserveCustomValues(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the newTemplateId property value. The newTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewTemplateId() {
        return this._newTemplateId;
    }
    /**
     * Gets the preserveCustomValues property value. The preserveCustomValues property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreserveCustomValues() {
        return this._preserveCustomValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("newTemplateId", this.getNewTemplateId());
        writer.writeBooleanValue("preserveCustomValues", this.getPreserveCustomValues());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the newTemplateId property value. The newTemplateId property
     * @param value Value to set for the newTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewTemplateId(@javax.annotation.Nullable final String value) {
        this._newTemplateId = value;
    }
    /**
     * Sets the preserveCustomValues property value. The preserveCustomValues property
     * @param value Value to set for the preserveCustomValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreserveCustomValues(@javax.annotation.Nullable final Boolean value) {
        this._preserveCustomValues = value;
    }
}
