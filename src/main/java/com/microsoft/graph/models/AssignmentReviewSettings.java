package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentReviewSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AssignmentReviewSettings and sets the default values.
     */
    public AssignmentReviewSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignmentReviewSettings
     */
    @jakarta.annotation.Nonnull
    public static AssignmentReviewSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentReviewSettings();
    }
    /**
     * Gets the accessReviewTimeoutBehavior property value. The default decision to apply if the request isn't reviewed within the period specified in durationInDays. The possible values are: acceptAccessRecommendation, keepAccess, removeAccess, and unknownFutureValue.
     * @return a AccessReviewTimeoutBehavior
     */
    @jakarta.annotation.Nullable
    public AccessReviewTimeoutBehavior getAccessReviewTimeoutBehavior() {
        return this.backingStore.get("accessReviewTimeoutBehavior");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the durationInDays property value. The number of days within which reviewers should provide input.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.backingStore.get("durationInDays");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("accessReviewTimeoutBehavior", (n) -> { this.setAccessReviewTimeoutBehavior(n.getEnumValue(AccessReviewTimeoutBehavior.class)); });
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("isAccessRecommendationEnabled", (n) -> { this.setIsAccessRecommendationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isApprovalJustificationRequired", (n) -> { this.setIsApprovalJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrenceType", (n) -> { this.setRecurrenceType(n.getStringValue()); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewerType", (n) -> { this.setReviewerType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAccessRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAccessRecommendationEnabled() {
        return this.backingStore.get("isAccessRecommendationEnabled");
    }
    /**
     * Gets the isApprovalJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalJustificationRequired() {
        return this.backingStore.get("isApprovalJustificationRequired");
    }
    /**
     * Gets the isEnabled property value. If true, access reviews are required for assignments from this policy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recurrenceType property value. The interval for recurrence, such as monthly or quarterly.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceType() {
        return this.backingStore.get("recurrenceType");
    }
    /**
     * Gets the reviewers property value. If the reviewerType is Reviewers, this collection specifies the users who will be reviewers, either by ID or as members of a group, using a collection of singleUser and groupMembers.
     * @return a java.util.List<UserSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSet> getReviewers() {
        return this.backingStore.get("reviewers");
    }
    /**
     * Gets the reviewerType property value. Who should be asked to do the review, either Self, Reviewers or Manager.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReviewerType() {
        return this.backingStore.get("reviewerType");
    }
    /**
     * Gets the startDateTime property value. When the first review should start.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessReviewTimeoutBehavior", this.getAccessReviewTimeoutBehavior());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeBooleanValue("isAccessRecommendationEnabled", this.getIsAccessRecommendationEnabled());
        writer.writeBooleanValue("isApprovalJustificationRequired", this.getIsApprovalJustificationRequired());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("recurrenceType", this.getRecurrenceType());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeStringValue("reviewerType", this.getReviewerType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviewTimeoutBehavior property value. The default decision to apply if the request isn't reviewed within the period specified in durationInDays. The possible values are: acceptAccessRecommendation, keepAccess, removeAccess, and unknownFutureValue.
     * @param value Value to set for the accessReviewTimeoutBehavior property.
     */
    public void setAccessReviewTimeoutBehavior(@jakarta.annotation.Nullable final AccessReviewTimeoutBehavior value) {
        this.backingStore.set("accessReviewTimeoutBehavior", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the durationInDays property value. The number of days within which reviewers should provide input.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("durationInDays", value);
    }
    /**
     * Sets the isAccessRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true
     * @param value Value to set for the isAccessRecommendationEnabled property.
     */
    public void setIsAccessRecommendationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAccessRecommendationEnabled", value);
    }
    /**
     * Sets the isApprovalJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @param value Value to set for the isApprovalJustificationRequired property.
     */
    public void setIsApprovalJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalJustificationRequired", value);
    }
    /**
     * Sets the isEnabled property value. If true, access reviews are required for assignments from this policy.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recurrenceType property value. The interval for recurrence, such as monthly or quarterly.
     * @param value Value to set for the recurrenceType property.
     */
    public void setRecurrenceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recurrenceType", value);
    }
    /**
     * Sets the reviewers property value. If the reviewerType is Reviewers, this collection specifies the users who will be reviewers, either by ID or as members of a group, using a collection of singleUser and groupMembers.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<UserSet> value) {
        this.backingStore.set("reviewers", value);
    }
    /**
     * Sets the reviewerType property value. Who should be asked to do the review, either Self, Reviewers or Manager.
     * @param value Value to set for the reviewerType property.
     */
    public void setReviewerType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewerType", value);
    }
    /**
     * Sets the startDateTime property value. When the first review should start.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
}
