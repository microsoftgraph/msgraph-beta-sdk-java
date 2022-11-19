package com.microsoft.graph.deviceappmanagement.policysets.item.update;

import com.microsoft.graph.models.PolicySetAssignment;
import com.microsoft.graph.models.PolicySetItem;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the update method. */
public class UpdatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** The addedPolicySetItems property */
    private java.util.List<PolicySetItem> _addedPolicySetItems;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignments property */
    private java.util.List<PolicySetAssignment> _assignments;
    /** The deletedPolicySetItems property */
    private java.util.List<String> _deletedPolicySetItems;
    /** The updatedPolicySetItems property */
    private java.util.List<PolicySetItem> _updatedPolicySetItems;
    /**
     * Instantiates a new updatePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updatePostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePostRequestBody();
    }
    /**
     * Gets the addedPolicySetItems property value. The addedPolicySetItems property
     * @return a policySetItem
     */
    @javax.annotation.Nullable
    public java.util.List<PolicySetItem> getAddedPolicySetItems() {
        return this._addedPolicySetItems;
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
     * Gets the assignments property value. The assignments property
     * @return a policySetAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<PolicySetAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the deletedPolicySetItems property value. The deletedPolicySetItems property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeletedPolicySetItems() {
        return this._deletedPolicySetItems;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdatePostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("addedPolicySetItems", (n) -> { currentObject.setAddedPolicySetItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(PolicySetAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedPolicySetItems", (n) -> { currentObject.setDeletedPolicySetItems(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("updatedPolicySetItems", (n) -> { currentObject.setUpdatedPolicySetItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updatedPolicySetItems property value. The updatedPolicySetItems property
     * @return a policySetItem
     */
    @javax.annotation.Nullable
    public java.util.List<PolicySetItem> getUpdatedPolicySetItems() {
        return this._updatedPolicySetItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addedPolicySetItems", this.getAddedPolicySetItems());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfPrimitiveValues("deletedPolicySetItems", this.getDeletedPolicySetItems());
        writer.writeCollectionOfObjectValues("updatedPolicySetItems", this.getUpdatedPolicySetItems());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addedPolicySetItems property value. The addedPolicySetItems property
     * @param value Value to set for the addedPolicySetItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedPolicySetItems(@javax.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this._addedPolicySetItems = value;
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
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<PolicySetAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the deletedPolicySetItems property value. The deletedPolicySetItems property
     * @param value Value to set for the deletedPolicySetItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedPolicySetItems(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deletedPolicySetItems = value;
    }
    /**
     * Sets the updatedPolicySetItems property value. The updatedPolicySetItems property
     * @param value Value to set for the updatedPolicySetItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdatedPolicySetItems(@javax.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this._updatedPolicySetItems = value;
    }
}
