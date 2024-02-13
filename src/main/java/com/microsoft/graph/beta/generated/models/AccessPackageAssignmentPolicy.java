package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageAssignmentPolicy} and sets the default values.
     */
    public AccessPackageAssignmentPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageAssignmentPolicy}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentPolicy();
    }
    /**
     * Gets the accessPackage property value. The access package with this policy. Read-only. Nullable. Supports $expand.
     * @return a {@link AccessPackage}
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.backingStore.get("accessPackage");
    }
    /**
     * Gets the accessPackageCatalog property value. The accessPackageCatalog property
     * @return a {@link AccessPackageCatalog}
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getAccessPackageCatalog() {
        return this.backingStore.get("accessPackageCatalog");
    }
    /**
     * Gets the accessPackageId property value. Identifier of the access package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageId() {
        return this.backingStore.get("accessPackageId");
    }
    /**
     * Gets the accessReviewSettings property value. Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews aren't required.
     * @return a {@link AssignmentReviewSettings}
     */
    @jakarta.annotation.Nullable
    public AssignmentReviewSettings getAccessReviewSettings() {
        return this.backingStore.get("accessReviewSettings");
    }
    /**
     * Gets the canExtend property value. Indicates whether a user can extend the access package assignment duration after approval.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanExtend() {
        return this.backingStore.get("canExtend");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customExtensionHandlers property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a {@link java.util.List<CustomExtensionHandler>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionHandler> getCustomExtensionHandlers() {
        return this.backingStore.get("customExtensionHandlers");
    }
    /**
     * Gets the customExtensionStageSettings property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a {@link java.util.List<CustomExtensionStageSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionStageSetting> getCustomExtensionStageSettings() {
        return this.backingStore.get("customExtensionStageSettings");
    }
    /**
     * Gets the description property value. The description of the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the policy. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the durationInDays property value. The number of days in which assignments from this policy last until they're expired.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.backingStore.get("durationInDays");
    }
    /**
     * Gets the expirationDateTime property value. The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageCatalog", (n) -> { this.setAccessPackageCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageId", (n) -> { this.setAccessPackageId(n.getStringValue()); });
        deserializerMap.put("accessReviewSettings", (n) -> { this.setAccessReviewSettings(n.getObjectValue(AssignmentReviewSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("canExtend", (n) -> { this.setCanExtend(n.getBooleanValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customExtensionHandlers", (n) -> { this.setCustomExtensionHandlers(n.getCollectionOfObjectValues(CustomExtensionHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtensionStageSettings", (n) -> { this.setCustomExtensionStageSettings(n.getCollectionOfObjectValues(CustomExtensionStageSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("requestApprovalSettings", (n) -> { this.setRequestApprovalSettings(n.getObjectValue(ApprovalSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("requestorSettings", (n) -> { this.setRequestorSettings(n.getObjectValue(RequestorSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiableCredentialSettings", (n) -> { this.setVerifiableCredentialSettings(n.getObjectValue(VerifiableCredentialSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedBy property value. The modifiedBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.backingStore.get("modifiedBy");
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the questions property value. Questions that are posed to the  requestor.
     * @return a {@link java.util.List<AccessPackageQuestion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.backingStore.get("questions");
    }
    /**
     * Gets the requestApprovalSettings property value. Who must approve requests for access package in this policy.
     * @return a {@link ApprovalSettings}
     */
    @jakarta.annotation.Nullable
    public ApprovalSettings getRequestApprovalSettings() {
        return this.backingStore.get("requestApprovalSettings");
    }
    /**
     * Gets the requestorSettings property value. Who can request this access package from this policy.
     * @return a {@link RequestorSettings}
     */
    @jakarta.annotation.Nullable
    public RequestorSettings getRequestorSettings() {
        return this.backingStore.get("requestorSettings");
    }
    /**
     * Gets the verifiableCredentialSettings property value. Settings for verifiable credentials set up through the Microsoft Entra Verified I D service. These settings represent the verifiable credentials that a requestor of an access package in this policy can present to be assigned the access package.
     * @return a {@link VerifiableCredentialSettings}
     */
    @jakarta.annotation.Nullable
    public VerifiableCredentialSettings getVerifiableCredentialSettings() {
        return this.backingStore.get("verifiableCredentialSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("accessPackageCatalog", this.getAccessPackageCatalog());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
        writer.writeObjectValue("accessReviewSettings", this.getAccessReviewSettings());
        writer.writeBooleanValue("canExtend", this.getCanExtend());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionHandlers", this.getCustomExtensionHandlers());
        writer.writeCollectionOfObjectValues("customExtensionStageSettings", this.getCustomExtensionStageSettings());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeObjectValue("requestApprovalSettings", this.getRequestApprovalSettings());
        writer.writeObjectValue("requestorSettings", this.getRequestorSettings());
        writer.writeObjectValue("verifiableCredentialSettings", this.getVerifiableCredentialSettings());
    }
    /**
     * Sets the accessPackage property value. The access package with this policy. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.backingStore.set("accessPackage", value);
    }
    /**
     * Sets the accessPackageCatalog property value. The accessPackageCatalog property
     * @param value Value to set for the accessPackageCatalog property.
     */
    public void setAccessPackageCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.backingStore.set("accessPackageCatalog", value);
    }
    /**
     * Sets the accessPackageId property value. Identifier of the access package.
     * @param value Value to set for the accessPackageId property.
     */
    public void setAccessPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageId", value);
    }
    /**
     * Sets the accessReviewSettings property value. Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews aren't required.
     * @param value Value to set for the accessReviewSettings property.
     */
    public void setAccessReviewSettings(@jakarta.annotation.Nullable final AssignmentReviewSettings value) {
        this.backingStore.set("accessReviewSettings", value);
    }
    /**
     * Sets the canExtend property value. Indicates whether a user can extend the access package assignment duration after approval.
     * @param value Value to set for the canExtend property.
     */
    public void setCanExtend(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canExtend", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customExtensionHandlers property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param value Value to set for the customExtensionHandlers property.
     */
    public void setCustomExtensionHandlers(@jakarta.annotation.Nullable final java.util.List<CustomExtensionHandler> value) {
        this.backingStore.set("customExtensionHandlers", value);
    }
    /**
     * Sets the customExtensionStageSettings property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param value Value to set for the customExtensionStageSettings property.
     */
    public void setCustomExtensionStageSettings(@jakarta.annotation.Nullable final java.util.List<CustomExtensionStageSetting> value) {
        this.backingStore.set("customExtensionStageSettings", value);
    }
    /**
     * Sets the description property value. The description of the policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the policy. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the durationInDays property value. The number of days in which assignments from this policy last until they're expired.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("durationInDays", value);
    }
    /**
     * Sets the expirationDateTime property value. The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the modifiedBy property value. The modifiedBy property
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("modifiedBy", value);
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the questions property value. Questions that are posed to the  requestor.
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.backingStore.set("questions", value);
    }
    /**
     * Sets the requestApprovalSettings property value. Who must approve requests for access package in this policy.
     * @param value Value to set for the requestApprovalSettings property.
     */
    public void setRequestApprovalSettings(@jakarta.annotation.Nullable final ApprovalSettings value) {
        this.backingStore.set("requestApprovalSettings", value);
    }
    /**
     * Sets the requestorSettings property value. Who can request this access package from this policy.
     * @param value Value to set for the requestorSettings property.
     */
    public void setRequestorSettings(@jakarta.annotation.Nullable final RequestorSettings value) {
        this.backingStore.set("requestorSettings", value);
    }
    /**
     * Sets the verifiableCredentialSettings property value. Settings for verifiable credentials set up through the Microsoft Entra Verified I D service. These settings represent the verifiable credentials that a requestor of an access package in this policy can present to be assigned the access package.
     * @param value Value to set for the verifiableCredentialSettings property.
     */
    public void setVerifiableCredentialSettings(@jakarta.annotation.Nullable final VerifiableCredentialSettings value) {
        this.backingStore.set("verifiableCredentialSettings", value);
    }
}
