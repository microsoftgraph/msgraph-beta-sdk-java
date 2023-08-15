package com.microsoft.graph.devicemanagement.grouppolicyconfigurations.item.updatedefinitionvalues;

import com.microsoft.graph.models.GroupPolicyDefinitionValue;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateDefinitionValuesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * The added property
     */
    private java.util.List<GroupPolicyDefinitionValue> added;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deletedIds property
     */
    private java.util.List<String> deletedIds;
    /**
     * The updated property
     */
    private java.util.List<GroupPolicyDefinitionValue> updated;
    /**
     * Instantiates a new updateDefinitionValuesPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UpdateDefinitionValuesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateDefinitionValuesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateDefinitionValuesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateDefinitionValuesPostRequestBody();
    }
    /**
     * Gets the added property value. The added property
     * @return a groupPolicyDefinitionValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getAdded() {
        return this.added;
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
     * Gets the deletedIds property value. The deletedIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeletedIds() {
        return this.deletedIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("added", (n) -> { this.setAdded(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedIds", (n) -> { this.setDeletedIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updated", (n) -> { this.setUpdated(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updated property value. The updated property
     * @return a groupPolicyDefinitionValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getUpdated() {
        return this.updated;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAdded(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this.added = value;
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
     * Sets the deletedIds property value. The deletedIds property
     * @param value Value to set for the deletedIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeletedIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.deletedIds = value;
    }
    /**
     * Sets the updated property value. The updated property
     * @param value Value to set for the updated property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpdated(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this.updated = value;
    }
}
