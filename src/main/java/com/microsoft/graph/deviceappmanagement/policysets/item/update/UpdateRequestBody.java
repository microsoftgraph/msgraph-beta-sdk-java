package microsoft.graph.deviceappmanagement.policysets.item.update;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.PolicySetAssignment;
import microsoft.graph.models.PolicySetItem;
/** Provides operations to call the update method.  */
public class UpdateRequestBody implements AdditionalDataHolder, Parsable {
    /** The addedPolicySetItems property  */
    private java.util.List<PolicySetItem> _addedPolicySetItems;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The assignments property  */
    private java.util.List<PolicySetAssignment> _assignments;
    /** The deletedPolicySetItems property  */
    private java.util.List<String> _deletedPolicySetItems;
    /** The updatedPolicySetItems property  */
    private java.util.List<PolicySetItem> _updatedPolicySetItems;
    /**
     * Instantiates a new updateRequestBody and sets the default values.
     * @return a void
     */
    public UpdateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRequestBody();
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
        final UpdateRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("addedPolicySetItems", (n) -> { currentObject.setAddedPolicySetItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(PolicySetAssignment::createFromDiscriminatorValue)); });
            this.put("deletedPolicySetItems", (n) -> { currentObject.setDeletedPolicySetItems(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("updatedPolicySetItems", (n) -> { currentObject.setUpdatedPolicySetItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        }};
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
    public void setAddedPolicySetItems(@javax.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this._addedPolicySetItems = value;
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
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<PolicySetAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the deletedPolicySetItems property value. The deletedPolicySetItems property
     * @param value Value to set for the deletedPolicySetItems property.
     * @return a void
     */
    public void setDeletedPolicySetItems(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deletedPolicySetItems = value;
    }
    /**
     * Sets the updatedPolicySetItems property value. The updatedPolicySetItems property
     * @param value Value to set for the updatedPolicySetItems property.
     * @return a void
     */
    public void setUpdatedPolicySetItems(@javax.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this._updatedPolicySetItems = value;
    }
}
