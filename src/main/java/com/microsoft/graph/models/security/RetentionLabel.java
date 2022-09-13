package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class RetentionLabel extends Entity implements Parsable {
    /** Specifies the action to take on a document with this label applied during the retention period. The possible values are: none, delete, startDispositionReview, unknownFutureValue. */
    private ActionAfterRetentionPeriod _actionAfterRetentionPeriod;
    /** Specifies how the behavior of a document with this label should be during the retention period. The possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue. */
    private BehaviorDuringRetentionPeriod _behaviorDuringRetentionPeriod;
    /** Represents the user who created the retentionLabel. */
    private IdentitySet _createdBy;
    /** Represents the date and time in which the retentionLabel is created. */
    private OffsetDateTime _createdDateTime;
    /** Specifies the locked or unlocked state of a record label when it is created.The possible values are: startLocked, startUnlocked, unknownFutureValue. */
    private DefaultRecordBehavior _defaultRecordBehavior;
    /** Provides label information for the admin. Optional. */
    private String _descriptionForAdmins;
    /** Provides the label information for the user. Optional. */
    private String _descriptionForUsers;
    /** Unique string that defines a label name. */
    private String _displayName;
    /** Review stages during which reviewers are notified to determine whether a document must be deleted or retained. */
    private java.util.List<DispositionReviewStage> _dispositionReviewStages;
    /** Specifies whether the label is currently being used. */
    private Boolean _isInUse;
    /** Specifies the replacement label to be applied automatically after the retention period of the current label ends. */
    private String _labelToBeApplied;
    /** The user who last modified the retentionLabel. */
    private IdentitySet _lastModifiedBy;
    /** The latest date time when the retentionLabel was modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Specifies the number of days to retain the content. */
    private RetentionDuration _retentionDuration;
    /** The retentionEventType property */
    private RetentionEventType _retentionEventType;
    /** Specifies whether the retention duration is calculated from the content creation date, labeled date, or last modification date. The possible values are: dateLabeled, dateCreated, dateModified, dateOfEvent, unknownFutureValue. */
    private RetentionTrigger _retentionTrigger;
    /**
     * Instantiates a new retentionLabel and sets the default values.
     * @return a void
     */
    public RetentionLabel() {
        super();
        this.setOdataType("#microsoft.graph.security.retentionLabel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a retentionLabel
     */
    @javax.annotation.Nonnull
    public static RetentionLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionLabel();
    }
    /**
     * Gets the actionAfterRetentionPeriod property value. Specifies the action to take on a document with this label applied during the retention period. The possible values are: none, delete, startDispositionReview, unknownFutureValue.
     * @return a actionAfterRetentionPeriod
     */
    @javax.annotation.Nullable
    public ActionAfterRetentionPeriod getActionAfterRetentionPeriod() {
        return this._actionAfterRetentionPeriod;
    }
    /**
     * Gets the behaviorDuringRetentionPeriod property value. Specifies how the behavior of a document with this label should be during the retention period. The possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue.
     * @return a behaviorDuringRetentionPeriod
     */
    @javax.annotation.Nullable
    public BehaviorDuringRetentionPeriod getBehaviorDuringRetentionPeriod() {
        return this._behaviorDuringRetentionPeriod;
    }
    /**
     * Gets the createdBy property value. Represents the user who created the retentionLabel.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Represents the date and time in which the retentionLabel is created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the defaultRecordBehavior property value. Specifies the locked or unlocked state of a record label when it is created.The possible values are: startLocked, startUnlocked, unknownFutureValue.
     * @return a defaultRecordBehavior
     */
    @javax.annotation.Nullable
    public DefaultRecordBehavior getDefaultRecordBehavior() {
        return this._defaultRecordBehavior;
    }
    /**
     * Gets the descriptionForAdmins property value. Provides label information for the admin. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescriptionForAdmins() {
        return this._descriptionForAdmins;
    }
    /**
     * Gets the descriptionForUsers property value. Provides the label information for the user. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescriptionForUsers() {
        return this._descriptionForUsers;
    }
    /**
     * Gets the displayName property value. Unique string that defines a label name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the dispositionReviewStages property value. Review stages during which reviewers are notified to determine whether a document must be deleted or retained.
     * @return a dispositionReviewStage
     */
    @javax.annotation.Nullable
    public java.util.List<DispositionReviewStage> getDispositionReviewStages() {
        return this._dispositionReviewStages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RetentionLabel currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actionAfterRetentionPeriod", (n) -> { currentObject.setActionAfterRetentionPeriod(n.getEnumValue(ActionAfterRetentionPeriod.class)); });
            this.put("behaviorDuringRetentionPeriod", (n) -> { currentObject.setBehaviorDuringRetentionPeriod(n.getEnumValue(BehaviorDuringRetentionPeriod.class)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("defaultRecordBehavior", (n) -> { currentObject.setDefaultRecordBehavior(n.getEnumValue(DefaultRecordBehavior.class)); });
            this.put("descriptionForAdmins", (n) -> { currentObject.setDescriptionForAdmins(n.getStringValue()); });
            this.put("descriptionForUsers", (n) -> { currentObject.setDescriptionForUsers(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("dispositionReviewStages", (n) -> { currentObject.setDispositionReviewStages(n.getCollectionOfObjectValues(DispositionReviewStage::createFromDiscriminatorValue)); });
            this.put("isInUse", (n) -> { currentObject.setIsInUse(n.getBooleanValue()); });
            this.put("labelToBeApplied", (n) -> { currentObject.setLabelToBeApplied(n.getStringValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("retentionDuration", (n) -> { currentObject.setRetentionDuration(n.getObjectValue(RetentionDuration::createFromDiscriminatorValue)); });
            this.put("retentionEventType", (n) -> { currentObject.setRetentionEventType(n.getObjectValue(RetentionEventType::createFromDiscriminatorValue)); });
            this.put("retentionTrigger", (n) -> { currentObject.setRetentionTrigger(n.getEnumValue(RetentionTrigger.class)); });
        }};
    }
    /**
     * Gets the isInUse property value. Specifies whether the label is currently being used.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInUse() {
        return this._isInUse;
    }
    /**
     * Gets the labelToBeApplied property value. Specifies the replacement label to be applied automatically after the retention period of the current label ends.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabelToBeApplied() {
        return this._labelToBeApplied;
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the retentionLabel.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The latest date time when the retentionLabel was modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the retentionDuration property value. Specifies the number of days to retain the content.
     * @return a retentionDuration
     */
    @javax.annotation.Nullable
    public RetentionDuration getRetentionDuration() {
        return this._retentionDuration;
    }
    /**
     * Gets the retentionEventType property value. The retentionEventType property
     * @return a retentionEventType
     */
    @javax.annotation.Nullable
    public RetentionEventType getRetentionEventType() {
        return this._retentionEventType;
    }
    /**
     * Gets the retentionTrigger property value. Specifies whether the retention duration is calculated from the content creation date, labeled date, or last modification date. The possible values are: dateLabeled, dateCreated, dateModified, dateOfEvent, unknownFutureValue.
     * @return a retentionTrigger
     */
    @javax.annotation.Nullable
    public RetentionTrigger getRetentionTrigger() {
        return this._retentionTrigger;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionAfterRetentionPeriod", this.getActionAfterRetentionPeriod());
        writer.writeEnumValue("behaviorDuringRetentionPeriod", this.getBehaviorDuringRetentionPeriod());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("defaultRecordBehavior", this.getDefaultRecordBehavior());
        writer.writeStringValue("descriptionForAdmins", this.getDescriptionForAdmins());
        writer.writeStringValue("descriptionForUsers", this.getDescriptionForUsers());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("dispositionReviewStages", this.getDispositionReviewStages());
        writer.writeBooleanValue("isInUse", this.getIsInUse());
        writer.writeStringValue("labelToBeApplied", this.getLabelToBeApplied());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("retentionDuration", this.getRetentionDuration());
        writer.writeObjectValue("retentionEventType", this.getRetentionEventType());
        writer.writeEnumValue("retentionTrigger", this.getRetentionTrigger());
    }
    /**
     * Sets the actionAfterRetentionPeriod property value. Specifies the action to take on a document with this label applied during the retention period. The possible values are: none, delete, startDispositionReview, unknownFutureValue.
     * @param value Value to set for the actionAfterRetentionPeriod property.
     * @return a void
     */
    public void setActionAfterRetentionPeriod(@javax.annotation.Nullable final ActionAfterRetentionPeriod value) {
        this._actionAfterRetentionPeriod = value;
    }
    /**
     * Sets the behaviorDuringRetentionPeriod property value. Specifies how the behavior of a document with this label should be during the retention period. The possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue.
     * @param value Value to set for the behaviorDuringRetentionPeriod property.
     * @return a void
     */
    public void setBehaviorDuringRetentionPeriod(@javax.annotation.Nullable final BehaviorDuringRetentionPeriod value) {
        this._behaviorDuringRetentionPeriod = value;
    }
    /**
     * Sets the createdBy property value. Represents the user who created the retentionLabel.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Represents the date and time in which the retentionLabel is created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the defaultRecordBehavior property value. Specifies the locked or unlocked state of a record label when it is created.The possible values are: startLocked, startUnlocked, unknownFutureValue.
     * @param value Value to set for the defaultRecordBehavior property.
     * @return a void
     */
    public void setDefaultRecordBehavior(@javax.annotation.Nullable final DefaultRecordBehavior value) {
        this._defaultRecordBehavior = value;
    }
    /**
     * Sets the descriptionForAdmins property value. Provides label information for the admin. Optional.
     * @param value Value to set for the descriptionForAdmins property.
     * @return a void
     */
    public void setDescriptionForAdmins(@javax.annotation.Nullable final String value) {
        this._descriptionForAdmins = value;
    }
    /**
     * Sets the descriptionForUsers property value. Provides the label information for the user. Optional.
     * @param value Value to set for the descriptionForUsers property.
     * @return a void
     */
    public void setDescriptionForUsers(@javax.annotation.Nullable final String value) {
        this._descriptionForUsers = value;
    }
    /**
     * Sets the displayName property value. Unique string that defines a label name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the dispositionReviewStages property value. Review stages during which reviewers are notified to determine whether a document must be deleted or retained.
     * @param value Value to set for the dispositionReviewStages property.
     * @return a void
     */
    public void setDispositionReviewStages(@javax.annotation.Nullable final java.util.List<DispositionReviewStage> value) {
        this._dispositionReviewStages = value;
    }
    /**
     * Sets the isInUse property value. Specifies whether the label is currently being used.
     * @param value Value to set for the isInUse property.
     * @return a void
     */
    public void setIsInUse(@javax.annotation.Nullable final Boolean value) {
        this._isInUse = value;
    }
    /**
     * Sets the labelToBeApplied property value. Specifies the replacement label to be applied automatically after the retention period of the current label ends.
     * @param value Value to set for the labelToBeApplied property.
     * @return a void
     */
    public void setLabelToBeApplied(@javax.annotation.Nullable final String value) {
        this._labelToBeApplied = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the retentionLabel.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The latest date time when the retentionLabel was modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the retentionDuration property value. Specifies the number of days to retain the content.
     * @param value Value to set for the retentionDuration property.
     * @return a void
     */
    public void setRetentionDuration(@javax.annotation.Nullable final RetentionDuration value) {
        this._retentionDuration = value;
    }
    /**
     * Sets the retentionEventType property value. The retentionEventType property
     * @param value Value to set for the retentionEventType property.
     * @return a void
     */
    public void setRetentionEventType(@javax.annotation.Nullable final RetentionEventType value) {
        this._retentionEventType = value;
    }
    /**
     * Sets the retentionTrigger property value. Specifies whether the retention duration is calculated from the content creation date, labeled date, or last modification date. The possible values are: dateLabeled, dateCreated, dateModified, dateOfEvent, unknownFutureValue.
     * @param value Value to set for the retentionTrigger property.
     * @return a void
     */
    public void setRetentionTrigger(@javax.annotation.Nullable final RetentionTrigger value) {
        this._retentionTrigger = value;
    }
}
