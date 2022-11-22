package com.microsoft.graph.devicemanagement.grouppolicyconfigurations.item.updatedefinitionvalues;

import com.microsoft.graph.models.GroupPolicyDefinitionValue;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateDefinitionValues method. */
public class UpdateDefinitionValuesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** The added property */
    private java.util.List<GroupPolicyDefinitionValue> _added;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deletedIds property */
    private java.util.List<String> _deletedIds;
    /** The updated property */
    private java.util.List<GroupPolicyDefinitionValue> _updated;
    /**
     * Instantiates a new updateDefinitionValuesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateDefinitionValuesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateDefinitionValuesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateDefinitionValuesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateDefinitionValuesPostRequestBody();
    }
    /**
     * Gets the added property value. The added property
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getAdded() {
        return this._added;
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
     * Gets the deletedIds property value. The deletedIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeletedIds() {
        return this._deletedIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("added", (n) -> { this.setAdded(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedIds", (n) -> { this.setDeletedIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updated", (n) -> { this.setUpdated(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updated property value. The updated property
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getUpdated() {
        return this._updated;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("added", this.getAdded());
        writer.writeCollectionOfPrimitiveValues("deletedIds", this.getDeletedIds());
        writer.writeCollectionOfObjectValues("updated", this.getUpdated());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the added property value. The added property
     * @param value Value to set for the added property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdded(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this._added = value;
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
     * Sets the deletedIds property value. The deletedIds property
     * @param value Value to set for the deletedIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deletedIds = value;
    }
    /**
     * Sets the updated property value. The updated property
     * @param value Value to set for the updated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdated(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this._updated = value;
    }
}
