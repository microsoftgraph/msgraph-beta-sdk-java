package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCloudLicensing implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserCloudLicensing} and sets the default values.
     */
    public UserCloudLicensing() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserCloudLicensing}
     */
    @jakarta.annotation.Nonnull
    public static UserCloudLicensing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCloudLicensing();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the assignmentErrors property value. The assignmentErrors property
     * @return a {@link java.util.List<AssignmentError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentError> getAssignmentErrors() {
        return this.backingStore.get("assignmentErrors");
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a {@link java.util.List<Assignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Assignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assignmentErrors", (n) -> { this.setAssignmentErrors(n.getCollectionOfObjectValues(AssignmentError::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(Assignment::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("usageRights", (n) -> { this.setUsageRights(n.getCollectionOfObjectValues(UsageRight::createFromDiscriminatorValue)); });
        deserializerMap.put("waitingMembers", (n) -> { this.setWaitingMembers(n.getCollectionOfObjectValues(WaitingMember::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the usageRights property value. The usageRights property
     * @return a {@link java.util.List<UsageRight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UsageRight> getUsageRights() {
        return this.backingStore.get("usageRights");
    }
    /**
     * Gets the waitingMembers property value. The waitingMembers property
     * @return a {@link java.util.List<WaitingMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WaitingMember> getWaitingMembers() {
        return this.backingStore.get("waitingMembers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("assignmentErrors", this.getAssignmentErrors());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("usageRights", this.getUsageRights());
        writer.writeCollectionOfObjectValues("waitingMembers", this.getWaitingMembers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the assignmentErrors property value. The assignmentErrors property
     * @param value Value to set for the assignmentErrors property.
     */
    public void setAssignmentErrors(@jakarta.annotation.Nullable final java.util.List<AssignmentError> value) {
        this.backingStore.set("assignmentErrors", value);
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<Assignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the usageRights property value. The usageRights property
     * @param value Value to set for the usageRights property.
     */
    public void setUsageRights(@jakarta.annotation.Nullable final java.util.List<UsageRight> value) {
        this.backingStore.set("usageRights", value);
    }
    /**
     * Sets the waitingMembers property value. The waitingMembers property
     * @param value Value to set for the waitingMembers property.
     */
    public void setWaitingMembers(@jakarta.annotation.Nullable final java.util.List<WaitingMember> value) {
        this.backingStore.set("waitingMembers", value);
    }
}
